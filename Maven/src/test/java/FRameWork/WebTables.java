package FRameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://web-locators-static-site-qa.vercel.app/Web%20Table");
		driver.manage().window().maximize();
		List<WebElement> columns =driver.findElements(By.xpath("//thead/tr/th "));
		int inputColumn =-1;
		int outputColumn = -1;
		for(int i=0; i<columns.size(); i++) {
			if(columns.get(i).getText().equals("Heel To Toe (in CMs)")) { 
			    inputColumn = i+1;
			    System.out.println("input column:"+inputColumn);
				
			}
				if(columns.get(i).getText().equals("Size (USA Standards)")) { 
				    outputColumn = i+1;
				    System.out.println("output column:"+outputColumn );
				}
			}
		List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr/td["+inputColumn+"]"));
		int inputrow =-1;
		System.out.println(rows.size());
		for(int i=0; i<rows.size(); i++) {
			if(rows.get(i).getText().equals("11.5")) {
				inputrow =i+1;
				System.out.println("input row:"+inputrow );
				break;
			}
			
			
			
		}
		System.out.println("found row number");
		
		System.out.println(driver.findElement(By.xpath("//tbody/tr["+inputrow+"]/td["+outputColumn+"]")).getText());
		System.out.println("found result");
		
	}
}


