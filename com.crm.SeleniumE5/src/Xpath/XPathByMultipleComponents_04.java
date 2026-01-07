package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathByMultipleComponents_04 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
//		xPath by multiple components using and & not operator
		List<WebElement> socialMediaLinks = driver.findElements(By.xpath("//a[@target='_blank' and not(text()='Twitter')]"));
		
//		OR we can also use using != operator instead of not operator both are same
//		List<WebElement> socialMediaLinks = driver.findElements(By.xpath("//a[@target='_blank' and text()!='Twitter']"));

		for (WebElement webElement : socialMediaLinks) {
			System.out.println(webElement.getText());
			Thread.sleep(2000);
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
}
