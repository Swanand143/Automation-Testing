package ActionsClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DWSRegisterTaskWithoutFindElement {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
	    act.keyDown(Keys.TAB).perform();
		Thread.sleep(1000);
		act.keyDown(Keys.TAB).keyDown(Keys.ENTER).perform();
		Thread.sleep(2000);
		
		for (int i = 1; i <= 30; i++) {
			
			act.keyDown(Keys.TAB).perform();
			
			if (i>24) {
				if (i==25) {
					act.sendKeys(Keys.SPACE).perform();
					Thread.sleep(500);
				} 
				else if (i==26) {
					act.sendKeys("Swanand").perform();
					Thread.sleep(500);
				} 
				else if (i==27) {
					act.sendKeys("Gholap").perform();
					Thread.sleep(500);
				} 
				else if (i==28) {
					act.sendKeys("Swanand12@gamil.com").perform();
					Thread.sleep(500);
				} 
				else if (i==29) {
					act.sendKeys("Swanand@1234").perform();
					Thread.sleep(500);
				} 
				else if (i==30) {
					act.sendKeys("Swanand@1234").perform();
					Thread.sleep(500);
				}

			}
			
		}
		
		Thread.sleep(3000);
		driver.quit();	
	}

}
