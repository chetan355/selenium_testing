package com.selenium.handson.DataDriven1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriver 
{
    public static void main( String[] args ) throws IOException
    {
    	FileInputStream fis = new FileInputStream("./src/main/resources/dataTest.xlsx");
    	XSSFWorkbook workbook = new XSSFWorkbook(fis);
    	
    	int no_of_sheets = workbook.getNumberOfSheets();
    	for(int i = 0; i < no_of_sheets; i++) 
    	{
    		if(workbook.getSheetName(i).equalsIgnoreCase("test2")) 
    		{
    			XSSFSheet sheet = workbook.getSheetAt(i);
    			//identify testcases column by scanning the entire 1st row
    			Iterator<Row> rows = sheet.iterator(); //sheet is collection of rows
    			
    			Row firstrow = rows.next(); // getting a single row
    			
    			Iterator<Cell> ce  = firstrow.iterator(); //row is collection  of cells
    			int k = 0;
    			while(ce.hasNext()) 
    			{
    				Cell val = ce.next();
    				if(val.getStringCellValue().equalsIgnoreCase("TestCases")) {
    					System.out.println(k);
    				}
    				k++;
    			}
    			
    			while(rows.hasNext()) {
    				Row r = rows.next();
    				Iterator<Cell> it = r.iterator();    			
    				if(it.next().getStringCellValue().equals("Purchase")) {
    					while(it.hasNext()) {
    						System.out.println(it.next().getStringCellValue());
    					}
    				}
    			}
    		}
    	}    	
    }
}
