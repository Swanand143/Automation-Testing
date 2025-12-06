package PopUp.ChildBrowserPopUp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class MultipleChilds extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		String dws_expected_url = "https://demowebshop.tricentis.com/";
		String google_expected_url = "https://workspaceupdates.googleblog.com/2023/04/new-community-features-for-google-chat-and-an-update-currents%20.html";
		String twitter_expected_url = "https://x.com/nopCommerce";
		String youtube_expected_url = "https://www.youtube.com/user/nopCommerce";
		String facebook_expected_url = "https://www.facebook.com/nopCommerce";
		
		
		preCondition("chrome","https://demowebshop.tricentis.com/");
		String parentHandle = driver.getWindowHandle();
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		
		List<WebElement> ecommerce_links = driver.findElements(By.xpath("//a[@target='_blank']"));
		for (WebElement web : ecommerce_links) {
			web.click();
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		
		Set<String> childHandles = driver.getWindowHandles();
		
		for (String str : childHandles) {
			driver.switchTo().window(str);
			String actual_url = driver.getCurrentUrl();
			
			//dws
			if (dws_expected_url.equals(actual_url)) {
				Thread.sleep(3000);
				driver.findElement(By.id("small-searchterms")).sendKeys("Laptop");
				Thread.sleep(500);
				driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
				Thread.sleep(1000);
				
			}
			//google
			else if (google_expected_url.equals(actual_url)) {
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[contains(@class,'nav__check-availability-button nav__button glue-button glue-button--high-emphasis')]")).click();
				Thread.sleep(1000);
			}
			//youtube
			else if (youtube_expected_url.equals(actual_url)) {
				Thread.sleep(3000);
				WebElement search = driver.findElement(By.xpath("//input[contains(@name,'search_query')]"));
			    act.click(search).sendKeys("Mr beast").keyDown(Keys.ENTER).perform();
			    Thread.sleep(2000);	
			}
			//twitter
			else if (twitter_expected_url.equals(actual_url)) {
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[text()='Create account']")).click();
				Thread.sleep(1000);
			}
			//facebook
			else if (facebook_expected_url.equals(actual_url)) {
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[text()='Create new account']")).click();
				Thread.sleep(1000);
			}
			Thread.sleep(2000);
		}		
		postCondition2();
	}
}
