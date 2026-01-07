package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class HiddenElement extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		preCondition("Chrome", "https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;//downcasting
		WebElement hiddenElement = driver.findElement(By.id("custom_gender"));
		js.executeScript("arguments[0].value='Transgender';", hiddenElement); //hidden element
		
		
		Thread.sleep(5000);
		postCondition2();
		
	}

}
