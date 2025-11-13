package UtilityClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass {
	
	public static WebDriver driver = null;
	
	public static void preCondition(String browser, String url)  {
		
       
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();	
		}
		else if (browser.equalsIgnoreCase("safari")) {
			
			driver = new SafariDriver();	
		}
		else if(browser.equalsIgnoreCase("internetexplorer")) {
			
			driver = new InternetExplorerDriver();	
		}
		else {
			
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Thread.sleep(2000);
		driver.get(url);		
	}
	
	public static void login() {
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("admin1414@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Admin123");
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
	}
	
	public static void logout() {
		driver.findElement(By.className("ico-logout")).click();
	}
	
	public static void postCondition1() {
		driver.close();
	}
	
	public static void postCondition2() {
		driver.quit();
	}
}
