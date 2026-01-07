package verifyPage;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class VerifyAttributeValue_02 {
public static void main(String[] args) throws InterruptedException {
		
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		String title = "OrangeHRM";
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		String username = driver.findElement(By.xpath("(//p[contains(@class,'oxd-text oxd-text--p')])[1]")).getText();
		username = username.substring(11, username.length());
		
		String pass = driver.findElement(By.xpath("(//p[contains(@class,'oxd-text oxd-text--p')])[2]")).getText();
		pass = pass.substring(11, pass.length());
		
		Thread.sleep(5000);
		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys(username);
		String userValue = usernameField.getAttribute("value");
				
		Thread.sleep(5000);
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys(pass);
		String passValue = passwordField.getAttribute("value");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@type, 'submit')]")).click();
		Thread.sleep(5000);
		
		
//		To verify the Credentials are matched successfully!
		if (username.equals(userValue) && pass.equals(passValue)) {
			System.out.println("Credentials Matched Successfully!");
		}
		
		
		if (url.equals(driver.getCurrentUrl())) {
			Thread.sleep(2000);
			System.out.println("User Login Successfully Done!");
		}
		else {
			System.out.println("User does not login!");
		}
		 
		driver.quit();
		
	}
}
