package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlScenario1 {

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/MANISH%20SUKLA/Desktop/demo.html");
		WebElement tb1 = driver.findElement(By.id("tb1"));
		String str = tb1.getAttribute("value");
		tb1.clear();
		WebElement tb2 = driver.findElement(By.id("Text"));
		tb2.clear();
		tb2.sendKeys(str);
		

	}

}
