package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.AdvanceSeleniumPro.BaseClass.BaseClass1;

public class OrangeHRM extends BaseClass1 {
	
	@Test
	public void testcase_001() throws Exception{
		
		WebElement assign_leave = driver.findElement(By.xpath("//button[@title='Assign Leave']"));
		
		if (assign_leave.isDisplayed()) {
			System.out.println("Test Case Pass and Assign Leave is Displayed");
		}
		else {
			driver.quit();
			throw new Exception("Test Case Fail and Assign Leave is not Displayed");
		}
		
	}
	
	@Test
	public void testcase_002() throws Exception{
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Admin");
		
		WebElement admin = driver.findElement(By.xpath("//span[text()='Admin']"));
		
		if (admin.isDisplayed()) {
			System.out.println("Test Case Pass and Admin is Displayed");
		}
		else {
			driver.quit();
			throw new Exception("Test Case Fail and Admin is not Displayed");
		}
		
	}
	
	@Test
	public void testcase_003() throws Exception{
		
		WebElement apply_leave = driver.findElement(By.xpath("//button[@title='Apply Leave']"));
		
		if (apply_leave.isEnabled()) {
			System.out.println("Test Case Pass and Assign Leave is Enabled");
		}
		else {
			driver.quit();
			throw new Exception("Test Case Fail and Assign Leave is not Enabled");
		}
		
	
		
	}

}
