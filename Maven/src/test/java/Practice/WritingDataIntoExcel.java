package Practice;

import java.awt.print.Book;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws Throwable, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\prasa\\Downloads\\DDT.xlsx\\");
		// make the excel sheet in read mode using workbookFactory//
        Workbook wb = WorkbookFactory.create(fis);
       Sheet sh = wb.getSheet("sheet1");
       Row r =sh.createRow(6);
       Cell c = r.createCell(7);
       c.setCellValue("Data Driven Testing");
       
       FileOutputStream fos = new FileOutputStream("C:\\Users\\prasa\\Downloads\\DDT.xlsx\\");
       wb.write(fos);
       wb.close();
        
      

	}

}
