package Executions2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Leave {
	
	@Test(groups = "retesting")
	public void tc_007() {
		Reporter.log("I am Leave TC_007", true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		driver.quit();
	}
	@Test(groups = "retesting")
	public void tc_008() {
		Reporter.log("I am Leave TC_008", true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		driver.quit();
	}

}
