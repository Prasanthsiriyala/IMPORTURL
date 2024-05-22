package FRameWork;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountOfIphones {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("iphone");
		search.submit();
		String page = "Page 1 of 21";
		String number =page.split("of ")[1];
		int count;
		int pages = Integer.parseInt(number);
		for(int i=0; i<pages; i++) {
			 count =i+1;
			System.out.println("page: "+count);
		List<WebElement> Iphones =driver.findElements(By.xpath("//div[contains(text(),\"128 GB\") and contains(text(),\"iPhone\")]"));
		for(WebElement phone : Iphones) {
			System.out.println(phone.getText());
		}
		//driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
		}
		count =0;
		Thread.sleep(2000);
		
		

	}

}
