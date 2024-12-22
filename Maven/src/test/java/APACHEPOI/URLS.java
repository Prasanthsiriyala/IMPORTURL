package APACHEPOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class URLS{

	    public static List<String> readURLs(String filePath, String sheetName) throws IOException {
	        List<String> urls = new ArrayList<>();
	        File file = new File(filePath);

	        try (FileInputStream fis = new FileInputStream(file);
	             Workbook wb = WorkbookFactory.create(fis)) {

	            Sheet sheet = wb.getSheet(sheetName);

	            // Row iterator
	            Iterator<Row> rowIterator = sheet.iterator();
	            int rowIndex = 0;

	            while (rowIterator.hasNext()) {
	                Row row = rowIterator.next();

	                // Skip header row
	                if (rowIndex > 0) {
	                    Cell cell = row.getCell(0); // Assuming URLs are in the first column
	                    if (cell != null && cell.getCellType() == CellType.STRING) {
	                        urls.add(cell.getStringCellValue());
	                    }
	                }
	                rowIndex++;
	            }
	        }

	        return urls;
	    }

	    public static void main(String[] args) throws InterruptedException {
	        String filePath = "C:\\Users\\prasa\\Downloads\\URL.xlsx";
	        String sheetName = "Sheet1";
	        try {
	            // Read URLs from the Excel file
	            List<String> urls = readURLs(filePath, sheetName);
	            for (String url : urls) {
	                System.out.println("Processing URL: " + url);
	                WebDriverManager.chromedriver().setup();
	                 WebDriver driver = new ChromeDriver();
	                 driver.manage().window().maximize();
	                 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	                 driver.get(url);
	                 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	                 try {
	                	 WebElement accept =driver.findElement(By.xpath("//button[@data-testid=\"Accept All-btn\"]"));
	                	 wait.until(ExpectedConditions.visibilityOf(accept));
	                	 accept.click();
	                 }catch(Exception e) {
	                	 System.out.println("Continue Execution");
	                 }
	                 try {
	                	 WebElement agree =driver.findElement(By.xpath("//button[text()='I agree']"));
	                	 wait.until(ExpectedConditions.visibilityOf(agree));
	                	 agree.click();
	                 }catch(Exception e) {
	                	 System.out.println("Continue Execution");
	                 }
	                 try {
	                	    // Define the locator for the button
	                	    By downloadButtonLocator = By.xpath("//button[text()='Download']");	                	  	                	  	               
	                	    WebElement download = wait.until(ExpectedConditions.visibilityOfElementLocated(downloadButtonLocator));
	                	    wait.until(ExpectedConditions.elementToBeClickable(download));
	                	    download.click();
	                	    Thread.sleep(3000);

	                	} catch (Exception e) {
	                	    System.out.println("Continue Execution: " + e.getMessage());
	                	}


                	 try {
	                	 wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h2[text()='Your download has started']"),"Your download has started")); 
                	 }catch(Exception e) {
                		 System.out.println("continue Execution");
                	 }
	             driver.quit();   
	            }
	                
	        } catch (IOException e) {
	            System.out.println("Failed to read URLs from the Excel file: " + e.getMessage());
	        }
	    }
	}

