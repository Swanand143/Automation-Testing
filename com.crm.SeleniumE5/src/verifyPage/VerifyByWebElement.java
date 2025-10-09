package verifyPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByWebElement {
	
	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demowebshop.tricentis.com/");
	    
	    try {
	    	WebElement poll = driver.findElement(By.xpath("//strong[text() = 'Communitpy poll']"));
	    	System.out.println("Pass");
		} catch (Exception e) {
			driver.close();
			throw new Exception("Fail");
		}
	    
	    Thread.sleep(1000);
	    driver.close();
		
	}
}
