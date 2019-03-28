package Assignment2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	static {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws Exception {
		// Open browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// Enter URL(bluestone)
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Ambika");
		List<WebElement> allas = driver.findElements(By.xpath("//ul[@class='erkvQe']//span[contains(.,'ambika')]"));
		int count = allas.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String text = allas.get(i).getText();
			System.out.println(text);

		}
		allas.get(2).click();

	}

}
