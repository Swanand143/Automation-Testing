package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class SwitchToImmediateParaent extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		preCondition("chrome", "https://demo.automationtesting.in/Frames.html");
		//String handle = driver.getWindowHandle();--
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Swanand");
		driver.switchTo().parentFrame();// switching the iframe to parent page
		
		//driver.switchTo().window(handle);--
		driver.findElement(By.linkText("Home")).click();
		
		Thread.sleep(5000);
				
		postCondition2();
		
	}

}
