package Practice;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args)throws InterruptedException{
	   
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]")).sendKeys("phones",Keys.ENTER);
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[@type=\"submit\" or @fdprocessedid=\"kgncqp\"]")).click();
		Thread.sleep(1000);
		List<WebElement>  allNames=driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
		List<WebElement> allPrices=driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
		for(int i=0 ; i<allNames.size(); i++) {
			for(int j=i; j<allPrices.size(); j++) {
				if(i==j) {
					System.out.println(allNames.get(i).getText()+" "+ allPrices.get(j).getText());
				}
				
			}
				
			}
		//}
	}
}
