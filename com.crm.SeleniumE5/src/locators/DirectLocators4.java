package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(1000);
		driver.findElement(By.className("ico-register")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("gender-male")).click();
	    Thread.sleep(3000);
	    driver.quit();
		
		
	}

}
