package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ECommerceWeb5 {
	
	public static void main(String[] args) {
		
		WebDriver web = new ChromeDriver();
		web.manage().window().maximize();
		web.get("https://www.myntra.com/");
		web.close();
		
	}

}
