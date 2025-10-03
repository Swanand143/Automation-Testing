package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWSReadCommunityPoll {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		String poll= driver.findElement(By.cssSelector(".block.block-poll")).getText();
		System.out.println(poll);
		Thread.sleep(3000);
		driver.quit();
		
	}

}
