package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDeSelect {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Chrome/demo.html");
		Thread.sleep(2000);
		
		WebElement multiSelect = driver.findElement(By.id("multiple_cars"));
		
		Select sel = new Select(multiSelect);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		
		sel.selectByVisibleText("BMW");
		Thread.sleep(2000);
		
		sel.selectByValue("for");
		Thread.sleep(2000);
		
		// DeSelect One By One
//		sel.deselectByIndex(1);
//		Thread.sleep(2000);
//		
//		sel.deselectByVisibleText("BMW");
//		Thread.sleep(2000);
//		
//		sel.deselectByValue("for");
		
		//Deselect At A Time
		sel.deselectAll();
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
