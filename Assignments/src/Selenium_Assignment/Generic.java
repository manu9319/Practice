package Selenium_Assignment;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic 
{
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
