package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args)throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.saucedemo.com/v1/");
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebElement loc = driver.findElement(By.cssSelector("[name=\"field-keywords\"]"));//sendKeys("iphone");//--using CSS Selector
		//loc.sendKeys("mobiles");
		//Thread.sleep(1000);
		//loc.clear();
		//loc.sendKeys("laptops");
		//Thread.sleep(1000);
		//loc.submit();
		//driver.findElement(By.xpath("//input[@name=\"field-keywords\"]")).sendKeys("mobile");
		//driver.findElement(By.cssSelector("[id=\"nav-search-submit-button\"]")).click();-- click search button 
	    driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
	    driver.findElement(By.xpath("//a[text()=\"Amazon miniTV\"]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-testid=\"appnavbar_menuitem_comedy\"]")).click();
		//Thread.sleep(1000);
		driver.close();
		
		

	}

}
