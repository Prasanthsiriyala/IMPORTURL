package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://web-locators-static-site-qa.vercel.app/Checkbox");
		driver.get("");
		driver.manage().window().maximize();
		WebElement element =driver.findElement(By.xpath("//div[@class=\"Checkbox_section1\"]/div/p[text()=\"DSA\"]/../div/div/span/input"));
		element.click();
		System.out.println(element.getAttribute("type"));
		System.out.println(element.getAttribute("value"));
		WebElement option = driver.findElement(By.xpath("//div[@class=\"Checkbox_section2\"]/div/p[text()=\"Android\"]/../div/div/span/input"));
		option.click();
		List<WebElement> options = driver.findElements(By.xpath("//div[@class=\"Checkbox_section3\"]/div/div/div/span/input[@type=\"checkbox\"]"));
		for(WebElement option1 : options ) {
			Thread.sleep(500);
			option1.click();
			Thread.sleep(500);
		    String Result=option1.getText();
		    System.out.println(Result);
			/*if(option1.isEnabled()) {
				System.out.println(option1.getText() +"is enabled");
				Thread.sleep(500);
				if(option1.getText().equals("Wedneday") || option1.getText().equals("Thursday")) {
					option1.click();
				}
					else {
						option1.getAttribute("type");
					}
			}
				}*/
			}
		}
}
	

		
////div[@class="Checkbox_section1"]/div/p/../div/div/span/input

////div[@class=\"Checkbox_section1\"]/div/p

//////div[@id="icp-language-settings"]/div/div/label/span//span[text()="ES"]/../../../input



