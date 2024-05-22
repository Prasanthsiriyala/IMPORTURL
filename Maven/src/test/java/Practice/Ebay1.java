package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ebay1 {

	public static void main(String[] args) throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  driver.get("https://www.ebay.com/");
	  Actions act = new Actions(driver);
	  WebElement electronics = driver.findElement(By.linkText("Electronics"));
	  act.moveToElement(electronics).perform();
	  WebElement phones = driver.findElement(By.linkText("Smartphones and accessories"));
	  act.moveToElement(phones).click().perform();
	  driver.findElement(By.linkText("Cell Phones & Smartphones")).click();
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  WebElement filters = driver.findElement(By.xpath("//button[text()=\"All Filters\"]"));
	   //js.executeScript("window.scrollBy(200,300)");
	  js.executeScript("arguments[0].scrollIntoView[false];",filters);
	   filters.click();
	   WebElement condition =driver.findElement(By.xpath("//div[@class=\"x-overlay__wrapper--left\"]/div//span[text()=\"Condition\"]"));
	   act.moveToElement(condition).click().perform();
	   WebElement Newfilter =driver.findElement(By.xpath("//span[@class=\"field\"]/label/span[text()=\"New\"]"));
	   Newfilter.click();
	   //Thread.sleep(1000);

	   WebElement Price=driver.findElement(By.xpath("//div[@class=\"x-overlay__wrapper--left\"]/div//span[text()=\"Price\"]"));
	   
	   //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	   //wait.until(ExpectedConditions.elementToBeClickable(Price));
	   //act.moveToElement(Price).perform();

	    Price.click();
	   WebElement min =driver.findElement(By.xpath("//input[@aria-label=\"Minimum Value, US Dollar\"]"));
	   min.click();
	   Thread.sleep(2000);
	   min.sendKeys("1000");
	   WebElement max = driver.findElement(By.xpath("//input[@aria-label=\"Maximum Value, US Dollar\"]"));
	   max.click();
	   Thread.sleep(2000);
	   max.sendKeys("5000");
	   driver.findElement(By.xpath("//button[text()=\"Apply\"]")).click();
	   System.out.println(driver.getTitle());
	   

	}

}
