package ActionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardSendKeysWithoutFindElement{
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		//pressing the TAB key 6 times
		for (int i = 0; i < 6; i++) {
			act.keyDown(Keys.TAB).perform();
			Thread.sleep(1000);
		}
		
		//sending values to text field
		act.sendKeys("Snacks").perform();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
