package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ShopperStack {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://shoppersstack.com/");
		driver.findElement(By.id("men")).click();
		
		try {
			driver.findElement(By.xpath("//div[contains(@class,'MuiPaper_root']"));
			System.out.println("Product is find and TestCase Pass");
		} catch (Exception e) {
			String name = "ShoppersStackMen";
			LocalDateTime date = LocalDateTime.now();
			String time = date.toString().replace(":","-");
			String fileName = name+time;
			TakesScreenshot ts = (TakesScreenshot) driver;//downcasting
			Thread.sleep(1000);
			File from = ts.getScreenshotAs(OutputType.FILE);
			File to = new File("D:\\Selenium\\SeleniumScreenShot\\"+fileName+".png");
			FileHandler.copy(from, to);
			driver.quit();
			throw new Exception("Product is not found and TestCase Fail");
		}
		
		driver.quit();		
	}
}
