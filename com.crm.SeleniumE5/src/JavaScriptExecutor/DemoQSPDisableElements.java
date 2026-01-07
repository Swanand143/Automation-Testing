package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class DemoQSPDisableElements extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		preCondition("Chrome", "https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
		//disable textfield
		driver.findElement(By.xpath("(//ul)[1]/li[5]")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;//downcasting
		
		WebElement name = driver.findElement(By.id("name"));
		js.executeScript("arguments[0].value='Swanand Gholap';", name);
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].value='swanandgholap14@gmail.com';", email);
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.id("password"));
		js.executeScript("arguments[0].value='Swanand@14';", password);
		Thread.sleep(3000);	
		
//-------------------------------------------------------------------------------------------------------------
		
		//disable button
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Disabled']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btn_abc")).click();
		Thread.sleep(1000);
		
		WebElement button = driver.findElement(By.id("submit"));
		js.executeScript("arguments[0].disabled = false;", button);
		js.executeScript("arguments[0].click();", button);
		Thread.sleep(2000);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);
		
//-------------------------------------------------------------------------------------------------------------------
		
		//disable checkbox
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Disabled']")).click();
		Thread.sleep(1000);
		
		WebElement whatsApp = driver.findElement(By.id("domain_b"));
		js.executeScript("arguments[0].disabled = false;", whatsApp);
		js.executeScript("arguments[0].click();", whatsApp);
		Thread.sleep(1500);
		
		WebElement noThanks = driver.findElement(By.id("mode_aaa"));
		js.executeScript("arguments[0].disabled = false;", noThanks);
		js.executeScript("arguments[0].click();", noThanks);
		Thread.sleep(1500);
		
		WebElement samePro = driver.findElement(By.id("asa"));
		js.executeScript("arguments[0].disabled = false;", samePro);
		js.executeScript("arguments[0].click();", samePro);
		Thread.sleep(1500);
		
		driver.findElement(By.id("subm")).click();
		Thread.sleep(1000);
		
//---------------------------------------------------------------------------------------------------------------------		
		
		//disable radio button
		driver.findElement(By.xpath("//section[text()='Radio Button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Disabled']")).click();
		Thread.sleep(1000);
		
		WebElement upi = driver.findElement(By.id("attended_ab"));
		js.executeScript("arguments[0].disabled = false;", upi);
		js.executeScript("arguments[0].click();", upi);
		Thread.sleep(1500);
		
		WebElement home = driver.findElement(By.id("willing_bc"));
		js.executeScript("arguments[0].disabled = false;", home);
		js.executeScript("arguments[0].click();", home);
		Thread.sleep(1500);
		
		driver.findElement(By.id("continuebtn")).click();
		
		Thread.sleep(3000);
		postCondition2();	
	}
}
