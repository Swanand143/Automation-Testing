package webElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsWithSameAttribute {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		List<WebElement> community_poll = driver.findElements(By.name("pollanswers-1"));
		
		for (WebElement web : community_poll) {
			web.click();
			Thread.sleep(1500);
		}
		
		driver.quit();
	}
}
