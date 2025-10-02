package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopRegi {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver regi = new ChromeDriver();
		regi.manage().window().maximize();
		regi.get("https://demowebshop.tricentis.com/");
		Thread.sleep(500);
		regi.findElement(By.linkText("Register")).click();
		Thread.sleep(500);
		regi.findElement(By.id("gender-male")).click();
		Thread.sleep(400);
		regi.findElement(By.name("FirstName")).sendKeys("Swanand");
		Thread.sleep(400);
		regi.findElement(By.id("LastName")).sendKeys("Gholap");
		Thread.sleep(400);
		regi.findElement(By.name("Email")).sendKeys("swanandg12@gamil.com");
		Thread.sleep(400);
		regi.findElement(By.id("Password")).sendKeys("Swanand@143");
		Thread.sleep(400);
		regi.findElement(By.name("ConfirmPassword")).sendKeys("Swanand@143");
		Thread.sleep(1000);
		regi.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		regi.quit();
		
	}
}
