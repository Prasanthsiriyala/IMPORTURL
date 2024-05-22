package FRameWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://web-locators-static-site-qa.vercel.app/Calendar");
		//driver.findElement(By.xpath("//div[@class=\"Calendar_section1\"]/div/div//button[@type=\"button\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"Calendar_section2\"]/div/div//button[@type=\"button\"]")).click();
		driver.findElement(By.xpath("//div[@role=\"presentation\"]//button[@type=\"button\"]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement year = driver.findElement(By.xpath("//button[text()=\"1996\"]"));
		
		js.executeScript("arguments[0].scrollIntoView();",year);
		Thread.sleep(1000);
		year.click();
		//Thread.sleep(1000);
		
		WebElement next =driver.findElement(By.xpath("//button[@aria-label=\"Next month\"]"));
		//WebElement prevoius = driver.findElement(By.xpath("//button[@aria-label=\"Previous month\"]"));
		for(int i=1; i<=4; i++) {
			Thread.sleep(500);
			next.click();
			//prevoius.click();
		}
		driver.findElement(By.xpath("//button[text()=\"19\"]")).click();
		}

}
