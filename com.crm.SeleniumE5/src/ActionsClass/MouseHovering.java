package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		WebElement kids = driver.findElement(By.xpath("//a[@data-group='kids']"));
		
		
		//Action Class mouse-hovering method
		act.moveToElement(kids).perform();
		Thread.sleep(2000);
		
		WebElement ethnic_wear = driver.findElement(By.xpath("//a[text()='Ethnic Wear' and @data-reactid='357']"));
		
		//Action Class mouse-click method
		act.click(ethnic_wear).perform();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
