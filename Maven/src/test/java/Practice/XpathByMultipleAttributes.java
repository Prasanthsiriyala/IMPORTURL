package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathByMultipleAttributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@name=\"field-keywords\" and @placeholder=\"Search Amazon.in\"]")).sendKeys("nike");
		//driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).submit();
		WebElement electronics = driver.findElement(By.xpath("//a[@data-csa-c-type=\"link\"  and @data-csa-c-slot-id=\"nav_cs_6\"]"));
		
		FluentWait fwait = new FluentWait(driver);
		fwait.pollingEvery(Duration.ofSeconds(1));
		fwait.withTimeout(Duration.ofSeconds(10));
		fwait.until(ExpectedConditions.elementToBeClickable(electronics));
		electronics.click();
		
		
		
		//we have used xpath by multiple attribute value to get uniqueness for electronice tab in amazon//

	}

}
