package com.java.p;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class poixl {
public static void main(String args[]) {
	XSSFWorkbook wb=new XSSFWorkbook();
	XSSFSheet sheet=wb.createSheet("samplesheet");
	Map <String,Object[]> ds=new LinkedHashMap<String,Object[]>();
	ds.put("1",new Object[]{"Syed","Farhan","Ali"});
	ds.put("2",new Object[]{"Syed","Kashif","Ali"});
	ds.put("3",new Object[]{"Syed","dff","Ali"});
	Set<String> key=ds.keySet();
	int rownum=0;
	for(String k:key) {
		Row row=sheet.createRow(rownum++);
		Object[] data=ds.get(k);
		int cellnum=0;
		for(Object o:data) {
			Cell cell=row.createCell(cellnum++);
					if (o instanceof String) {
						cell.setCellValue((String)o);
					} 
					else if(o instanceof Integer) {
						cell.setCellValue((Integer)o);
					}
		}
	
	
		
		
	}
	try {
		FileOutputStream FO=new FileOutputStream("samplesheet.xlsx");
		wb.write(FO);
		FO.close();
		System.out.println("done");
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
