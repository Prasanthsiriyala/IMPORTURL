package FRameWork;
import POMrepo.LoginPage;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class POMIMP {

	public static void main(String[] args) throws Throwable {
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
		LoginPage pg1 = new LoginPage(driver);
		pg1.getusernameField().sendKeys(username);
		pg1.getpasswordFiled().sendKeys(password);
		pg1.getloginButton().click();

	}

}
