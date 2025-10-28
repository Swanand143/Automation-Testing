package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathByMultipleComponents_02 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
//		xPath by multiple components using and operator
		driver.findElement(By.xpath("//a[text()='Men' and @class='desktop-main']")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}