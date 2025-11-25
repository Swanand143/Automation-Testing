package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathByFollowingSibling {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		String text = driver.findElement(By.xpath("//h2/following-sibling::div[3]/div/span")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.quit();
		
	}

}
