package AssertionsMethods;

import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

public class HardAssertNotEquals {
	
	@Test
	public void main() {
		
		String Expected_Data = "Swanand";
		String Actual_Data = "Swanand";
		
		assertNotEquals(Actual_Data, Expected_Data,"Testcase Failed data is matched");
		System.out.println("Testcase Passed");
		System.out.println("next steps");
		System.out.println("click");
		System.out.println("close");
	}
		
}
