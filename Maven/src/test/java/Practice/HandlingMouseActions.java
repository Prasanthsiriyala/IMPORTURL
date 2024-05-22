package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMouseActions {

	public static void main(String[] args) throws InterruptedException {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();
	   //driver.get("https://www.flipkart.com/");
	   //driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	   driver.get("https://www.makemytrip.com/");
	   driver.manage().window().maximize();	   
	   //WebElement ele=driver.findElement(By.xpath("//span[text()=\"Fashion\"]"));
	   //WebElement mobile = driver.findElement(By.linkText("Mobiles"));
	   //WebElement source=driver.findElement(By.id("draggable"));
	   //WebElement target = driver.findElement(By.id("droppable"));
	   
	   
	   Actions act = new Actions(driver);	   
	   Thread.sleep(1000);
	   //act.moveToElement(ele).perform();//--using this we can move to element instead of using mouse to move to that element.
	   //act.contextClick(ele).perform();-- Using this we automate right click option.
	   //act.dragAndDrop(source, target).perform();//-- using this we can drag and drop the element.
	   //act.clickAndHold(source).release(target).perform();--using this we can drag and hold and release it in target.
	   //act.click(mobile).perform();	
	   act.moveByOffset(20, 30).click().perform();
	   //using this method we handle pop ups appear in webpage//
	}

}


