package PopUp.ChildBrowserPopUp;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

// child browser alert
public class ChildBrowser extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		preCondition("chrome","https://demowebshop.tricentis.com/");
		String parentHnadle = driver.getWindowHandle();
		Thread.sleep(1000);
		
		WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
		
		Actions act = new Actions(driver);
		act.scrollToElement(facebook).perform();
		Thread.sleep(500);
		facebook.click();
		Thread.sleep(1500);
		
		Set<String> childHandles = driver.getWindowHandles();
		childHandles.remove(childHandles);
        for (String str : childHandles) {
			driver.switchTo().window(str);
		}
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//span[text()='Create new account']")).click();
        
        Thread.sleep(2000);
        postCondition2();
		
		
		
	}

}
