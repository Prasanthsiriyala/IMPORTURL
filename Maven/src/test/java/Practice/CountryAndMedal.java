package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CountryAndMedal {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notification");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		driver.findElement(By.xpath("//button[text()=\"Yes, I am happy\"]")).click();
		
		WebElement act= driver.findElement(By.xpath("//span[text()=\"Argentina\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", act);
		
		List<WebElement> elements = driver.findElements(By.xpath("//span[@data-cy=\"country-name\"]"));
		List<WebElement> GoldM = driver.findElements(By.xpath("//div[@title=\"Gold\"]"));
		List<WebElement> SilverM = driver.findElements(By.xpath("//div[@title=\"Silver\"]"));
		List<WebElement> BronzeM = driver.findElements(By.xpath("//div[@title=\"Bronze\"]"));
		List<WebElement> Total = driver.findElements(By.xpath("//div[contains(@data-medal-id,\"total-medals-row\")]"));
		
		for(int i =0 ; i<elements.size(); i++) {
			String country = elements.get(i).getText();
			String GoldMedal = GoldM.get(i).getText();
			String SilverMedal = SilverM.get(i).getText();
			String BronzeMedal = BronzeM.get(i).getText();
			String TotalMedals = Total.get(i).getText();
			
			System.out.println(country+" "+""+GoldMedal+" "+SilverMedal+" "+BronzeMedal+" "+TotalMedals);
		  System.out.println();
	}
		//driver.close();
}
}

//String country="Argentina";
//driver.findElement(By.xpath("//span[text()=\""+country+"\"]/../following-sibling::div[@title=\"Gold\"][1]"));
////span[text()="Armenia"]/../following-sibling::div[@title="Gold"][1]
