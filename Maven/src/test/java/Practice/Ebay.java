package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ebay {
	@Test
	//public static void main(String[] args) throws Throwable {
	public void mouseActions() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https:www.flipkart.com/");
		Actions act = new Actions(driver);
		WebElement electronics =driver.findElement(By.xpath("//span[text()=\"Electronics\"]"));
		act.moveToElement(electronics).perform();
		WebElement laptop= driver.findElement(By.xpath("//a[text()=\"Laptop and Desktop\"]"));
		act.moveToElement(laptop).perform();
		WebElement desktop =driver.findElement(By.xpath("//a[text()=\"Desktop PCs\"]"));
		act.moveToElement(desktop).click().perform();
	   



}
}
