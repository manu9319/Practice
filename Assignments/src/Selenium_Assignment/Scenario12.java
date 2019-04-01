package Selenium_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scenario12 extends Generic
{
	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

public static void main(String[] args) throws Exception 
{
	//Open browser
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	//Enter URL(bluestone)
	driver.get("https://www.bluestone.com/");
	  //click on goldmine 10+1 Scheme
	driver.findElement(By.xpath("//div[@class='gms-banner-inner']/strong[.='10 + 1']")).click();
	 //with out entering  monthly amount and email address and click on start now
	driver.findElement(By.xpath("//input[@id='tahLpSubmit']")).click();
    //verify whether error message is displaying or not .
	WebElement errmsg = driver.findElement(By.xpath("//li[.='Email is required']"));
	Assert.assertTrue(errmsg.isDisplayed(), "Error messege is not displayed");
	 //take screenshots
    getPhoto(driver, "C:\\Users\\MANISH SUKLA\\Desktop\\WS\\Assignments\\photo\\"+"Scenario12.png");
   //Close browser.
	driver.close();


}
}