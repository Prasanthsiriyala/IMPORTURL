package FRameWork;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

    public static void main(String[] args) throws Throwable {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
 
    		for (int i = 0; i < 5; i++) {
    			driver.get(
    					"https://crio-qkart-frontend-qa.vercel.app/");
    			takeScreenshot(driver, "info", "screenshot_number_" + Integer.toString(i));
    			Thread.sleep(5000);
    		}

    	}

    public static void takeScreenshot(WebDriver driver, String screenshotType, String description) {
		try {
			File theDir = new File("/screenshots");
			if (!theDir.exists()) {
				theDir.mkdirs();
			}

			String timestamp = String.valueOf(java.time.LocalDateTime.now());
			String fileName = String.format("screenshot_%s_%s_%s.png", timestamp, screenshotType, description);

			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

			File DestFile = new File("screenshots/" + fileName);
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
