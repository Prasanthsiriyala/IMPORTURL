package Practice;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://www.flipkart.com/");
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		Thread.sleep(500);
		List<WebElement> suggestions =driver.findElements(By.xpath("//div[contains(text(),\"mobiles\")]"));
		for(WebElement element : suggestions) {
			System.out.println(element.getText());
			if(element.getText().contains("5g")) {
				element.click();
				break;
			}
			
		}

	}

}
