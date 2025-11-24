package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathByAttribute {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		// Xpath By Attribute
		driver.findElement(By.xpath("//label[@for='pollanswers-1']")).click();
		Thread.sleep(2000);
	
		Thread.sleep(3000);
		driver.quit();
		
	}

}
