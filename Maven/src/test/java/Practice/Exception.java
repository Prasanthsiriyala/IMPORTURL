package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception {

	public static void main(String[] args) throws Throwable {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.bigbasket.com/store/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@placeholder,\"Search\")]")).sendKeys("grapes");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
	}

}
