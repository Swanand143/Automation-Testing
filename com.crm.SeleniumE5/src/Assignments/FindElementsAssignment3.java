package assignments;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsAssignment3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(text(),'Gift Cards')])[1]")).click();
		Thread.sleep(2000);
		
		List<WebElement> addtocart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		
		for (int i = 0; i < addtocart.size(); i++) {
			
			driver.findElements(By.xpath("//input[@value='Add to cart']"));
			addtocart.get(i).click();
			Thread.sleep(3000);
			
			for (int j = i+1; j <= i+1 ; j++) {
				
					driver.findElement(By.id("giftcard_"+j+"_RecipientName")).sendKeys("Karan");
					Thread.sleep(1000);
					driver.findElement(By.id("giftcard_"+j+"_SenderName")).sendKeys("Swanand");
					Thread.sleep(1000);
					driver.findElement(By.id("giftcard_"+j+"_Message")).sendKeys("Hi This Is Your Birthday Gift Enjoy!!!");
					Thread.sleep(1000);
				
				    if (i<2) {
					    driver.findElement(By.id("giftcard_"+j+"_RecipientEmail")).sendKeys("karan12@gmail.com");
					    Thread.sleep(1000);
					    driver.findElement(By.id("giftcard_"+j+"_SenderEmail")).sendKeys("swanand143@gmail.com");
					    Thread.sleep(1000);
				   }
				   driver.findElement(By.id("add-to-cart-button-"+j)).click();
				   Thread.sleep(2000);			
			}
			driver.navigate().back();
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
