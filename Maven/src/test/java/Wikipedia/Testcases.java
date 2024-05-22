package Wikipedia;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Testcases {
	
	public void TestCase01(WebDriver driver) {
		System.out.println("Start test case 01");
		NavigateToUrl url = new NavigateToUrl();
		String title = url.navigate(driver);
		if(title.toLowerCase().contains("wikipedia")) {
			System.out.println("test case passed");
		}
			else {
			System.out.println("test case failed");
			}
		System.out.println("End Test case 01");
		}
	
	public void TestCase02(WebDriver driver) throws Throwable {
		System.out.println("Start test case 02");
		NavigateToUrl url = new NavigateToUrl();
		String title =url.navigate(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement header =driver.findElement(By.xpath("//div[@class=\"central-textlogo\"]//span[contains(text(),\"Wikipedia\")]"));
		System.out.println(header.getText());
		js.executeScript("arguments[0].scrollIntoView[true];",header);
		WebElement footer = driver.findElement(By.xpath("//footer[@class=\"footer\"]//p//a[text()=\"Terms of Use\"]"));
		System.out.println(footer.getText());
		js.executeScript("arguments[0].scrollIntoView[false];",footer);
		WebElement footer1= driver.findElement(By.xpath("//footer[@class=\"footer\"]//p//a[text()=\"Privacy Policy\"]"));
		System.out.println(footer1.getText());
		js.executeScript("arguments[0].scrollIntoView[false];",footer1);
		if(header.getText().equals("Wikipedia") && footer.getText().equals("Terms of Use") && footer1.getText().equals("Privacy Policy")) {
			System.out.println("test case passed");
		}
		else {
			System.out.println("test case failed");
		}
		System.out.println("end test case 02");
	}
	public void TestCase03(WebDriver driver) throws Throwable {
		System.out.println("Start test case 03");
		NavigateToUrl url = new NavigateToUrl();
		String title = url.navigate(driver);
		driver.findElement(By.id("searchInput")).sendKeys("apple");
		Thread.sleep(1000);
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class=\"suggestions-dropdown\"]//a//h3"));
		for(WebElement ele :elements ) {
			System.out.println(ele.getText());
			if(ele.getText().toLowerCase().contains("inc")) {
				System.out.println(ele.getText());
				ele.click();
				break;
			}
		}
		WebElement founder =driver.findElement(By.xpath("//table[@class=\"infobox vcard\"]//tr/th[text()=\"Founders\"]/..//a[text()=\"Steve Jobs\"]"));
		if(founder.getText().equals("Steve Jobs")) {
		System.out.println("Test case passed");
			}
		else {
			System.out.println("Test case failed");
		}
		System.out.println("End Test case 03");
	}
		public void TestCase04(WebDriver driver) throws Throwable {
			System.out.println("Start test case 04");
			NavigateToUrl url = new NavigateToUrl();
			String title = url.navigate(driver);
			driver.findElement(By.id("searchInput")).sendKeys("Microsoft");
			Thread.sleep(1000);
			List<WebElement> results =driver.findElements(By.xpath("//div[@class=\"suggestions-dropdown\"]//a//h3"));
			for(WebElement r : results) {
				System.out.println(r.getText());
				if(r.getText().equals("Microsoft")) {
					r.click();
					break;
				}
			}
			Actions act = new Actions(driver);
			WebElement microsoft = driver.findElement(By.xpath("//table[@class=\"infobox vcard\"]//tr/th[text()=\"Founders\"]/..//a[text()=\"Bill Gates\"]"));
			//microsoft.click();
			act.moveToElement(microsoft).click().perform();
			Thread.sleep(500);
			String url1 =driver.getCurrentUrl();
			if(url1.contains("Bill_Gates")) {
			System.out.println("Test case passed");
				}
				else {
					System.out.println("Test case failed");
				}
			System.out.println("End Test case 04");
		
	}
		public void TestCase05(WebDriver driver) throws Throwable {
			System.out.println("Start test case 05");
			NavigateToUrl url = new NavigateToUrl();
			String title = url.navigate(driver);
			driver.findElement(By.xpath("//nav[@class=\"central-featured\"]//a/strong[text()=\"English\"]")).click();
			driver.findElement(By.id("vector-main-menu-dropdown")).click();
			driver.findElement(By.xpath("//ul[@class=\"vector-menu-content-list\"]//li/a/span[text()=\"About Wikipedia\"]")).click();
			if(driver.getCurrentUrl().toLowerCase().contains("about")) {
				System.out.println("Test case passed");
					}
					else {
						System.out.println("Test case failed");
					}
				System.out.println("Test case 05 passed");
				
			}
			
	}



