package AirAsia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Air_Asia
{
	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

public static void main(String[] args) throws Exception 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	//go to airAsia .com
	driver.get("https://www.airasia.com/");
	//select origin
	WebElement origin = driver.findElement(By.id("home-origin-autocomplete-heatmap"));
	Thread.sleep(1000);
	origin.sendKeys("Bengaluru");
	origin.sendKeys(Keys.ENTER);
	//select destination 
	WebElement destination = driver.findElement(By.id("home-destination-autocomplete-heatmap"));
	
	destination.click();
	Thread.sleep(1000);
	destination.sendKeys("Delhi");
	destination.sendKeys(Keys.ENTER);
	//select the  departure date 25/05/19
	WebElement depDate = driver.findElement(By.id("home-depart-date-heatmap"));
	Thread.sleep(1000);
	depDate.clear();
	Thread.sleep(1000);
	depDate.sendKeys("25/05/2019");
    //select one way
	driver.findElement(By.xpath("//label[text()='One way']")).click();
	Thread.sleep(1000);
	//click on confirm
	driver.findElement(By.xpath("//button[.=' Confirm ']")).click();
	//click on search 
	driver.findElement(By.id("home-flight-search-airasia-button-inner-button-select-flight-heatmap")).click();
	Thread.sleep(1000);
	//select time 11:05 to 13:55
	driver.findElement(By.xpath("(//span[@id='open-tooltip-desc'])[3]")).click();
	//click on continue
	//select premium flex
	//click on add on
	//go to a pick a seat
	//select 10th row
	//seat f
	//click on done 
	//continue
	//click on gets details 
	//select dob
	//select name
	//select surname
	//select gender 
	//click on continue 
}

}
