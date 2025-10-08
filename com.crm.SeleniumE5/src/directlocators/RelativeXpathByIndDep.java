package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathByIndDep {
	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../../div[3]/div/span")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.quit();
	}

}
