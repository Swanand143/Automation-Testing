package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import UtilityClass.BaseClass;

public class ClickOnDisableElement extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		preCondition("Chrome", "https://www.oracle.com/in/java/technologies/downloads/");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;//downcasting
		WebElement jdk = driver.findElement(By.linkText("jdk-17.0.17_linux-aarch64_bin.tar.gz"));
		js.executeScript("arguments[0].scrollIntoView(false);", jdk);
		jdk.click();
		Thread.sleep(2000);
		
		WebElement disable_element = driver.findElement(By.linkText("Download jdk-17.0.17_linux-aarch64_bin.tar.gz"));
		js.executeScript("arguments[0].click();", disable_element); // click on the disable element
		
		Thread.sleep(3000);
		postCondition2();
	}

}
