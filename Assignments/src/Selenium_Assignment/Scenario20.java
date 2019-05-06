package Selenium_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario20 extends Generic 
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
	//2.	enter url(https://jqueryui.com/slider/)
		driver.get("https://jqueryui.com/slider/");
		//3.	Slide the slider upto end in multiples times  it should come in reverse order in multiple times.
		driver.switchTo().frame(0);
		WebElement we = driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle ui')]"));
		for (int i = 1; i <= 50; i++) 
		{
			we.sendKeys(Keys.ARROW_RIGHT);
		}
		for (int i = 1; i <= 50; i++) 
		{
			we.sendKeys(Keys.ARROW_LEFT);
		}
		 //take screenshots
	     getPhoto(driver, "C:\\Users\\MANISH SUKLA\\Desktop\\WS\\Assignments\\photo\\"+"Scenario20.png");
		//close Browser
		driver.close();
	}
}
