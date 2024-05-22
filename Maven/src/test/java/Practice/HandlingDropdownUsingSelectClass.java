package Practice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropdownUsingSelectClass {

	//public static void main(String[] args) throws InterruptedException {
	@Test(priority = 3)
	public void HandlingDropdownUsingSelectClass() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		Thread.sleep(500);
		WebElement Dob =driver.findElement(By.id("day"));
		Select s1 = new Select(Dob);
		//s1.selectByIndex(18);
		//s1.selectByValue("19");
		s1.selectByVisibleText("19");
		Thread.sleep(500);
		
		WebElement month= driver.findElement(By.id("month"));
		Select s2  = new Select(month);
		//s2.selectByIndex(7);
		//s2.selectByValue("8");
		s2.selectByVisibleText("Aug");

		Thread.sleep(500);
		
		WebElement year=driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		//s3.selectByIndex(3);
		//s3.selectByValue("1996");
		s3.selectByVisibleText("1996");
		//driver.close();

		
		
		
		

	}

}
