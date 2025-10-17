package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsAssignment1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		List<WebElement> social = driver.findElements(By.xpath("//div[contains(@class,'column follow-us')]/ul/li/a"));
		
		// Way-1
//		for (WebElement web : social) {
//			
//			try {
//				web.click();
//				Thread.sleep(2000);
//				
//			} catch (StaleElementReferenceException e) {
//				Thread.sleep(2000);
//				driver.navigate().back();
//				web.click();
//			}
//		}
		
		// ----Way-2(Sir's Way)---- Better Way
		String rss_url = "https://demowebshop.tricentis.com/news/rss/1";
		for (WebElement web : social) {
			
			String actual_url = driver.getCurrentUrl();
			
			if (rss_url.equals(actual_url)) {
				driver.navigate().back();
			}
			
			web.click();
			Thread.sleep(2000);
		}
		
		Thread.sleep(5000);
		driver.quit();	
	}
}
