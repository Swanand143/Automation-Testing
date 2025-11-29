package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class DemoQSPNestedIframe extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		preCondition("chrome", "https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(frame);
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Admin@1234");
		Thread.sleep(1000);
		driver.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
		Thread.sleep(1000);
		driver.findElement(By.id("submitButton")).click();
		
		Thread.sleep(3000);
		postCondition2();
		
	}

}
