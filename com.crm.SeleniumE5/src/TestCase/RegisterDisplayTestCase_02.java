package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class RegisterDisplayTestCase_02 extends BaseClass {
	
	public static void main(String[] args) throws Exception {
		
		preCondition("chrome","https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		login();
		
		try {
			driver.findElement(By.className("ico-register"));
			postCondition2();
			System.out.println("Register is displayed and Test Case Pass");
		} catch (Exception e) {
			postCondition2();
			throw new Exception("Register link is not displayed Test Case Fail");
		}
		
		Thread.sleep(2000);
		
	}

}
