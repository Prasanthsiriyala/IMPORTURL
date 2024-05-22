package Practice;

import org.openqa.selenium.By;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasket {

	//public static void main(String[] args) throws InterruptedException{
	@Test(priority = 1)
	public void bigBasket()throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/store/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@placeholder,\"Search\")]")).sendKeys("grapes");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
		Thread.sleep(2000);
		String text =driver.findElement(By.xpath("//h3[text()=\"Grapes - Green Sonaka\"]")).getText();
		System.out.println(text);
		driver.close();

	}

}
