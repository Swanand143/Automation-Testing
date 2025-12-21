package AssertionsMethods;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEquals {

	@Test
	public void main() {
		
		String a = "Java";
		String b = "Lava";
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(a, b,"failure is happen due to comparison not same");
		Reporter.log("going to the next step",true);
		soft.assertAll();
		
	}
	
}
