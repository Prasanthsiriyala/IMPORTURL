package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropdownUsingKeysclass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		Thread.sleep(500);
		WebElement DOB=driver.findElement(By.id("day"));
		DOB.click();
		DOB.sendKeys(Keys.ARROW_DOWN);
		DOB.sendKeys(Keys.ARROW_DOWN);
		DOB.sendKeys(Keys.ARROW_DOWN);
		DOB.sendKeys(Keys.ARROW_DOWN);
		DOB.sendKeys(Keys.ARROW_DOWN);
		DOB.sendKeys(Keys.ARROW_DOWN);
		DOB.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);

      WebElement month= driver.findElement(By.id("month"));
      month.click();
      month.sendKeys(Keys.ARROW_UP);
      month.sendKeys(Keys.ARROW_UP);
      Thread.sleep(500);
      
      WebElement year=driver.findElement(By.id("year"));
      year.click();
      year.sendKeys(Keys.ARROW_DOWN);
      year.sendKeys(Keys.ARROW_DOWN);
      year.sendKeys(Keys.ARROW_DOWN);
      year.sendKeys(Keys.ARROW_DOWN);
      year.click();


		

	}

}
