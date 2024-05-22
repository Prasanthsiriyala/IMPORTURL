package Practice;
import org.openqa.selenium.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException{
	  WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://the-internet.herokuapp.com/upload");
	  driver.manage().window().maximize();
	  WebElement file=driver.findElement(By.xpath("//input[@id=\"file-upload\"]"));
	   Thread.sleep(1000);

	  
	 file.sendKeys("C:\\Users\\prasa\\OneDrive\\Documents\\Resumes\\Email.txt");
	   Thread.sleep(1000);

	  
	  driver.findElement(By.xpath("//input[@id=\"file-submit\"]")).click();
	  Thread.sleep(1000);
	  
	  driver.close();

	}

}
