package Assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 
{
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/MANISH%20SUKLA/Desktop/demo.html");
		List<WebElement> lst = driver.findElements(By.tagName("option"));
		for (int i = 0; i < lst.size(); i++)
		{
			String text = lst.get(i).getText();
			System.out.println(text);
		}

}
}
