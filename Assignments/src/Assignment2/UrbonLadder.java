package Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UrbonLadder
{
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com");
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		   List<WebElement> alllist = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname') and contains(text(),'Living')]"));
				List<String> actual=new ArrayList<>();
				List<String> expected=new ArrayList<>();
				for (int i = 0; i <alllist.size(); i++)
				{
					String text1 = alllist.get(i).getText();
					actual.add(text1);
					expected.add(text1);
					Thread.sleep(500);
					//System.out.println(text1);
		            Actions action =new Actions(driver);
					action.moveToElement(alllist.get(i)).perform();
					List<WebElement> submenulist = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname') and contains(text(),'Living')]"
							+ "/following-sibling::div[@class='subnavlist lt']/descendant::div[@class='taxontype']/a"));		
					for (int j = 0; j <submenulist.size(); j++)
					{
						Thread.sleep(500);
						String text2 = submenulist.get(j).getText();
						actual.add(text2);
						expected.add(text2);
						//System.out.println(text2);
		                List<WebElement> allsubsubtext = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname') and contains(text(),'Living')]"
		                		+ "/following-sibling::div[@class='subnavlist lt']/descendant::div[@class='taxontype']/a[.='"+text2+"']"
										+ "/parent::div/following-sibling::ul/descendant::a"));
						for (int k = 0; k <allsubsubtext.size(); k++)
						{
							Thread.sleep(500);
							String text3 = allsubsubtext.get(k).getText();
							actual.add(text3);
							expected.add(text3);
							//System.out.println(text3);
						}
					}
				}
				System.out.println(actual);
				Assert.assertEquals(actual, expected);
			
		
}
}
