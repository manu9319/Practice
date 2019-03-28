package Assignment3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception 
	{
//Open a browser of your choice say Mozilla Firefox using Gecko Driver
		WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//Navigate to Gmail (https://www.gmail.com)
		driver.get("https://www.gmail.com");
//	Login to your Gmail with correct credentials.
		WebElement username = driver.switchTo().activeElement();
		username.sendKeys("shukla.manish312@gmail.com");
		username.sendKeys(Keys.ENTER);
		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys("9936198993");
		pwd.sendKeys(Keys.ENTER);
//Verify that by default “Primary” section is selected.
	    WebElement primary = driver.findElement(By.xpath("//div[@id=':2k']"));
	                    if (primary.isSelected())
	                    {
	                    	System.out.println("primary is selected ");
						}
//If not click on the Primary tab.
	                    
	                    
	                    else
	                    {
	                    	Thread.sleep(2000);
	                    	System.out.println("primary is not selected ");
	                    	primary.click();
						}
	                    
                  Thread.sleep(1000);
//Get the count of the total number of emails in the Primary tab.
	                  WebElement we1 = driver.findElement(By.xpath("(//span[@class='Dj']/span[@class='ts'])[1]"));
	                 String str = we1.getText();
	                 int count=Integer.parseInt(str);
	                 System.out.println(count);
//Get the name of the sender and subject of Nth Email of your inbox.
	                 
	                List<WebElement> we2 = driver.findElements(By.xpath("//div[@class='yW']"));
	                List<WebElement> we3 = driver.findElements(By.xpath("//span[@class='bog']")); 
	              int count1 = we2.size();
	              
	              System.out.println(count1);
	                for (int i = 0; i <count1; i++)
	                {

		                String sender = we2.get(i).getText();
		               System.out.println("sender = "+sender);

		               String subject = we3.get(i).getText();
		              System.out.println("subject = "+subject);
		              System.out.println("-----------------------------------------------------------");
					}


		driver.close();
	}
	
}
