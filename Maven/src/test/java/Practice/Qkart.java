package Practice;

import java.io.IOException;
import java.time.Duration;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Qkart {

	public static void main(String[] args) throws InterruptedException,IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://crio-qkart-frontend-qa.vercel.app/login")
          driver.get("https://crio-qkart-frontend-qa.vercel.app/");
          driver.manage().window().maximize();
          try {
          driver.findElement(By.xpath("//button[text()=\"Login\"]"));
          driver.navigate().refresh();
          driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();
          }
          catch(RuntimeException e) {
          System.out.println(e.toString());
          }
          
		System.out.println("current url:"+driver.getCurrentUrl());
		
		WebElement username = driver.findElement(By.id("username"));
		//Dimension d=username.getSize();
		System.out.println(username.getSize().getHeight());
		System.out.println(username.getSize().getWidth());
		Point p=username.getLocation();
	       System.out.println(p.getX());
	       System.out.println(p.getY());
	       System.out.println(username.getAttribute("value"));
		System.out.println(username.toString());
		username.sendKeys("testuser");
		WebElement password = driver.findElement(By.id("password"));
		System.out.println(password.getAttribute("placeholder"));
	    String color=password.getCssValue("color");
	    System.out.print(color);
		password.sendKeys("testuser");
		//WebElement login =driver.findElement(By.cssSelector("//button[text()=\"Login to QKart\"]"));
		WebElement login = driver.findElement(By.cssSelector("button[type=\"button\"]"));
		//driver.navigate().refresh();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
		
		
	       WebElement SearchInputbox = driver.findElement( new ByChained(By.className("css-11zsshc"),By.tagName("input")));
	       SearchInputbox.sendKeys("watch");
	       Thread.sleep(5000);
	       List<WebElement> elements = driver.findElements(By.cssSelector("div[class=\"MuiCardContent-root css-1qw96cp\"]"));
	       int count=0;
	      for(WebElement ele : elements) {
	    	  
	    	  count++;
	    	  System.out.println(ele.getText());
	      }
	      System.out.print(count);
			
           
	      // Thread.sleep(5000); 
	      
}

}
