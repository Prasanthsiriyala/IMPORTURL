package FRameWork;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://web-locators-static-site-qa.vercel.app/Dropdown");
		driver.findElement(By.xpath("//span[text()=\"Multi Select Dropdown\"]")).click();
		WebElement multiselect1 = driver.findElement(By.xpath("//div[@class=\"DropdownMulti_section1\"]/select[@class=\"multi\"]"));
		Select sec1 = new Select(multiselect1);
		List<WebElement> options =sec1.getAllSelectedOptions();
		
		for(WebElement opt : options) {
			System.out.println(opt.getText());
			}
		
		WebElement option = sec1.getFirstSelectedOption();
		System.out.println(option.getText());
		
		WebElement multiSelect2 = driver.findElement(By.xpath("//div[@class=\"DropdownMulti_section2\"]/select[@class=\"multi\"]"));
		Select sec2 = new Select(multiSelect2);
		List<String>  days = new ArrayList<>();
		days.add("Monday");
		days.add("Friday");
		days.add("Sunday");
		
		for(String day : days) {
			sec2.selectByValue(day);
			System.out.println(day);
		
			
		}
		
	}

}
