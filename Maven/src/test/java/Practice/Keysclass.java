package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Keysclass {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		//driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement username =driver.findElement(By.id("user-name"));//.sendKeys("standarduser",Keys.TAB,"secret_sauce",Keys.ENTER);
		username.sendKeys("standard_user",Keys.CONTROL,"a");
		username.sendKeys(Keys.CONTROL,"c");
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL,"v",Keys.ENTER);
		
		
		//driver.findElement(By.name("q")).sendKeys("mobiles",Keys.);
		
		Thread.sleep(2000);
		driver.close();

	}

}				