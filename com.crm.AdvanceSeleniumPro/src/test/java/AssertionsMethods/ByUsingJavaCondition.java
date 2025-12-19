package AssertionsMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingJavaCondition {
	
	public static void main(String[] args) throws Exception {
		
		String Expected_LandingPage = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String Actual_LandingPage = driver.getCurrentUrl();
		
		if (Expected_LandingPage.equals(Actual_LandingPage)) {
			System.out.println("I am in login");
			WebElement usernameTextField = driver.findElement(By.name("username"));
			usernameTextField.sendKeys("Admin");
			WebElement passwordTextField = driver.findElement(By.name("password"));
			passwordTextField.sendKeys("admin123");
			driver.findElement(By.cssSelector("button[type='submit']")).click();
			Thread.sleep(1000);
			
			String Actual_HomePage = driver.getCurrentUrl();
			if (Expected_LandingPage.equals(Actual_HomePage)) {
				driver.quit();
				throw new Exception("Login is unsuccessful");
			}
			else {
				System.out.println("Login is successful");
			}
		}
		else {
			System.out.println("I am not in login");
		}
		driver.quit();
	}

}
