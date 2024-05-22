package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDownUsingXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		Thread.sleep(500);

		driver.findElement(By.xpath("//select[@id=\"day\"]/option[19]")).click();
		driver.findElement(By.xpath("//select[@id=\"month\"]/option[8]")).click();
		driver.findElement(By.xpath("//option[@value=\"1996\"]")).click();
	}

}
