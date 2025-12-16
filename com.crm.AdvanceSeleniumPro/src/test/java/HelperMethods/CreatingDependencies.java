package HelperMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreatingDependencies {
	
	@Test(dependsOnMethods = "createAccount",priority = 0)
	public void deleteAccount() {
		System.out.println("I am Delete Account");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalchallengers.com/");
		driver.quit();
	}
	
	@Test(priority = 1)
	public void createAccount() throws Exception {
		System.out.println("I am Create Account");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.chennaisuperkings.com/");
		driver.quit();
		throw new Exception("Acoount is not created Test Case Failed");
	}
	
	@Test(dependsOnMethods = "createAccount",priority = 2)
	public void updateAccount() {
		System.out.println("I am update Account");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.mumbaiindians.com/");
		driver.quit();
	}

}
