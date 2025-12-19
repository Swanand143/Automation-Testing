package AssertionsMethods;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class HardAssertEquals {
	
	@Test
	public void main() {
		
		String Expected_Data = "Swanand";
		String Actual_Data = "Swanad";
		
		assertEquals(Actual_Data, Expected_Data,"Testcase Failed data is missmatched");
		System.out.println("Testcase Passed");
		System.out.println("next steps");
		System.out.println("click");
		System.out.println("close");
		
	}

}
