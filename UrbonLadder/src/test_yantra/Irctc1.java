package test_yantra;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Irctc1 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElement(By.xpath("//a[contains(text(),' FLIGHTS ')]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String str : windowHandles) 
		{
			driver.switchTo().window(str);
		}
		Thread.sleep(2000);
		WebElement rtrip = driver.findElement(By.xpath("//span[contains(text(),'Round Trip ')]"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(rtrip));
		rtrip.click();
		driver.findElement(By.xpath("//input[@id = 'from']")).sendKeys("Mumbai");
		Thread.sleep(2000);
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id = 'to']")).sendKeys("Bengaluru");
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		//departure date 
		 LocalDate ld = LocalDate.now();
		 String mon =ld.plusDays(25).getMonth().toString();
		 String month = mon.substring(0, 1).concat(mon.substring(1,3).toLowerCase());
		String year = Integer.toString(ld.getYear());
		String day = Integer.toString(ld.getDayOfMonth());
		Thread.sleep(2000);
		WebElement monthYear = driver.findElement(By.xpath("//div[@class='date-table-right']/descendant::span[contains(text(),'"+month+"')]/following-sibling::sub[contains(text(),'"+year+"')]"));
		monthYear.click();
		WebElement date = driver.findElement(By.xpath("//table[@class='date-table']/tbody/tr/td/span[contains(text(),'"+day+"')]"));
		date.click();
		
		rbt.keyPress(KeyEvent.VK_TAB);
		rbt.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		//return date
		String rmon =ld.plusDays(25).plusDays(10).getMonth().toString();
		String rmonth = rmon.substring(0, 1).concat(rmon.substring(1,3).toLowerCase());
		String ryear = Integer.toString(ld.getYear());
		String rday = Integer.toString(ld.getDayOfMonth());
		
		
		Thread.sleep(2000);
		WebElement rmonthYear = driver.findElement(By.xpath("(//div[@class='date-table-right']/descendant::span[contains(text(),'"+rmonth+"')]/following-sibling::sub[contains(text(),'"+ryear+"')])[2]"));
		rmonthYear.click();
		Thread.sleep(2000);
		WebElement rdate = driver.findElement(By.xpath("(//table[@class='date-table']/tbody/tr/td/span[contains(text(),'"+rday+"')])[2]"));
		rdate.click();
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
	
		
	}

}

