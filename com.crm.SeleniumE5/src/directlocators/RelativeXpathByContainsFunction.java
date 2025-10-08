package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathByContainsFunction {
	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		//for text
		driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]")).click();
		
		//for attribute
		driver.findElement(By.xpath("contains(class='ico-register')")).click();

		Thread.sleep(3000);
		driver.quit();
		
	}

}
