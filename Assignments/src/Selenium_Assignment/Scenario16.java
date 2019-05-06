package Selenium_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Scenario16 extends Generic
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
	//enter  monthly amount and email address and click on start now
	WebElement amt = driver.findElement(By.xpath("//input[@id='amount']"));
	amt.sendKeys("5000");
	amt.sendKeys(Keys.ENTER);
	WebElement email = driver.findElement(By.xpath("//input[@id='Email' and @name='email']"));
	email.sendKeys("sagar234@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='tahLpSubmit']")).click();
	Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='contactNumber']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='fullname']")).sendKeys("sagar");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("uttam naga, delhi");
		driver.findElement(By.xpath("//input[@id='postcode_delivery']")).sendKeys("110045");
		driver.findElement(By.xpath("//input[@value='Next']")).click();
		driver.findElement(By.xpath("//input[@id='nomineeName']")).sendKeys("Raj");
		WebElement relative = driver.findElement(By.xpath("//select[@id='nomineeRelationship']"));
		Select select = new Select(relative);
		select.selectByVisibleText("Father");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String eTitle = driver.getTitle();
		String aTitle = "Gold Mine Payment Option | BlueStone.com";
		Assert.assertEquals(aTitle, eTitle);
		System.out.println("Payment page  displayed");
		 //take screenshots
	     getPhoto(driver, "C:\\Users\\MANISH SUKLA\\Desktop\\WS\\Assignments\\photo\\"+"Scenario16.png");
	}

}
