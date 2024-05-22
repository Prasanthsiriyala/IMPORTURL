package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.findElement(By.linkText("Nested Frames")).click();
		WebElement topFrame=driver.findElement(By.xpath("//frame[@name=\"frame-top\"]"));
		driver.switchTo().frame(topFrame);
		WebElement leftFrame=driver.findElement(By.xpath("//frame[@name=\"frame-left\"]"));
		driver.switchTo().frame(leftFrame);
		String text=driver.findElement(By.xpath("//body[contains(text(),\"LEFT\")]")).getText();
		
		System.out.println(text);
		
		// Now switch to the immediate parent window we use parentFrame//
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-right");
		String Right=driver.findElement(By.xpath("//body[contains(text(),\"RIGHT\")]")).getText();
		System.out.println(Right);
		
		// switching from right frame to main webPage directly without switching to top-frame using "default-content"//
		
		//driver.switchTo().defaultContent();//switching to web page directly//
		//driver.switchTo().parentFrame();// switching to topFrame first//
		//driver.switchTo().parentFrame();//switching to main page//
		// switch to frame by name attribute//
		driver.switchTo().frame("frame-bottom");
		String bottom=driver.findElement(By.xpath("//body[contains(text(),\"BOTTOM\")]")).getText();
		System.out.println(bottom);
		
		
		
	}

}
