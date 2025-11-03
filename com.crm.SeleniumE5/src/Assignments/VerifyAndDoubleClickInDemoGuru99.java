package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyAndDoubleClickInDemoGuru99 {
	
	public static void main(String[] args) throws Exception {
		
		String url="https://demo.guru99.com/test/simple_context_menu.html";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		
		if (driver.getCurrentUrl().equals(url)) {
			
			System.err.println("You are in The Right Website");
			Actions act= new Actions(driver);
			
			WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			act.moveToElement(button).doubleClick().perform();
			
		}
		else {
			throw new Exception("You are in the Wrong Website!");
		}
		Thread.sleep(2000);
		driver.quit();

		
	}

}
