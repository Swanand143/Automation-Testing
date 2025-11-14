package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement copy = driver.findElement(By.xpath("//span[text()='Copy']"));
		
		//With Argument Actions class right click method 
		act.contextClick(rightClickMe).click(copy).perform();
		
		//without argument Actions class right click method
		//act.moveToElement(rightClickMe).contextClick().click(copy).perform();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
