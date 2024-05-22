package Wikipedia;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {

	public static void main(String[] args) throws Throwable {
	    
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Testcases tc = new Testcases();
		tc.TestCase01(driver);
		tc.TestCase02(driver);
		tc.TestCase03(driver);
		tc.TestCase04(driver);
		tc.TestCase05(driver);
	}

	
}
