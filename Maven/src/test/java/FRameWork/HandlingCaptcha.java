package FRameWork;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.Tesseract1;

public class HandlingCaptcha {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//a[text()=\" LOGIN \"] ")).click();
		WebElement img =driver.findElement(By.className("captcha-img"));
		
		TakesScreenshot ts = (TakesScreenshot) img;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Captcha.png");
		FileHandler.copy(src, dest);
		
		Tesseract tes = new Tesseract();
		tes.setDatapath("C:\\Users\\prasa\\Downloads\\Tess4J-3.4.8-src\\Tess4J\\tessdata");
		String captchaimg = tes.doOCR(dest);
		String finalCaptcha =captchaimg.replace(" ","");
		
		driver.findElement(By.name("captcha")).sendKeys(finalCaptcha);
		
		
		
		

	}

}
