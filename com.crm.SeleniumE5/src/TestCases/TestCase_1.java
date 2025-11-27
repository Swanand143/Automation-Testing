package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class TestCase_1 extends BaseClass{
	
	public static void main(String[] args) throws Exception {
		
		String actual_url = "https://demowebshop.tricentis.com/";
		
		//open,maximize,enter
		preCondition("Chrome", "https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//verification by url
		if (actual_url.equals(driver.getCurrentUrl())) {
			
			System.out.println("Test Case Passed You are in the right website");
			
			//login
			login();
			Thread.sleep(2000);
			
			WebElement gift_card = driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"));
			Actions act = new Actions(driver);
			
			//Scroll down
			act.scrollByAmount(0, 400).perform();
			Thread.sleep(1000);
			
			//click on 25$ gift card
			gift_card.click();
			
			//fill all the gift card details
			driver.findElement(By.xpath("(//div[@class='giftcard']/div/input)[1]")).sendKeys("Swanand Gholap");
			Thread.sleep(500);
			driver.findElement(By.xpath("(//div[@class='giftcard']/div/input)[2]")).sendKeys("swanandgholap@gmil.com");
			Thread.sleep(500);
			driver.findElement(By.className("message")).sendKeys("Thank You");
			Thread.sleep(500);
			driver.findElement(By.id("addtocart_2_EnteredQuantity")).clear();
			driver.findElement(By.id("addtocart_2_EnteredQuantity")).sendKeys("2");
			Thread.sleep(500);
			
			//click on add to cart
			driver.findElement(By.id("add-to-cart-button-2")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
			Thread.sleep(2000);
			
			//verify gift card added or not
			try {
				driver.findElement(By.xpath("(//a[text()='$25 Virtual Gift Card'])[2]"));
				System.out.println("The Gift Card Added Successfully in the Shopping cart");
			} catch (Exception e) {
				postCondition1();
				throw new Exception("The Gift Not Added to Cart");
			}
			
			Thread.sleep(4000);
			postCondition2();
			System.out.println();
			
		}
		else {
			postCondition2();
			throw new Exception("Test Case Failed You are in the wrong page");
		}	
	}
}
