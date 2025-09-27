package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartUpScript {
	
	public static void main(String[] args) {
		
		//open the browser (2 wayes)
		// 1st way
		//ChromeDriver driver = new ChromeDriver();
		//2nd way
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter into demo web shop website(2 wayes)
		//1st way
		driver.get("https://demowebshop.tricentis.com/");
		//2nd way
		//driver.navigate().to("https://demowebshop.tricentis.com/");
		
		//close the browser(2 wayes)
		//1st way
		//driver.close();
		//2nd way
		driver.quit();
		
		
	}

}
