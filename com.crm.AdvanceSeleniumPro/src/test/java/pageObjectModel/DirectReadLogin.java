package pageObjectModel;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.Login;

public class DirectReadLogin {
	
	@Test
	public void main() throws InterruptedException {
		
		WebDriver dir = new ChromeDriver();
		dir.manage().window().maximize();
		dir.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dir.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Login log = new Login(dir);
		
		//Direct access
		//log.username.sendKeys("Admin");
		//log.password.sendKeys("admin123");
		//log.username.sendKeys("Admin");
		//log.login_button.click();
		

		log.enterUsername("Rohit");
		log.enterPassword("Rohit123");
		log.clickLogin();
		Thread.sleep(2000);
		dir.close();
		
		
	}

}
