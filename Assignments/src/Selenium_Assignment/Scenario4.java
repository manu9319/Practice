package Selenium_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Scenario4 
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
	//move to Gold coins
	Actions act= new Actions(driver);
	WebElement Gcoins = driver.findElement(By.xpath("//li[@id='goldCoins']"));
	Thread.sleep(1000);
	act.moveToElement(Gcoins).perform();
	
	//Go to Lakshmi gold coins and Select 5 Gm
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[.='Lakshmi Gold Coins']"
			+ "/parent::div[@class='wh-submenu-header']/following-sibling::ul/child::li"
			+ "/child::span[contains(.,'5 gram')]")).click();
	//Verify 5Gm Coin is displaying or not.
	Thread.sleep(1000);
	 WebElement coin20g = driver.findElement(By.xpath("//img[@alt='5 gram 24 KT Lakshmi Gold CoinFront']"));
     Assert.assertTrue(coin20g.isDisplayed(), "5Gm coin is not displayed ");
	//close Browser
     driver.close();
}

}
