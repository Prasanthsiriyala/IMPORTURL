package Practice;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMouseActionsByJavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		WebElement games=driver.findElement(By.linkText("Games"));
            Point loc = games.getLocation();
            System.out.println(loc.getX());
            System.out.println(loc.getY());
		
		
		JavascriptExecutor  js = (JavascriptExecutor) driver;
		
		//for(int i=0; i<=5; i++) {
			//js.executeScript("window.scrollBy(666,786)");
		
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//using this we can scroll completely to the bottom and completely to the up//
		js.executeScript("arguments[0].scrollIntoView[false];",games);
		Thread.sleep(2000);
		games.click();// using this we can scroll to the element without using coordinates//
		Thread.sleep(2000);
		//js.executeScript("window.scrollTo(0,-document.body.scrollHeigth)");
			//games.click();
			//Thread.sleep(2000);
			//driver.close();
			//}
		
		}

}
