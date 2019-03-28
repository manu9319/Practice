package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class FWUtil 
{
	//read data from XL
	public static String getXLData(String path,String sheet,int row,int cell)
	{
		String v="";
		try
		{
			Workbook w = WorkbookFactory.create(new FileInputStream(path));
			v = w.getSheet(sheet).getRow(row).getCell(cell).toString();

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return v;
	}
	//write data in Xl
	public static void writeXLData(String path,String sheet,int row,int cell,int value)
	{
		try
		{
			Workbook w = WorkbookFactory.create(new FileInputStream(path));
			w.getSheet(sheet).getRow(row).getCell(cell).setCellValue(value);
			w.write(new FileOutputStream(path));
		}
		catch (Exception e)
		{
		
			e.printStackTrace();
		}
		
	}
	
	//write data in Xl
		public void writeXLData(String path,String sheet,int row,int cell,String value)
		{
			try
			{
				Workbook w = WorkbookFactory.create(new FileInputStream(path));
				w.getSheet(sheet).getRow(row).getCell(cell).setCellValue(value);
				w.write(new FileOutputStream(path));
			}
			catch (Exception e)
			{
			
				e.printStackTrace();
			}
			
		}
		//get row count
		public static int getRowCount(String path,String sheet)
		{
			int count=0;
			try
			{
				Workbook w= WorkbookFactory.create(new FileInputStream(path));
				count=w.getSheet(sheet).getLastRowNum();
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
			
			return count;
		}
		
		public static void getPhoto(WebDriver driver,String path)
		{
			TakesScreenshot t= (TakesScreenshot)driver;
			File srcFile=t.getScreenshotAs(OutputType.FILE);
			File destFile= new File(path);
			try
			{
				FileUtils.copyFile(srcFile, destFile);
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			
		}

}
