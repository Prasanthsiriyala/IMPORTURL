package FRameWork;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableShoeSize {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://web-locators-static-site-qa.vercel.app/Web%20Table");
		String Shoesize = "11";
		int inputColumn = -1;
		int outputColumn = -1;
		List<WebElement> headers =driver.findElements(By.xpath("//thead/tr/th"));
		System.out.println("header size"+headers.size());
		for(int i=0; i<headers.size(); i++) {
			if(headers.get(i).getText().equals("Size (Listed in our Website)")){
			inputColumn = i+1;
			System.out.println("input column:"+inputColumn);
			}
			if(headers.get(i).getText().equals("Heel To Toe (in CMs)")){
			 outputColumn = i+1;
			 System.out.println("output Column"+outputColumn);
			}
		}
		driver.findElement((By.xpath("//input[@type=\"radio\" and @name=\"3\"]"))).click();
		List<WebElement> sizes =driver.findElements(By.xpath("//tbody/tr/td["+inputColumn+"]"));
		int row=-1;
		for(int j=0; j<sizes.size(); j++) {
			if(sizes.get(j).getText().equals(Shoesize)){
				row = j+1;
				break;
			}
		}
		System.out.println("row value:"+row);
		driver.findElement(By.xpath("//tbody/tr["+row+"]/td[1]")).click();
		WebElement result = driver.findElement(By.xpath("//tbody/tr["+row+"]/td["+outputColumn+"]"));
		System.out.println("heel to Toe value:"+result.getText());
		
		List<WebElement> data =driver.findElements(By.xpath("//tbody/tr/td"));
		for(int j=0; j<data.size(); j++) {
			System.out.println(data.get(j).getText());
			}
		
		
		
		
	}

}
