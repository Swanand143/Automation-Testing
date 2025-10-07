package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators8 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		//register
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		
		//log in 
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		
		//shop cart
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a")).click();
		
		//wishlist
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[1]")).click();
		
		//books
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")).click();
		
		//computer
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")).click();
		
		//electronics
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/a")).click();
		
		//appearel & shoes
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[4]/a")).click();
		
		//digital downloads
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[5]/a")).click();
		
		//jwelery
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[6]/a")).click();
		
		//gift cards
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[7]/a")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
			
	}

}
