package AssertionsMethods;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HardAssertTrueAndFalse {
	
	@Test
	public void main() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		WebElement username= driver.findElement(By.name("username"));
		assertTrue(username.isEnabled(),"username textfield is disabled");
		username.sendKeys("Admin");
		
		driver.quit();
		
	}

}
