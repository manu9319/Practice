package Selenium_Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario7
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
	//go to search and search for rings
	WebElement srcbox = driver.findElement(By.id("search_query_top_elastic_search"));
	srcbox.sendKeys("Rings");
	srcbox.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	//move the cursor to Delivery time
	WebElement deliverytime = driver.findElement(By.xpath("//span[@class='title style-fill i-right']/span[ .='Delivery Time']"));
	Actions act= new Actions(driver);
	act.moveToElement(deliverytime).perform();
	//get the count of Next Day Delivery
	 WebElement delcount = driver.findElement(By.xpath("//span[@class='items-count' and .='(171)']"));
	String str = delcount.getText();
	System.out.println("count = "+str);
	 //close browser
	driver.close();
}

}
