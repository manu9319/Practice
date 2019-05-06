package test_yantra;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HighCharts {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.highcharts.com/demo/pie-legend/dark-unica");
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		List<WebElement> pieList = driver.findElements(By.xpath("//*[name()='svg']/descendant::*[name()='g' and @class='highcharts-series-group']/descendant::*[name()='path']"));
		Thread.sleep(2000);
		for (int i = 1; i <= pieList.size(); i++) 
		{
			WebElement pie = driver.findElement(By.xpath("//*[name()='svg']/descendant::*[name()='g' and @class='highcharts-series-group']/descendant::*[name()='path']["+i+"]"));
			action.moveToElement(pie).perform();
			String text = driver.findElement(By.xpath("//*[name()='svg']/descendant::*[name()='g' and @class='highcharts-series-group']/descendant::*[name()='path']["+i+"]/ancestor::*[name()='g']/following-sibling::*[name()='g' and contains(@class,'tooltip')]/descendant::*[name()='text']")).getText();
			System.out.println(text);
		}
	}

}
