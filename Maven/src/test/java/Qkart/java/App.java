package Qkart.java;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://crio-qkart-frontend-qa.vercel.app/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Testcases tc = new Testcases();
		
		boolean result =tc.testCase01(driver);
		if(result) {
			System.out.println("Testcase 01 passed");
		}
			else {
				System.out.println("failed");
			}
		
	 boolean result1 =tc.testCase02(driver);
		if(result1) {
			System.out.println("Testcase 02 passed");
		}
			else {
				System.out.println("failed");
			}
        
		List<String> expectedTableHeaders = Arrays.asList("Size", "UK/INDIA", "EU", "HEEL TO TOE");
		List<List<String>> expectedTableBody = Arrays.asList(Arrays.asList("6", "6", "40", "9.8"),
                Arrays.asList("7", "7", "41", "10.2"), Arrays.asList("8", "8", "42", "10.6"),
                Arrays.asList("9", "9", "43", "11"), Arrays.asList("10", "10", "44", "11.5"),
                Arrays.asList("11", "11", "45", "12.2"), Arrays.asList("12", "12", "46", "12.6"));
		boolean result2 = tc.testCase03(expectedTableHeaders,expectedTableBody,driver);
		if(result2) {
			System.out.println("Testcase 03 passed");
		}
			else {
				System.out.println("failed");
			}
		
	    boolean result3 =tc.testCase04(driver);
	    if(result3) {
			System.out.println("Testcase 03 passed");
		}
			else {
				System.out.println("failed");
			}
		 

	}

}

