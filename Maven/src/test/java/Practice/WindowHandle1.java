package Practice;

import java.time.Duration;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle1 {

	//public static void main(String [] args) {
	@Test
	public void WindowHandle1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		
		Set<String> windows=driver.getWindowHandles();
		
		for(String win : windows) {
			driver.switchTo().window(win);
			String title=driver.getTitle();
			if(title.equals("selenium")) {
				break;
			}
		}
		driver.findElement(By.xpath("//a[text()=\"Read all about it!\"]")).click();
		
         Set<String> windows1=driver.getWindowHandles();
		
		for(String win1 : windows1) {
			driver.switchTo().window(win1);
			String title=driver.getTitle();
			System.out.println(title);
			if(title.contains("WebDriver BiDi")) {
				break;
			}
		}
		driver.findElement(By.xpath("//a[@track-name=\"breadcrumb\"]")).click();
		
		
        Set<String> windows2=driver.getWindowHandles();
		
		for(String win2 : windows2) {
			driver.switchTo().window(win2);
			String title=driver.getTitle();
		if(title.contains("Frames & windows")) {
			//break;
		}
		}
		driver.findElement(By.xpath("//a[text()=\"Home\"]")).click();
		
		//driver.quit();
		driver.close();
	
	

	}
}
