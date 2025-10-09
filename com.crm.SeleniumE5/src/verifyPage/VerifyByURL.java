package verifyPage;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByURL {
	
	public static void main(String[] args) {
		
		String expected_url = "https://demowebshop.tricentis.com/";
		
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demowebshop.tricentis.com/");
	    
	    String actual_url = driver.getCurrentUrl();
	    System.out.println("Current URL : "+actual_url);
	    
	    if (expected_url.equals(actual_url)) {
			System.out.println("I am in my targeted page");
			System.out.println("Ready to do action");
		}else {
			System.out.println("I am not in my targeted page");
			System.out.println("I am finding defect");
		}
	    
	    driver.quit();	
	}

}
