package FRameWork;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://web-locators-static-site-qa.vercel.app/Web%20Table");
		driver.findElement(By.xpath("//span[text()=\"Static Table - Subject Topper\"]")).click();
		List<WebElement> headers = driver.findElements(By.xpath("//thead/tr/th"));
		int Subject =-1;
		int Marks =-1;
		int Sname =1;
		int sRollNumber =-1;
		for(int i=0; i<headers.size(); i++) {
			if(headers.get(i).getText().equals("Subject")) {
				Subject= i+1;
			System.out.println(Subject);
			}
			else if(headers.get(i).getText().equals("Highest Marks")) {
				 Marks =i+1;
			}
			else if(headers.get(i).getText().equals("Student Name")) {
				 Sname =i+1;
			}
			else if(headers.get(i).getText().equals("Student Roll Number")) {
				sRollNumber =i+1;
			}
			
			System.out.println(headers.get(i).getText());
		}
		List<WebElement>  Data =driver.findElements(By.xpath("//tbody/tr/td["+Subject+"]"));
		int rowValue = -1;
		for(int j=0; j<Data.size(); j++) {
			if(Data.get(j).getText().equals("Java")) {
				rowValue =j+1;	
				List<WebElement> secondRowColumns = driver.findElements(By.xpath("//tbody/tr["+rowValue+"]/td"));
				for(int p =0; p<secondRowColumns.size(); p++) {
					System.out.print(secondRowColumns.get(p).getText()+" ");
				}
			//System.out.println(Data.get(j).getText());
			}
		System.out.println(Data.get(j).getText());
		}
			System.out.println(driver.findElement(By.xpath("//tbody/tr["+rowValue+"]/td["+Marks+"]")).getText());
			System.out.println(driver.findElement(By.xpath("//tbody/tr["+rowValue+"]/td["+Sname+"]")).getText());
			System.out.println(driver.findElement(By.xpath("//tbody/tr["+rowValue+"]/td["+sRollNumber+"]")).getText());
			System.out.println("total number of rows");
			List<WebElement> totalrows = driver.findElements(By.xpath("//tbody/tr"));
			System.out.println(totalrows.size()); 
			
			System.out.println("Average of Highest Marks");
			List<WebElement> Average =driver.findElements(By.xpath("//tbody/tr/td["+Marks+"]"));
			int  totalSum =0;
			for(int j=0; j<Average.size(); j++ ) {
				
				String text = Average.get(j).getText();
				int sum = Integer.parseInt(text);
				totalSum = totalSum + sum;
				
			}
			int ActualAverage = totalSum/Average.size();
			System.out.println("Average of Highset mark:"+ActualAverage);
			
			System.out.println("data in second row");
			List<WebElement> rowData = driver.findElements(By.xpath("//tbody/tr[2]/td"));
				for(int m=0; m<rowData.size(); m++) {
					System.out.print(rowData.get(m).getText()+" ");
				}
			}
		}
			
		

/*}
			else if(headers.get(i).getText().equals("Highest Marks")) {
				 Marks =i+1;
				 System.out.println(headers.get(i).getText());
			}
			else if(headers.get(i).getText().equals("Student Name")) {
				 Sname =i+1;
				 System.out.println(headers.get(i).getText());
			}
			else if(headers.get(i).getText().equals("Student Roll Number")) {
				sRollNumber =i+1;
				System.out.println(headers.get(i).getText());
			}*/

