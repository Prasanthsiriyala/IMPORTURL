package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://web-locators-static-site-qa.vercel.app/");
		WebElement mouse =driver.findElement(By.xpath("//p[text()=\"Mouse\"]"));
		Actions act = new Actions(driver);
		act.click(mouse).perform();
		WebElement source =driver.findElement(By.xpath("//div[text()=\"Drag me around\"]"));
		act.dragAndDropBy(source, 100, 100).build().perform();
		Thread.sleep(2000);
		WebElement source1 =driver.findElement(By.xpath("//div[text()=\"Drag me to target\"]"));
		WebElement target =driver.findElement(By.xpath("//div[@class=\"box drop-target react-draggable\"]"));
		act.dragAndDrop(source1, target).build().perform();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Table =driver.findElement(By.xpath("//div[@aria-rowindex=\"NaN\"][1]"));
		js.executeScript("arguments[0].scrollIntoView();",Table);
		WebElement Row1 =driver.findElement(By.xpath("//div[@aria-rowindex=\"NaN\"][3]"));
		WebElement Row2 =driver.findElement(By.xpath("//div[@aria-rowindex=\"NaN\"][4]"));
		Action clickAndHold =act.clickAndHold(Row1).moveToElement(Row2).release().build();
		clickAndHold.perform();
		Thread.sleep(2000);
		
		
	}

}
