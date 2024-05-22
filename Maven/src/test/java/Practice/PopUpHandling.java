package Practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		// Authentication pop up url//
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		// Alert pop -up url//
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
		Alert alt1=driver.switchTo().alert();
		alt1.sendKeys("welcome");
		System.out.println(alt.getText());
		alt.accept();
		Thread.sleep(2000);		
		driver.close();
		

	}

}
