package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators7 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		//driver.findElement(By.id("small-searchterms")).sendKeys("Laptop");
		//Thread.sleep(1000);
		//driver.findElement(By.cssSelector("input[type='submit']")).click();
		                           // Or
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Laptop");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
		                 
		Thread.sleep(3000);
		driver.quit();
	}

}
