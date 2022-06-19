package com.selenium.handson.DataDriven1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataTest {

	//grab purchase testcase row : pull all the data and feed into 
	
	public static ArrayList<String> getData(String testCaseName) throws IOException{
		ArrayList<String> list = new ArrayList<>();
		FileInputStream fis = new FileInputStream("./src/main/resources/dataTest.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		
		int sheets_no = book.getNumberOfSheets();
		
		for(int i = 0; i < sheets_no; i++) 
		{
			XSSFSheet sheet = book.getSheetAt(i);
			
			Iterator<Row> rows = sheet.iterator();
			
			Row firstrow = rows.next();
			
			Iterator<Cell> ce = firstrow.iterator();
			
			while(ce.hasNext()) {
				Cell val = ce.next();
				if(val.getStringCellValue().equalsIgnoreCase("TestCases")) 
				{
					
				}
			}
		}
 		return list;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		getData("");
	}

}
