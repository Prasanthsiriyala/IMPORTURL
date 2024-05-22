package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://web-locators-static-site-qa.vercel.app/Radio");
		//WebElement option =driver.findElement(By.xpath("//div[@class=\"RadioScreen_section1\"]/fieldset/div/div/div/p[text()=\"Female\"]/../div/label/span/span/input"));
		WebElement option = driver.findElement(By.xpath("//input[@value=\"female\"]"));
		if(option.isSelected()) {
			System.out.println(option.getText()+"is selected");
		}
		else {
			System.out.println(option.getText()+"is not selected");
			option.click();
			System.out.println(option.getAttribute("type"));
			System.out.println(option.getAttribute("Vlaue"));
		}
		
		//WebElement Rating =driver.findElement(By.xpath("//div[@class=\"RadioScreen_section2\"]/fieldset/div/div/div/p[text()=\"Very Good\"]/../div/label/span/span/input"));
		WebElement Rating = driver.findElement(By.xpath("//input[@value=\"veryGood\"]"));
		Rating.click();
		WebElement pan =driver.findElement(By.xpath("//input[@value=\"yes\"]"));
		boolean enabled = pan.isEnabled();
		System.out.println(pan.getText()+"is enabled"+enabled);
		pan.click();
		WebElement pan1 =driver.findElement(By.xpath("//input[@value=\"no\"]"));
		boolean result =pan1.isDisplayed();
		System.out.println(pan1.getText()+"is displayed"+result);
		
		
	}

}
