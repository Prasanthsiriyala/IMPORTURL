package FRameWork;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleSelectDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(" https://web-locators-static-site-qa.vercel.app/Dropdown");
		WebElement dropdown1 = driver.findElement(By.xpath("//div[@class=\"Dropdown_section1\"]//select[@class=\"dropdown\"]"));
		Select sec1 = new Select(dropdown1);
		sec1.selectByVisibleText("Australia");
		WebElement dropdown2 = driver.findElement(By.xpath("//div[@class=\"Dropdown_section2\"]//select[@class=\"dropdown\"]"));
		Select sec2 = new Select(dropdown2);
		//sec2.selectByVisibleText("Kelly Snyder");
		List<WebElement> lastoption =sec2.getOptions();
		int index = lastoption.size()-1;
		sec2.selectByIndex(index);
		WebElement dropdown3 = driver.findElement(By.xpath("//div[@class=\"Dropdown_section3\"]//select[@class=\"dropdown\"]"));
		
		Select sec3 = new Select(dropdown3);
		boolean multiple = sec3.isMultiple();
		System.out.println("dropdwn multiple"+multiple);
		WebElement option =sec3.getFirstSelectedOption();
		System.out.println(option.getText());
		
		List<WebElement> webelement = sec3.getOptions();
		for(WebElement opt : webelement) {
			System.out.println(opt.getText());
		}
		
		

	}

}
