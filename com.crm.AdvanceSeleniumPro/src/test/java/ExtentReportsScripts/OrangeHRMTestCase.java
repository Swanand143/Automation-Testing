package ExtentReportsScripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.LoginBase;
import com.crm.Listeners.ExtentReportsForTestCase;

@Listeners(com.crm.Listeners.ExtentReportsForTestCase.class)
public class OrangeHRMTestCase extends LoginBase {
	
	@Test
	public void tc_001() {
		
		WebElement username = driver.findElement(By.name("username"));
		assertTrue(username.isEnabled());
		
	}
	
	@Test(dependsOnMethods = "tc_003")
	public void tc_002() {
		
		String name = "Admin";
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(name);
		assertEquals(username.getAttribute("value"), name);
		
	}
	
	@Test
	public void tc_003() {
		
		WebElement password = driver.findElement(By.name("password"));
		assertTrue(password.isEnabled());
		fail();
		
	}

}
