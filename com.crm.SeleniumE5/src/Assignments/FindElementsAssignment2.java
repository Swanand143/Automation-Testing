package assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsAssignment2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//open the browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		//enter into dws site
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//Click on digital downloads link
		driver.findElement(By.xpath("(//div[contains(@class,'header-menu')]/ul/li[5]/a)[1]")).click();
		Thread.sleep(2000);
		
		//Add all the products of digital downloads into cart
		List<WebElement> addtocart = driver.findElements(By.xpath("//div[contains(@class,'add-info')]/div[2]/input"));
		for (WebElement web1 : addtocart) {
			web1.click();
			Thread.sleep(2000);
		}
		
		//Click On Shopping cart
		driver.findElement(By.xpath("//li[contains(@id,'topcartlink')]/a/span[1]")).click();
		Thread.sleep(2000);
		
		//Store all product prices
		ArrayList<Double> price2 = new ArrayList<Double>();
		List<WebElement> price = driver.findElements(By.xpath("(//table[contains(@class,'cart')])[1]//tbody/tr/td[4]/span[2]"));
		//converting string prices to double and store into ArrayList
		for (WebElement webElement : price) {
			price2.add(Double.parseDouble(webElement.getText()));
		}	
		//Find the max price from Double ArrayList
		double max = Collections.max(price2);
		
		//Click on the Check box which have max price
	    driver.findElement(By.xpath("(//span[contains(text(),'"+max+"')])[3]/../preceding-sibling::td/input")).click();
	    Thread.sleep(1000);
	    
	    //Removing Max price product and update the cart
	    driver.findElement(By.name("updatecart")).click();
	   
	    // Verify that The Max Price Product Successfully removed or not
	    try {
	    	driver.findElement(By.xpath("(//span[contains(text(),'"+max+"')])[2]/../preceding-sibling::td/input")).click();
	    	System.out.println("Product Not Removed");
		} catch (Exception e) {
			System.out.println("The highest Price Product Successfully Removed");
		}
	    
	    //close browser
		Thread.sleep(2000);
		driver.quit();	
	}

}
