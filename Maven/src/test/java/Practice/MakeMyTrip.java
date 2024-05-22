package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {

	public static void main(String[] args) throws Throwable {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	Actions act = new Actions(driver);
	Thread.sleep(1000);
	act.moveByOffset(20, 30).click().perform();

	
	driver.findElement(By.xpath("//div[@class=\"fareCardItem \"]/descendant::div[text()=\"Doctor\"]")).click();
	

	}

}
