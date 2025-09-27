package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ECommerceWeb2 {
	
	public static void main(String[] args) {
		
		FirefoxDriver fire = new FirefoxDriver();
		fire.manage().window().maximize();
		fire.get("https://www.flipkart.com/");
		fire.close();
		
	}

}
