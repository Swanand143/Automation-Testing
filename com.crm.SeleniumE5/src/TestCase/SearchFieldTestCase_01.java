package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class SearchFieldTestCase_01 extends BaseClass{
	
	public static void main(String[] args) throws Exception {
		
		String passedText = "Mobile";
		
		preCondition("chrome","https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		login();
		
		WebElement searchField = driver.findElement(By.id("small-searchterms"));
	    searchField.sendKeys(passedText);
	    String currentText = searchField.getAttribute("value");
	    
	    if (passedText.equals(currentText)) {
			System.out.println("Text Case Passed!");
		} else {
			postCondition1();
			throw new Exception("Data is not found and Test Case Failed !");
		}
	    
	    logout();
	    Thread.sleep(3000);
	    postCondition2();
		
		
		
		
	}

}
