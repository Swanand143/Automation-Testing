package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class SwitchToMainPage extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		preCondition("chrome", "https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		WebElement outerIframe = driver.findElement(By.xpath("(//iframe)[2]"));
		driver.switchTo().frame(outerIframe);// switch to outer iframe
		WebElement innerIframe = driver.findElement(By.xpath("(//iframe)[1]"));
		driver.switchTo().frame(innerIframe);// switch to inner iframe
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Swanand");
		
		driver.switchTo().defaultContent();// directly switch to main or default page
		driver.findElement(By.linkText("Home")).click();
		
		Thread.sleep(2000);
		postCondition2();
		
	}

}
