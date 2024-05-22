package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement name=driver.findElement(By.xpath("//button[@name=\"login\"]"));
		System.out.println(name.getCssValue("font-size"));
		WebElement name1=driver.findElement(By.xpath("//a[contains(text(),\"Create n\")]"));
		System.out.println(name1.getCssValue("font-size"));
		System.out.println(name1.getCssValue("colour"));
		
	}

}
