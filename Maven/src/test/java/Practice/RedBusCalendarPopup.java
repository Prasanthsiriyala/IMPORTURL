package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBusCalendarPopup {

	public static void main(String[] args) throws InterruptedException {
	   ChromeOptions opt = new ChromeOptions();
	   opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https:/www.redbus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("date-box")).click();
		
		driver.findElement(By.xpath("//div[text()=\"March\" and text()=\"2024\"]/ancestor::div[@class=\"DatePicker__MainBlock-sc-1x9sb82-1 gTgSRP\"]/descendant::span[text()=\"30\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"Okay\"]"));
		//driver.findElement(By.id("return-box")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()=\"April\" and text()=\"2024\"]/ancestor::div[@class=\"DatePicker__MainBlock-sc-1x9sb82-1 gTgSRP\"]/descendant::span[text()=\"26\"]")).click();
        driver.findElement(By.xpath("//div[text()=\"SEARCH\"]")).click();


	}

}
