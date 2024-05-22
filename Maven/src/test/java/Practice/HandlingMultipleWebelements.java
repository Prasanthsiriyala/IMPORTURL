package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleWebelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		int count=0;
		driver.get("www.flipkart.com/");
		driver.manage().window().maximize();
		List<WebElement> allLinks =driver.findElements(By.xpath("//a"));
		for(WebElement link : allLinks) {
			Thread.sleep(1000);
			System.out.println(link.getAttribute("href"));
			count++;
		}
		System.out.println(count);

	}

}
