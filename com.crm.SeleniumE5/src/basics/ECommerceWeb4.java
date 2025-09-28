package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ECommerceWeb4 {
	
	public static void main(String[] args) {
		
		WebDriver web = new FirefoxDriver();
		web.manage().window().maximize();
		web.get("https://www.alibaba.com/");
		web.quit();
		
	}

}
