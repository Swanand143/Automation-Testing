package HelperMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//parallel execution in method level
//rcb open in 3 tabs at a time 
public class ThreadPoolSize {
	
	@Test(priority = 1)
	public void Mi() {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.mumbaiindians.com/");
		driver.quit();
		
	}
	
	@Test(priority = 2,invocationCount = 2,threadPoolSize = 2)
	public void csk() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.chennaisuperkings.com/");
		driver.quit();
		
	}
	
	@Test(priority = 0, invocationCount = 3, threadPoolSize = 3)
	public void rcb() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalchallengers.com/");
		driver.quit();
		
	}

}
