package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathByGroupIndex {
	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name=\"pollanswers-1\"])[4]")).click();
//		driver.findElement(By.xpath("(//input[@name='pollanswers-1'])[4]")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
