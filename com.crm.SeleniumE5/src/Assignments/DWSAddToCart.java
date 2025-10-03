package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWSAddToCart {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".button-2.product-box-add-to-cart-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Karan");
		Thread.sleep(500);
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("karan12@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.id("giftcard_2_SenderName")).sendKeys("Swanand");
		Thread.sleep(500);
		driver.findElement(By.id("giftcard_2_SenderEmail")).sendKeys("swanand143@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.id("giftcard_2_Message")).sendKeys("Hi This Is Your Birthday Gift Enjoy!!!");
		Thread.sleep(500);
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).clear();
		Thread.sleep(500);
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).sendKeys("2");
		Thread.sleep(500);
		driver.findElement(By.id("add-to-cart-button-2")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("cart-label")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("removefromcart")).click();   
		driver.findElement(By.name("updatecart")).click(); 
		Thread.sleep(3000);
		driver.quit();
	}

}
