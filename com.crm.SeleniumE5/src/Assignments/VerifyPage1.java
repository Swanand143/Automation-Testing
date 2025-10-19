package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPage1 {
	
	public static void main(String[] args) throws Exception {
		
		//open browser --> maximize browser --> enter into dws site
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//click on login link
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(2000);

		//check login successfully or not
		try {
		    driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sgmaster@gamil.com");
		    Thread.sleep(500);
		    driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("master123");
		    Thread.sleep(500);
		    driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		    Thread.sleep(500);
		    driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		    Thread.sleep(500);
		    System.out.println("Login Successfull!");
		} catch (Exception e) {
		    driver.close();
		    System.out.println("Defect Found!");
		    throw new Exception("Credentials Mis-Matched!");
		}
		
		//click on add to cart for Build your own cheap computer product
		driver.findElement(By.xpath("//input[contains(@onclick,'/addproducttocart/catalog/72/1/1')]")).click();
		Thread.sleep(4000);

		//select processor as fast
		driver.findElement(By.xpath("//input[@id='product_attribute_72_5_18_65']")).click();
		Thread.sleep(1000);

		//select RAM as 8 GB
		driver.findElement(By.xpath("//input[@id='product_attribute_72_6_19_91']")).click();
		Thread.sleep(1000);

		//select HDD as 400 GB
		driver.findElement(By.xpath("//input[@id='product_attribute_72_3_20_58']")).click();
		Thread.sleep(1000);

		//select software as office suite
		driver.findElement(By.xpath("//input[@id='product_attribute_72_8_30_94']")).click();
		Thread.sleep(1000);

		
		//clear the quantity ---> fill quantity as 3
		WebElement qty = driver.findElement(By.id("addtocart_72_EnteredQuantity"));
		qty.clear();
		qty.sendKeys("3");
		Thread.sleep(1000);
		
		//click on add to cart button
		driver.findElement(By.id("add-to-cart-button-72")).click();
		Thread.sleep(1000);
		
		//click on shopping cart button
		driver.findElement(By.id("topcartlink")).click();
		Thread.sleep(1000);
		
		//here we verify whether the product is successfully added in the cart or not
		try {
            driver.findElement(By.linkText("Build your own cheap computer"));
            System.out.println("Product Added In The Cart Successfully!");
        } 
        catch (Exception e) {
            System.out.println("Defect Found: Product Not Added");
            throw new Exception("Item Not Added to Cart");
        } 
        Thread.sleep(000);
        
        //check login successfully or not
        try {
        	driver.findElement(By.className("ico-logout")).click();
        	System.out.println("Logout Successfull!");
		} catch (Exception e) {
			driver.close();
			System.out.println("Defect Found");
			throw new Exception("Logout Failed");
		}
        
        Thread.sleep(4000);
        driver.close();	
	}
}
