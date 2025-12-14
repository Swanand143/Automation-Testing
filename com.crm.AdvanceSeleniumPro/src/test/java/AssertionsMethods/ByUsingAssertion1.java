package AssertionsMethods;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ByUsingAssertion1 {
	
	@Test
	public void main() throws InterruptedException {
		
		String Expected_LandingPage = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String Actual_LandingPage = driver.getCurrentUrl();
		
		assertEquals(Actual_LandingPage, Expected_LandingPage, "I am not in login page");
		Reporter.log("I am in login page", true);
		
		WebElement usernameTextField = driver.findElement(By.name("username"));
		usernameTextField.sendKeys("Admin");
		WebElement passwordTextField = driver.findElement(By.name("password"));
		passwordTextField.sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(1000);
		String Actual_HomePage = driver.getCurrentUrl();
		
		assertNotEquals(Actual_HomePage,Expected_LandingPage, "login is unsuccessful");
		Reporter.log("Login is successful", true);
		driver.quit();
	}

}
