package TestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class CheckProductAddedTestCase_03 extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		preCondition("chrome","https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		login();
		
		String added_product = driver.findElement(By.xpath("(//h2[@class='product-title'])[1]")).getText();
		
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Aditya");
		Thread.sleep(500);
		
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("aditya12@gmail.com");
		Thread.sleep(500);
		
		driver.findElement(By.id("giftcard_2_Message")).sendKeys("Thank You !");
		Thread.sleep(500);	
		
		driver.findElement(By.id("add-to-cart-button-2")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
		Thread.sleep(1000);
		
		String actual_product = driver.findElement(By.className("product-name")).getText();
		
		if (added_product.equals(actual_product)) {
			System.out.println("Product Added Successfully");
		} else {
			System.out.println("Product Not Added !");
		}

		
		
		logout();
		Thread.sleep(2000);
		postCondition2();
		
	}

}
