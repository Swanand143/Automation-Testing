package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathByTextFunction {
	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		// Xpath By Text Function
		String read = driver.findElement(By.xpath("//strong[text()='Community poll']")).getText();
		System.out.println(read);
		Thread.sleep(1000);
      
		//driver.findElement(By.xpath("//a[text()='Apparel & Shoes']")).click(); //This gives error bcz the text fn contains an extra space then go for contains function

		Thread.sleep(3000);
		driver.quit();
		
	}

}
