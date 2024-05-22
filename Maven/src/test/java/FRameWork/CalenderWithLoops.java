package FRameWork;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderWithLoops {

	public static void main(String[] args) throws Throwable {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://web-locators-static-site-qa.vercel.app/Calendar");
			//driver.findElement(By.xpath("//div[@class=\"Calendar_section1\"]/div/div//button[@type=\"button\"]")).click();
			driver.findElement(By.xpath("//div[@class=\"Calendar_section2\"]/div/div//button[@type=\"button\"]")).click();
			driver.findElement(By.xpath("//div[@role=\"presentation\"]//button[@type=\"button\"]")).click();
			List<WebElement> years = driver.findElements(By.xpath("//div[@class=\"PrivatePickersYear-root PrivatePickersYear-modeDesktop css-j9zntq\"]"));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			for(WebElement year : years) {
				if(year.getText().equalsIgnoreCase("1996")) {
					Thread.sleep(500);
					js.executeScript("arguments[0].scrollIntoView();",year);
					year.click();
					break;
				}
			}
			System.out.println("year");
			
			List<WebElement> dates =driver.findElements(By.xpath("//div[@role=\"row\"]/div[@role=\"cell\"]"));
			
			for(WebElement date : dates) {
				//Thread.sleep(500);
				if(date.getText().equalsIgnoreCase("19")) {
					WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
					wait.until(ExpectedConditions.elementToBeClickable(date));
					date.click();
					break;
					
				
				}
				System.out.println(date.getText());
			}
			
			}
	

	}


