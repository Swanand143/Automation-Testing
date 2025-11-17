	package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//open apparel & shoes page in new window
public class KeyboardAndMouseBoth2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		//shift + click
		WebElement appNShoes = driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]"));
		act.keyDown(Keys.SHIFT).click(appNShoes).perform();
		
		Thread.sleep(3000);
		driver.quit();		
	}
}
