package FRameWork;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderPOPUP {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://web-locators-static-site-qa.vercel.app/Calendar");
	    driver.findElement(By.xpath("//div[@class=\"Calendar_section2\"]/div/div//button[@type=\"button\"]")).click();
		Calendar cal =Calendar.getInstance();
		Date date =cal.getTime();
		SimpleDateFormat SDF = new SimpleDateFormat("MM/dd/YYYY");
		String modDate = SDF.format(date);
		WebElement currentDate = driver.findElement(By.xpath("//div[@class=\"Calendar_section2\"]//input[@placeholder=\"mm/dd/yyyy\"]"));
		currentDate.sendKeys(modDate);
		currentDate.click();
		
		

	}

}
