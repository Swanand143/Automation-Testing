package ActionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardKeyPress {
	
	public static void main(String[] args) throws Exception {
		
		String expected_url = "https://demowebshop.tricentis.com/register";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		//pressing the TAB key 2 times
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(2000);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(2000);
		
		//Clicking the Register button
		act.keyDown(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		//Verifying that we have click and present in the register page or not
		String actual_url = driver.getCurrentUrl();
		if (expected_url.equals(actual_url)) {
			System.out.println("TestCase Pass!");
		} else {
			driver.quit();
			throw new Exception("TestCase Fail Because Im not in Register Page");
		}
		
		driver.quit();
	}
}
