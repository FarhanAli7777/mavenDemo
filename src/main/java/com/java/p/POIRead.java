package com.java.p;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POIRead {
	public static void main(String args[]) {
		FileInputStream Fi=null;
		try {
		 Fi= new FileInputStream("samplesheet.xlsx");
			
		 XSSFWorkbook wb= new XSSFWorkbook(Fi);
		 XSSFSheet sheet= wb.getSheet("samplesheet");
		 Row row;
		 Cell cell;
		 Iterator<Row> it=sheet.iterator();
		
		 while(it.hasNext()) {
			 row=it.next();
			 
			 Iterator<Cell> itt=row.iterator();
			 
			 while(itt.hasNext()) {
				 cell=itt.next();
				 DataFormatter df=new DataFormatter();
				 String text=df.formatCellValue(cell);
				 System.out.println(text);
					
			 }
		 }
		 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
		
	}
}
