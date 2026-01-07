package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TraversingUsingCssSelector_06 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
//		Traversing using the cssSelector bcz in cssSelector / not works to traverse
//		Below is the Forward Traversing
		List<WebElement> socialMediaLinks = driver.findElements(By.cssSelector("div[class='column follow-us']>ul>li>a"));
		
		for (WebElement webElement : socialMediaLinks) {
			System.out.println(webElement.getText());
			Thread.sleep(2000);
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
}

