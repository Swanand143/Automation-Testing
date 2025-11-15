package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseScrollingToElement {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		WebElement headline = driver.findElement(By.xpath("//h3[text()='My account']"));
		
		//scrolling based on the web element
		act.scrollToElement(headline).perform();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
