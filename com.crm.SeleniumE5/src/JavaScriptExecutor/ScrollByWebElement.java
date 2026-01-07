package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class ScrollByWebElement extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		preCondition("Chrome", "https://demowebshop.tricentis.com/");
	
		JavascriptExecutor js = (JavascriptExecutor) driver;//downcasting
		WebElement computer = driver.findElement(By.xpath("//a[text()='Build your own computer']"));
		js.executeScript("arguments[0].scrollIntoView(false);", computer);
		
		Thread.sleep(3000);
		driver.quit();	
	}

}
