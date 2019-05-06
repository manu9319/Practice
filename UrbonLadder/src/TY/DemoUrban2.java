package TY;
//print all the menu and sub-menu
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoUrban2 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void Run() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com");
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
   List<WebElement> alllist = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname')]"));
		
		for (int i = 0; i <alllist.size(); i++)
		{
			String text = alllist.get(i).getText();
			Thread.sleep(500);
			System.out.println(text);
            Actions action =new Actions(driver);
			action.moveToElement(alllist.get(i)).perform();
			List<WebElement> submenulist = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname') "
					+ "and contains(.,'"+text+"')]/following-sibling::div[@class='subnavlist lt']/descendant::div[@class='taxontype']/a"));		
			for (int j = 0; j <submenulist.size(); j++)
			{
				Thread.sleep(500);
				String slist = submenulist.get(j).getText();
				System.out.println(slist);
                List<WebElement> allsubsubtext = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname')"
						+ " and contains(.,'"+text+"')]/following-sibling::div[@class='subnavlist lt']/descendant::div[@class='taxontype']/a[.='"+slist+"']"
								+ "/parent::div/following-sibling::ul/descendant::a"));
				for (int k = 0; k <allsubsubtext.size(); k++)
				{
					Thread.sleep(500);
					String text2 = allsubsubtext.get(k).getText();
					System.out.println(text2);
				}
			}
		}
	}
}

