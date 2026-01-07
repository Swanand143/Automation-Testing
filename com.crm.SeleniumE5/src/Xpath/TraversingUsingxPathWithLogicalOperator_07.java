package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TraversingUsingxPathWithLogicalOperator_07 {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		

		List<WebElement> socialMediaLinks = driver.findElements(By.cssSelector("div[class='column follow-us']>ul>li>a"));
		
		for (WebElement webElement : socialMediaLinks) {
			System.out.println(webElement.getText());
			Thread.sleep(2000);
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
}

