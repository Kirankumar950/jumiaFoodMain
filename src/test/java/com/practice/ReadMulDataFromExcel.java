package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMulDataFromExcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("sheet1");
		int count=sh.getLastRowNum();
		for(int i=1;i<=count;i++)
		{
			String text = sh.getRow(i).getCell(0).getStringCellValue();
			String texts = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(text+"......... "+texts);
		}
		

	}

}
