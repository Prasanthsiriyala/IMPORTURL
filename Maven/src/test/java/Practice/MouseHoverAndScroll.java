package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverAndScroll {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://web-locators-static-site-qa.vercel.app");
		WebElement mouse =driver.findElement(By.xpath("//p[text()=\"Mouse\"]"));
		Actions act = new Actions(driver);
		act.click(mouse).perform();
	  JavascriptExecutor js =(JavascriptExecutor) driver;
		WebElement password =driver.findElement(By.xpath("//div[@class=\"Mouse_section4\"]/input[@type=\"password\"][1]"));
		js.executeScript("arguments[0].scrollIntoView[false];",password );
		act.moveToElement(password).perform();
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
