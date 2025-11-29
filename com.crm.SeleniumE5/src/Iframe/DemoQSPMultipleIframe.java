package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class DemoQSPMultipleIframe extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		preCondition("chrome", "https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		
		WebElement frame1 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Admin@1234");
		Thread.sleep(1000);
		driver.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
		Thread.sleep(1000);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		WebElement frame2 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.id("username")).sendKeys("SuperAdmin@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("SuperAdmin@1234");
		Thread.sleep(1000);
		driver.findElement(By.id("submitButton")).click();
		
		Thread.sleep(3000);
		postCondition2();
		
	}

}
