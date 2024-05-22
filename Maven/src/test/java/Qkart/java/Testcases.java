package Qkart.java;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Testcases {
	
	public boolean testCase01(WebDriver driver) throws Throwable {
		System.out.println("test case 01 started");
		boolean flag = false;
		WebElement search = driver.findElement(By.name("search"));
		search.clear();
		search.sendKeys("yonex");
		Thread.sleep(3000);
	    List<WebElement> text =driver.findElements(By.xpath("//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 MuiGrid-grid-md-3 css-sycj1h\"]"));
	  //div[@class="MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 css-1msksyp"]
	    System.out.println(text.size());
	    
	    if(text.size()==0) {
	    	return flag;
	    }
	    for(WebElement ele : text) {
		if(ele.getText().contains("YONEX")){
			String title = ele.findElement(By.xpath("//p[contains(text(),\"YONEX\")]")).getText();
			System.out.println(title);
			flag = true;
			break;
		}
	    }
		WebElement search1 = driver.findElement(By.name("search"));
		search1.clear();
		search1.sendKeys("Gesundheit");
		Thread.sleep(1000);
		List<WebElement> invalid = driver.findElements(By.xpath("//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 MuiGrid-grid-md-3 css-sycj1h\"]"));
		System.out.println("size of invalid"+invalid.size());
		if(invalid.size()==0) {
		for(WebElement inv : invalid) {
		WebElement text1 = inv.findElement(By.xpath(" //h4[contains(text(),\"No products found\")]"));
		if(text1.getText().equals("No products found")) {
			flag = true;
		}
		}
		
		}
		return flag;
		
}

	public boolean testCase02(WebDriver driver) throws Throwable {
		System.out.println("test case 02 started");
		boolean flag = false;
		WebElement search = driver.findElement(By.name("search"));
		search.clear();
		search.sendKeys("Running Shoes");
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		List<WebElement> shoes =driver.findElements(By.xpath("//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 MuiGrid-grid-md-3 css-sycj1h\"]"));
		System.out.println(shoes.size());
		for(WebElement shoe : shoes) {
			WebElement size =shoe.findElement(By.xpath("//button[text()=\"Size chart\"]"));
			if(size.isDisplayed()) {
				if(size.getText().equals("SIZE CHART")) {
				size.click();
				act.moveByOffset(20,30).click().perform();
				System.out.println("clicked");
			}
			}
			Thread.sleep(500);
		}
		System.out.println("java script");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for(WebElement shoe : shoes) {
			WebElement dp =shoe.findElement(By.id("uncontrolled-native"));
			js.executeScript("arguments[0].scrollIntoView[true];",dp);
			dp.click();
			if(dp.isDisplayed()) {
				flag = true;
				System.out.println("Clicked");
			}
	}
		return flag;
}
	public static boolean testCase03(List<String>expectedTableHeaders,List<List<String>>expectedTableBody,WebDriver driver) throws InterruptedException {
		System.out.println("test case 03 started");
		Boolean status = false;
		Actions act = new Actions(driver);
        List<WebElement> shoes =driver.findElements(By.xpath("//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 MuiGrid-grid-md-3 css-sycj1h\"]"));
		System.out.println(shoes.size());
		for(WebElement shoe : shoes) {
			WebElement size =shoe.findElement(By.xpath("//button[text()=\"Size chart\"]"));
			size.click();
			List<WebElement> columns =driver.findElements(By.xpath("//table/thead/tr/th"));
	        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr/td"));
	        System.out.println("header size"+columns.size());
			System.out.println("body size"+rows.size());

			for (int i = 0; i <expectedTableHeaders.size(); i++) {
	           if(expectedTableHeaders.get(i).equals(columns.get(i).getText())) {
	        	   status = true;
	           }
		}
			for(int j=0; j<expectedTableBody.size(); j++) {
				 int inputColumn = j+1;
				List<WebElement> row =driver.findElements(By.xpath("//table/tbody/tr["+inputColumn+"]/td"));
				for(int k=0; k<row.size(); k++) {
				if(expectedTableBody.get(k).equals(row.get(k).getText())) {
					status = true;
					
				}
			}
			
		}
			act.moveByOffset(20, 30).click().perform();
	}
		return status;
	}
	public boolean testCase04(WebDriver driver) throws InterruptedException {
		boolean Status = false;
		WebElement search = driver.findElement(By.name("search"));
		search.clear();
		search.sendKeys("Tan");
		Thread.sleep(3000);
	    List<WebElement> text =driver.findElements(By.xpath("//div[@class=\"MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 MuiGrid-grid-md-3 css-sycj1h\"]"));
	    for(WebElement r : text) {
	    WebElement r1 = driver.findElement(By.xpath("//div[@class='MuiCardContent-root css-1qw96cp']/p[contains(@class,'MuiTypography-root MuiTypography-body1 css-y')]"));
	    String ActualName = r1.getText();
        if(ActualName.equals("Tan Leatherette Weekender Duffle")){
            WebElement cart =driver.findElement(By.xpath("//div[contains(@class,'css-3zukih')]/button[@type='button']"));
            cart.click();
            Status = true;
      }
	    }
		return Status;
	}
}
