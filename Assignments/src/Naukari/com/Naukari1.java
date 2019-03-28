package Naukari.com;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari1 
{
static {
	
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}


public static void main(String[] args) throws Exception
{
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	Set<String> allWh = driver.getWindowHandles();
	int count = allWh.size();
	System.out.println(count);
	// print the window title
	for (String wh: allWh)
	{
		driver.switchTo().window(wh);
 		System.out.println(driver.getTitle());
 	
	}
	 //close the browser in reverse order
	ArrayList<String> al= new ArrayList<String>(count);
	for(String a: allWh)
	{
		al.add(a);
	}
	
//	for (int i =count-1; i>=0; i--) 
//	{
//		driver.switchTo().window(al.get(i));
//		 Thread.sleep(2000);
//		driver.close();
//	  
//	}
//	
	// close the browser and print the window title in alternate order 
	for (int i = 0; i <count; i++)
	{
		if (i%2==0) 
		{
			driver.switchTo().window(al.get(i));
			 Thread.sleep(2000);
			System.out.println(driver.getTitle());
			driver.close();
		}
		
	}
	
	for (int i = 0; i <count; i++)
	{
		if (i%2==1) 
		{
			driver.switchTo().window(al.get(i));
			 Thread.sleep(2000);
			 System.out.println(driver.getTitle());
			driver.close();
		}
		
	}
	
}
}
