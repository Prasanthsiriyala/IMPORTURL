package Practice;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTesting {

	public static void main(String[] args) throws Throwable {
		
		Properties p = new Properties();
		p.setProperty("url","https://crio-qkart-frontend-qa.vercel.app/login");
		p.setProperty("username","testuser");
		p.setProperty("password","testuser");
		
		FileOutputStream fos = new FileOutputStream("./properties_File1.properties.txt");
		p.store(fos,"commondata");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileInputStream file = new FileInputStream("./properties_File1.properties.txt");
		// establish connection btwn script and properties file using fileinputstream class present java.io package//
		//FileInputStream file = new FileInputStream("./properties_File1.properties.txt");
		// load the file using properties class present in java.util.package//
		Properties p1 = new Properties();
		p1.load(file);
		String URL=p1.getProperty("url");
		// get the url from the file and store it in refernce/variable//
		String username=p1.getProperty("username");
		// get the username from the file and store it in refernce/variable//
		String password=p1.getProperty("password");
		// get the password from the file and store it in refernce/variable//
		
		driver.get(URL);
		driver.findElement(By.id("username")).sendKeys(username);
		// locate the username element data on it using variable//
		driver.findElement(By.id("password")).sendKeys(password);
		// locate the username element data on it using variable//
		driver.findElement(By.xpath("//button[text()=\"Login to QKart\"]")).click();
		
	}

}
