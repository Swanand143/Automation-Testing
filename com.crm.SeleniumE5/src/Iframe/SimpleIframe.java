package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class SimpleIframe extends BaseClass {
	
	public static void main(String[] args) {
		
		preCondition("chrome", "https://demo.automationtesting.in/Frames.html");
		
		// 3 ways to switch the controller from main page to iframe page
		
		//driver.switchTo().frame(0);// by passing index
		
		//driver.switchTo().frame("singleframe"); by passing id
		
		WebElement webElement = driver.findElement(By.xpath("//iframe[@id='singleframe']")); // by passing direct webelement
		
		driver.switchTo().frame(webElement);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Swanand");
		
		postCondition2();
		
	}

}
