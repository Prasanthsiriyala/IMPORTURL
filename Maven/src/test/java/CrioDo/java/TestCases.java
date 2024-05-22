package CrioDo.java;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases {
		

	public void Testcase01(WebDriver driver) throws Throwable{
		driver.get("https://www.amazon.com/");
		Thread.sleep(10000);
		String url = driver.getCurrentUrl();
		if(url.contains("amazon")) 
			System.out.println("passed");
		else
			System.out.println("fail");
	}
	public void Testcase02(WebDriver driver) {
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("laptop",Keys.ENTER);
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
		for(WebElement ele : elements) {
			if(ele.getText().contains("laptop")) {
				break;
			}
		}
		System.out.println("Success");
	}
	public void Testcase03(WebDriver driver) {
		Actions act = new Actions(driver);
		WebElement category =driver.findElement(By.id("nav-hamburger-menu"));
		act.moveToElement(category).click().perform();
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		act.moveToElement(electronics).click().perform();
		WebElement office =driver.findElement(By.linkText("Office Electronics"));
		act.moveToElement(office).click().perform();
		String url1 =driver.getCurrentUrl();
		if(url1.contains("electronics")) 
			System.out.println("passed");
		else 
			System.out.println("Fail");
		
	}
	public void EndTests(WebDriver driver) {
		driver.close();
	}

}
