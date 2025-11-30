package Iframe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class DemoQSPWindowAlertIframe extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		preCondition("chrome", "https://demoapps.qspiders.com/ui/frames/frameAlert?sublist=4");
		
		WebElement frame1 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//button[@class='buy-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("buy-btn")).click();
		Thread.sleep(1000);
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		Thread.sleep(3000);
		postCondition2();
		
	}

}
