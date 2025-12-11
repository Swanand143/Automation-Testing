package LandingPage;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	
	@Test(priority = 0)
	public void tc_001() throws Exception{
		
		String username = "Admin";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement usernameTextField = driver.findElement(By.name("username"));
		usernameTextField.sendKeys(username);
		String currentData = usernameTextField.getAttribute("value");
		if (username.equals(currentData)) {
			System.out.println("Data Successfully Passed");
		} else {
			driver.quit();
            throw new Exception("Data is not passed inside username textfield and Testcase Failed");
		}
		driver.quit();
	}
	
	@Test(priority = 1)
	public void tc_002() throws Exception{
		
		String password = "admin123";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement passwordTextField = driver.findElement(By.name("password"));
		passwordTextField.sendKeys(password);
		String currentData = passwordTextField.getAttribute("value");
		if (password.equals(currentData)) {
			System.out.println("Data Successfully Passed");
		} else {
			driver.quit();
            throw new Exception("Data is not passed inside username textfield and Testcase Failed");
		}
		driver.quit();
	}
	
	@Test(priority = 2)
	public void tc_003() throws Exception{
		
		String expected_url = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String username = "Admin";
		String password = "admin123";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement usernameTextField = driver.findElement(By.name("username"));
		usernameTextField.sendKeys(username);
		WebElement passwordTextField = driver.findElement(By.name("password"));
		passwordTextField.sendKeys(password);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(1000);
		String actual_url = driver.getCurrentUrl();
		if (expected_url.equals(actual_url)) {
			System.out.println("Login is successful and TestCase Pass");
		} else {
			driver.quit();
            throw new Exception("Login is unsuccessful and TestCase Fail");
		}
		driver.quit();
	}
	
}
