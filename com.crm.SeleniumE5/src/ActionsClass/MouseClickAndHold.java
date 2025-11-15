package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClickAndHold {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Static.html");
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("mongo"));
		WebElement target = driver.findElement(By.id("droparea"));
		//with argument
		act.clickAndHold(source).release(target).perform();
		
		
        Thread.sleep(2000);
		driver.quit();	
		
	}

}
