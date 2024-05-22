package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethod2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement logo=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		if(logo.isDisplayed())// it is used to verify element is displayed or not
			System.out.println("logo is displayed");
		else
			System.out.println("logo is not displayed");
		WebElement button=driver.findElement(By.xpath("//a[@role=\"button\" and @rel=\"async\"]"));
		if(button.isEnabled())//it is used to verify element is enabled or not
			button.click();
		else
			System.out.println("button is not enabled");
		Thread.sleep(1000);

		WebElement checkbox=driver.findElement(By.xpath("//input[@value=\"2\"]"));
		if(checkbox.isSelected())//it is used to verify element is selected or not
			System.out.println("checkbox is selected");
		else
			System.out.println("checkbox is not selected");
		Thread.sleep(1000);
		//getAriaRole();-It is used to know type of element.
		//getAccessibleName();
		//gettagName();
		//getattribute("attribute name");--it is used to get attribute value
		//getDomAttribute()-- it is used to get dom attribute value.

	}

}
