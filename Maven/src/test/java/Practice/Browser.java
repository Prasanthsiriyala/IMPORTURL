package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
     
	//public static void main(String[] args) throws InterruptedException {
	@Test(priority = 2)
	public void Browser()throws InterruptedException {
     WebDriverManager.chromedriver().setup();
     // launching browser//
     WebDriver driver = new ChromeDriver();
     // launching application //
     driver.get("https://www.makemytrip.com/");
     //driver.get("https://www.flipkart.com/");
     driver.manage().window().maximize();
     Thread.sleep(3000);
     driver.manage().window().minimize();
     Thread.sleep(3000);
     driver.manage().window().fullscreen();
     Thread.sleep(3000);
     String Title=driver.getTitle();//This method will give title of webpage//
     System.out.println(Title);
     String URL = driver.getCurrentUrl();//This method will fetch title of the webpage//
     System.out.println(URL);
     //String source=driver.getPageSource();//This method will fetch source code of the webpage//
     //System.out.println(source);
     driver.close();
     
     }

}
