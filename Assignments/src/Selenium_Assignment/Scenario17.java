package Selenium_Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scenario17 extends Generic 
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
	//click on visit our stores
		driver.findElement(By.xpath("//a[text()='Visit Our Stores']")).click();
		//check the count of locations
		List<WebElement> store = driver.findElements(By.xpath("//span[@class='store-hash-link']"));
		int eCount = store.size();
		System.out.println("Store count is =  "+eCount);
		int aCount = 6;
		Assert.assertEquals(aCount, eCount);
		System.out.println("Store count correct ");
		 //take screenshots
	     getPhoto(driver, "C:\\Users\\MANISH SUKLA\\Desktop\\WS\\Assignments\\photo\\"+"Scenario17.png");
		//close browser
		driver.close();
	}

}
