package com.acceptmission.utilities;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author swati
 * created on 28/12/2018 at 01:29pm
 */
public class ExcelUtilities {
	
/**
	 * @author swati
	 * @param file
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return String
	 */
	public static String readData(String file, String sheet, int row, int cell) 
			
	{
		String value=null;
		
		try
		{
		 Workbook wb = WorkbookFactory.create(new FileInputStream(new File(file)));
		 value= wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		}
		
		catch(EncryptedDocumentException e)
		{
		  e.printStackTrace();	
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		return value;
	}
}


