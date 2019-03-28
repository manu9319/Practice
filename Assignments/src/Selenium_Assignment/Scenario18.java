package Selenium_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scenario18
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
	//search for rings
		driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("Ring");
		driver.findElement(By.xpath("//input[@name='submit_search']")).click();
		//4.	click on any product
		driver.findElement(By.xpath("//img[@class='hc img-responsive center-block']")).click();
		//5.	verify original price discount price and actual price
		WebElement price = driver.findElement(By.xpath("//span[@id='our_price_display']"));
		String eprice = price.getText();
		String aprice = "9,596";
		Assert.assertEquals(aprice, eprice);
		System.out.println("Price is correct");
	}
}
