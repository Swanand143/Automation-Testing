package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsolutePathFillERegi {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[1]/div[1]/input")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[2]/input")).sendKeys("Swanand");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[3]/input")).sendKeys("Gholap");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/input")).sendKeys("sgmaster@gamil.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/input")).sendKeys("master123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/input")).sendKeys("master123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[4]/input")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
