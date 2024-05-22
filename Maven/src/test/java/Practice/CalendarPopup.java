package Practice;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalendarPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		act.moveByOffset(20, 30).click().perform();
		driver.findElement(By.xpath("//p[@class=\"sc-jlwm9r-1 ewETUe\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Departure\"]")).click();
		
		// here i found the static webelement(month) and then dynamic webelement(date) and then moved to common class to get the entire path//
		//driver.findElement(By.xpath("//div[text()=\"April 2024\"]/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()=\"30\"]")).click();
		
		String month = "April 2024";
		String date = "25";
		driver.findElement(By.xpath("//div[text()=\""+month+"\"]/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()=\""+date+"\"]")).click();
		
		driver.findElement(By.xpath("//span[text()=\"Done\"]")).click();

}
}
