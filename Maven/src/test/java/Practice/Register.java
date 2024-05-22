package Practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class Register {

	public static void main(String[] args) {
		//ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("--disable-notificatios");
		WebDriver driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://demo.automationtesting.in/Register.html");
	   driver.manage().window().maximize();
	   WebElement username=driver.findElement(By.cssSelector("input[placeholder=\"First Name\"]"));
	   username.sendKeys("prasanth",Keys.TAB,"sai",Keys.TAB,"Bhimavaram",Keys.TAB,"prasanth@gmail.com",Keys.TAB,"9065344423");
	   WebElement male=driver.findElement(By.xpath("//input[@value=\"Male\"]"));
	   if(male.isEnabled()) {
		   if(!male.isSelected()) {
			   male.click();
		   }
	   }
	   driver.findElement(By.id("checkbox1")).click();
	   driver.findElement(By.id("checkbox2")).click();
	   
	   WebElement skill=driver.findElement(By.id("Skills"));
	   
	   Select sk = new Select(skill);
	   sk.selectByValue("MySQL");
	   
	   driver.findElement(By.xpath("//option[text()=\"India\"]")).click();
	   
	   WebElement year =driver.findElement(By.id("yearbox"));
	   Select yr = new Select(year);
	   yr.selectByVisibleText("1998");
	   WebElement month = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
	   Select mn = new Select(month);
	   mn.selectByValue("August");
	   WebElement date = driver.findElement(By.xpath("//select[@placeholder=\"Day\"]"));
	   Select dt = new Select(date);
	   dt.selectByValue("19");
	   
	   driver.findElement(By.id("firstpassword")).sendKeys("Demo@19",Keys.TAB,"Demo@19");
	   

	   
	   
	   
	   
	  


	}

}
