package practice;

import java.util.concurrent.TimeUnit;
import practice.FWUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConst
{
 WebDriver driver;
 public static int pass=0,fail=0;
 static 
 {
	 System.setProperty(CHROME_KEY, CHROME_VALUE);
	 System.setProperty(GECKO_KEY, GECKO_VALUE);
 }
 
 @BeforeMethod
 public void openApplication()
 {
	 driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 driver.get(URL);
	 
 }
 
 @AfterMethod
 public void closeApplication(ITestResult itestResult)
 {
	 if (itestResult.getStatus()==2)
	 {
	   String name = itestResult.getTestName();	
	  FWUtil.getPhoto(driver, PHOTO_PATH+name+".png");
	  fail++;
	}
	 else
	 {
		 pass++;
		 
	 }
	 driver.close();
 }
 @AfterSuite
 public void writeReport()
 {
	FWUtil.writeXLData(REPORT_PATH, "sheet1", 1, 0, pass); 
	FWUtil.writeXLData(REPORT_PATH, "sheet1", 1, 1, fail); 
	
 }
 
}
