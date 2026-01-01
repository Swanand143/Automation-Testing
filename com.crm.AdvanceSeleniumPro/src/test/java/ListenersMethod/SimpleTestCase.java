package ListenersMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.AdvanceSeleniumPro.BaseClass.BaseClass1;

@Listeners(com.crm.Listeners.FailTestCaseScreenShot.class)

public class SimpleTestCase extends BaseClass1{
	
	@Test(priority = 0)
	public void main1() {
		assertEquals("java", "java","It is not same");
		Reporter.log("main1 It is same",true);
	}
	@Test(priority = 1)
	public void main2() {
		driver.findElement(By.xpath("//button[@title='Assign Leave']")).click();
		assertEquals("holi", "pholi","It is not same");
		Reporter.log("main2 It is same",true);
	}
	@Test(priority = 2,dependsOnMethods = "main2")
	public void main3() {
		assertEquals("koli", "koli","It is not same");
		Reporter.log("main3 It is same",true);
	}

}
