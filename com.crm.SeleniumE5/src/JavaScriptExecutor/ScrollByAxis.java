package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;

import UtilityClass.BaseClass;

public class ScrollByAxis extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		preCondition("Chrome", "https://demowebshop.tricentis.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;//downcasting
		js.executeScript("window.scrollBy(0,500)");//scrollBy
		Thread.sleep(4000);
		//js.executeScript("window.scrollTo(0,300)");//scrollTo
		js.executeScript("window.scrollBy(0,-500)");
		
		Thread.sleep(4000);
		driver.quit();
		
	}

}
