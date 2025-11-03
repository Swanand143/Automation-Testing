package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPage2 {
	
	public static void main(String[] args) throws Exception {
		
		//open browser --> maximize browser --> enter into dws site
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		// click on digital downloads link
        driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
        Thread.sleep(2000);

        // Add first, second, and third products
        driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
        Thread.sleep(1000);
		
		//click on shopping cart button
	    driver.findElement(By.id("topcartlink")).click();
	    Thread.sleep(1000);
	    
	    // Remove the 3rd album product
        driver.findElement(By.xpath("(//input[@name='removefromcart'])[1]")).click(); // select 3rd ard product
        driver.findElement(By.name("updatecart")).click(); // click update cart
        Thread.sleep(2000);
        
        // Verify if the 3rd album product is removed
        try {
            driver.findElement(By.xpath("//a[contains(text(), '3rd Album')]"));
            System.out.println("Defect Found!");
            throw new Exception("3rd Product Not Removed!");
        } catch (Exception e) {
            System.out.println("3rd Product Successfully Removed!");
        }
		
		Thread.sleep(4000);
		driver.quit();
		
	}

}
