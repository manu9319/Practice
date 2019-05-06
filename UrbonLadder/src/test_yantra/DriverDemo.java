package test_yantra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverDemo 
{
    public static void main(String [] args)
    {
    	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    	WebDriver driver= new ChromeDriver();
    	driver.get("https://www.google.com/");
    	String crnturl = driver.getCurrentUrl();
    	String psource = driver.getPageSource();
    	String title = driver.getTitle();
    	System.out.println("url = "+crnturl);
    	//System.out.println("page source = "+psource);
    	System.out.println("title = "+title);
    }
}
