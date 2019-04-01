package Selenium_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario10 extends Generic 
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
	//go to Gender
	WebElement gender = driver.findElement(By.xpath("//span[.='Gender']"));
	Actions act= new Actions(driver);
	act.moveToElement(gender).perform();
	//get count of women
	WebElement gcount = driver.findElement(By.xpath("//span[@class='items-count' and .='(1673)']"));
	String str = gcount.getText();
	System.out.println("count = "+str);
	 //take screenshots
    getPhoto(driver, "C:\\Users\\MANISH SUKLA\\Desktop\\WS\\Assignments\\photo\\"+"Scenario10.png");
	//close the browser
	driver.close();
	
}

}
