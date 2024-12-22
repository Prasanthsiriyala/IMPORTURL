package DP.java;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.testng.annotations.DataProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataProvider {

    public static void main(String[] args) throws IOException {
        //File file = new File("C:\\Users\\prasa\\OneDrive\\Desktop\\SampleSheet.xlsx");
        //File file = new File("C:\\Users\\prasa\\Downloads\\sheet.xlsx");
    	File file = new File("C:\\Users\\prasa\\Downloads\\URL.xlsx");

        // Using try-with-resources for automatic resource management
        FileInputStream fis = new FileInputStream(file);
             Workbook wb = WorkbookFactory.create(fis);

            Sheet sh = wb.getSheet("Sheet1");

            // Row iterator
            Iterator<Row> Irow = sh.iterator();

            // Iterate through each row
            while (Irow.hasNext()) {
                Row row = Irow.next();

                Iterator<Cell> Icell = row.iterator();
               // Cell cell = row.getCell(0); // 0 for the first column
                while(Icell.hasNext()) {
                	 Cell cell =Icell.next();

                if (cell != null) { // Check if the cell is not null
                    switch (cell.getCellType()) {
                        case NUMERIC:
                            System.out.println(cell.getNumericCellValue());
                            break;
                        case STRING:
                            System.out.println(cell.getStringCellValue());
                            break;
                        default:
                            System.out.println("UNKNOWN");
                            break;
                    }
                }
            }
        }
    }
    }


