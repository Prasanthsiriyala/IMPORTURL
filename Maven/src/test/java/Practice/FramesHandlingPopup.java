package Practice;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesHandlingPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://jqueryui.com/droppable/");
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		// handling frame by using index value
		//driver.switchTo().frame(0);
		//WebElement source=driver.findElement(By.id("draggable"));
		//WebElement target = driver.findElement(By.id("droppable"));
		//Actions act = new Actions(driver);
		//act.clickAndHold(source).release(target).perform();
		//act.dragAndDropBy(source, 0, -700);
		
		
		// Handling Frame by using id 0r name value --(these are attributes of iframe not webelement))
		//driver.switchTo().frame("SingleFrame");
		//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("HELLO");
		
		
	   // Handling Frames by using WebElement//
		WebElement ele =driver.findElement(By.xpath("//iframe[@name=\"SingleFrame\"]"));
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("HELLO");
		WebElement gmail=driver.findElement(By.xpath("//a[text()=\"Gmail\"]"));
		System.out.println(gmail.getText());
		System.out.println(gmail.getTagName());
		
		
		
		//driver.close();
	}

}    
