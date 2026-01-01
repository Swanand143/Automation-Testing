package ListenersMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.AdvanceSeleniumPro.BaseClass.BaseClass1;

@Listeners(com.crm.Listeners.FailTestCaseScreenShot.class)
public class TestCaseFail extends BaseClass1 {
	
	@Test
	public void assignLeave() throws InterruptedException {
		
		//driver.findElement(By.xpath("//button[@title='Assign Leave']")).click();
		String actual_url = driver.getCurrentUrl();
		assertEquals(actual_url, "https://opensource-demo.orangehrmlive.com/web/index.php/leave/assignLeave","Not In The Assign Leave Page");
		Reporter.log("Successfully Enter In The Assign Leave Page", true);
		Thread.sleep(2000);
	}
}
