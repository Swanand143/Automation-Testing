package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Static.html");
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		
		WebElement source1 = driver.findElement(By.id("node"));
		WebElement source2 = driver.findElement(By.id("mongo"));
		WebElement source3 = driver.findElement(By.id("angular"));
		WebElement target = driver.findElement(By.id("droparea"));
		
		act.dragAndDrop(source1, target).perform();
		Thread.sleep(2000);
		
		act.dragAndDrop(source2, target).perform();
		Thread.sleep(2000);

		act.dragAndDrop(source3, target).perform();
		Thread.sleep(2000);
		
		driver.quit();	
		
	}
}
