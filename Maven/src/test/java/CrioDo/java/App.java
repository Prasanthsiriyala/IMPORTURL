package CrioDo.java;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {

	public static void main(String[] args) throws Throwable {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		TestCases tc = new TestCases();
		
		tc.Testcase01(driver);
		tc.Testcase02(driver);
		tc.Testcase03(driver);
		tc.EndTests(driver);

	}

}
