package Practice;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarPopU {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			 //System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe/");
			 WebDriver driver = new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
			 driver.get("https://jqueryui.com/datepicker/");
			 driver.manage().window().maximize();
			 System.out.println(driver.getTitle());
			 driver.switchTo().frame(0);
			 
			 driver.findElement(By.id("datepicker")).click();
			 //driver.findElement(By.xpath("//a[contains(@class,\"ui-state-default ui-state-highlight\")]")).click();
			 
			 Calendar cal = Calendar.getInstance();
			 Date date =cal.getTime();
			 SimpleDateFormat SDF = new SimpleDateFormat("MM/dd/YYYY");
			 String modDate=SDF.format(date);
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@class=\"hasDatepicker\"]")).sendKeys(modDate,Keys.ESCAPE);
			 Thread.sleep(1000);
			 
			 
			 
		}

	}

