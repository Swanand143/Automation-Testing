package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class DemoQSPNestedMultipleIframe extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		preCondition("chrome", "https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		
		WebElement frame1 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
		driver.switchTo().frame(frame1);	
		driver.switchTo().frame(0);
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(1);
		driver.findElement(By.id("password")).sendKeys("Admin@1234");
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(2);
		driver.findElement(By.id("confirm")).sendKeys("Admin@1234");
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(3);
		driver.findElement(By.id("submitButton")).click();
		
		Thread.sleep(2000);
		postCondition2();
		
	}

}
