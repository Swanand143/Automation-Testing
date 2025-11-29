package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class DemoQSPSimpleIframe extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		preCondition("chrome", "https://demoapps.qspiders.com/ui/frames?sublist=0");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.id("username")).sendKeys("Swanand");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("abcD@12");
		Thread.sleep(1000);
		driver.findElement(By.id("submitButton")).click();
		
		
		Thread.sleep(3000);
		postCondition2();
		
	}

}
