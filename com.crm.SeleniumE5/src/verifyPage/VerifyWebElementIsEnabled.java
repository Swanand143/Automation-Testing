package verifyPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebElementIsEnabled {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement excellent = driver.findElement(By.id("pollanswers-1"));
		
	    if (excellent.isEnabled()) {
			System.out.println("Excellent radio button is enabled");
			excellent.click();
			Thread.sleep(1000);
			System.out.println("Pass");
		} 
	    else {
			driver.close();
			throw new Exception("Excellent radio button is not enabled and testscript fail");
		}
	    driver.close();
	 
	}
}
