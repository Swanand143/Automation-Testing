package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathByMultipleComponents_05 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
//		How to use the and, or, not Operators in CSS traversing
		// here we use not operator with traversing
		List<WebElement> socialMediaLinks = driver.findElements(By.xpath("//div[contains(@class,'column follow-us')]/ul/li/a[not(text()='RSS')]"));
		
		for (WebElement webElement : socialMediaLinks) {
			System.out.println(webElement.getText());
			Thread.sleep(2000);
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
}

