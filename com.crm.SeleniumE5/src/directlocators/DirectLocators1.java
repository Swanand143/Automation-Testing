package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		//by tagname
		WebElement searchfield = driver.findElement(By.tagName("input"));
		searchfield.sendKeys("Playstation 5");
//		WebElement searchfield = driver.findElement(By.tagName("a"));
		
		//by classname
	    //driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.className("button-1")).click();
		Thread.sleep(3000);
		driver.close();
			
	}

}
