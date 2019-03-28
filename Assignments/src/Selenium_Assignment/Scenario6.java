package Selenium_Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario6
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
	//move the cursor to price
	WebElement price = driver.findElement(By.xpath("//span[.='Price']"));
	Actions act= new Actions(driver);
	act.moveToElement(price).perform();
	
	//get the count of below 10000 Rs
	
	List<WebElement> range = driver.findElements(By.xpath("//span[@class='prcs-dlh']/child::span[contains(.,'Rs.')]"));
	int count = range.size();
	System.out.println(count);
	//close browser
	driver.close();
}


}
