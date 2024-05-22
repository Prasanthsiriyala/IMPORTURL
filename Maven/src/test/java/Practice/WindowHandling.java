package Practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		WebElement jobs=driver.findElement(By.linkText("Jobs"));
		act.moveToElement(jobs).perform();
		driver.findElement(By.linkText("Jobs by skill")).click();
		driver.findElement(By.xpath("//div[text()=\"Services\"]")).click();
		String window=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		for(String win : windows) {
		
		if(!win.equals(window)) {
	   // switching driver focus on to the child window by window id//
			driver.switchTo().window(win);
		}
	}
		driver.findElement(By.id("rw")).click();
		// switching driver focus to the parent window id//
		driver.switchTo().window(window);
		driver.findElement(By.xpath("//div[text()=\"More\"]")).click();
		
		

}
}
