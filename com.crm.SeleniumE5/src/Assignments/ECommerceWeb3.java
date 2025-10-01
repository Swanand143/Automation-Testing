package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class ECommerceWeb3 {
	
	public static void main(String[] args)  {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.shopify.com/in");
		driver.quit();
		
	}

}
