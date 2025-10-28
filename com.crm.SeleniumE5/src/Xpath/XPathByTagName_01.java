package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPathByTagName_01 {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String poll = driver.findElement(By.xpath("(//strong)[5]")).getText();
		
		System.out.println(poll);
		
		driver.quit();
	}
}
