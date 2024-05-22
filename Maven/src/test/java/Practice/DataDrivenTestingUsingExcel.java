package Practice;

import java.io.FileInputStream;



import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.DateFormatConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTestingUsingExcel {

	public static void main(String[] args) throws Exception, IOException {
		
		// Establish the connection btwn script and excel sheet using FileInputStream//
		FileInputStream fis = new FileInputStream("C:\\Users\\prasa\\Downloads\\DDT.xlsx\\");
		// make the excel sheet in read mode using workbookFactory//
        Workbook wb = WorkbookFactory.create(fis);
        // navigate to sheet in excel using getSheet method//
        Sheet sh =wb.getSheet("sheet1");
        // go to row in that sheet using getrow method//
        //Row r =sh.getRow(0);
        int Rownum = sh.getPhysicalNumberOfRows();
        // go to column in that row using get cloumn method//
       // Cell c =r.getCell(0);
        int cellnum = sh.getRow(0).getPhysicalNumberOfCells();
        // read the data in the column using getStringCellValue()//
       //String value = c.getStringCellValue();
       //System.out.println(value);
        DataFormatter df = new DataFormatter();
        // it will  convert any type of data into string//
       
        for(int i=0; i<Rownum ; i++)
        {
        	for(int j=0; j<cellnum; j++) {
				System.out.print(df.formatCellValue(sh.getRow(i).getCell(j)));
        		
        	}
        	System.out.println();
        }
        
      /* WebDriver driver = new ChromeDriver();
       driver.get("https://www.amazon.com/");
       driver.manage().window().maximize();
       driver.findElement(By.name("field-keywords")).sendKeys(value);
       driver.findElement(By.id("nav-search-submit-button")).click();*/
       wb.close();
       fis.close();
        
        
	}

}
