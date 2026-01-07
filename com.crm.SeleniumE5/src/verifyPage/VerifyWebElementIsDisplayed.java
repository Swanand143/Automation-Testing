package verifyPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyWebElementIsDisplayed {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement register = driver.findElement(By.className("ico-register"));
		
		if (register.isDisplayed()) {
			register.click();
			System.out.println("Test Case Passed!");
		}
		else {
			driver.quit();
			System.out.println("Test Case Failed");
			throw new Exception("Register is not displayed and Test Case Failed");
		}
		
		driver.quit();
	}
}
