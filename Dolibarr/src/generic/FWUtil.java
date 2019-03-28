package generic;

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
	// read the data from excel
	public static String getXLData(String path,String sheet,int row,int cell)
	{
		String v="";
		try 
		{
			Workbook w = WorkbookFactory.create(new FileInputStream(path));
			v=w.getSheet(sheet).getRow(row).getCell(cell).toString();
			
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return v;
	}
	
	//write Data in excel.
	public static void setXLData(String path,String sheet,int row,int cell,int value)
	{
		try 
		{
			Workbook w = WorkbookFactory.create(new FileInputStream(path));
			w.getSheet(sheet).getRow(row).getCell(cell).setCellValue(value);
			w.write(new FileOutputStream(path));
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	// write the data in excel (method overloading).
	public static void setXLData(String path,String sheet,int row,int cell,String value)
	{
		try 
		{
			Workbook w = WorkbookFactory.create(new FileInputStream(path));
			w.getSheet(sheet).getRow(row).getCell(cell).setCellValue(value);
			w.write(new FileOutputStream(path));
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
	// to return row count in excel sheet .
	public static int getXLRowCount(String path,String sheet)
	{
		int count=0;
	
		try 
		{
			Workbook w = WorkbookFactory.create(new FileInputStream(path));
			count=w.getSheet(sheet).getLastRowNum();
		}
		 catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return count;
	}
	
	public static void getPhoto(WebDriver driver, String path) 
	{
		
		try 
		{
			TakesScreenshot t= (TakesScreenshot)driver;
			File srcFile =t.getScreenshotAs(OutputType.FILE);
			File dstFile=new File(path);
			FileUtils.copyFile(srcFile, dstFile);
			
		} 
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
	
  