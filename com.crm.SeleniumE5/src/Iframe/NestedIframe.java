package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class NestedIframe extends BaseClass {
	
	public static void main(String[] args) {
		
		preCondition("chrome", "https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		//driver.switchTo().frame(1);// switch to outer iframe
		//driver.switchTo().frame(0);// switch to inner iframe
		
		WebElement outerIframe = driver.findElement(By.xpath("(//iframe)[2]"));
		driver.switchTo().frame(outerIframe);// switch to outer iframe
		WebElement innerIframe = driver.findElement(By.xpath("(//iframe)[1]"));
		driver.switchTo().frame(innerIframe);// switch to inner iframe
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Swanand");
		
		postCondition2();
		
		
	}

}
