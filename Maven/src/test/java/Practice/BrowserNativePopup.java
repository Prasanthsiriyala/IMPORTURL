package Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserNativePopup {

	public static void main(String[] args) {
		
	    ChromeOptions opt = new ChromeOptions();
	    opt.addArguments("--disable-notifications");
	   // opt.addArguments("--incognito");// if you want to open your browser in incognito mode then you can use this//
	    WebDriver driver = new ChromeDriver(opt);
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();

	}

}
