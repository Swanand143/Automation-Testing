package AssertionsMethods;

import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertNotNull {
	
	@Test
	public void main() {
		ChromeDriver driver  = new ChromeDriver();
		assertNotNull(driver,"driver contains null");
		Reporter.log("driver contains data",true);
	}


}
