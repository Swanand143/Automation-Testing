package verifyPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebElementIsSelected {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement excellent = driver.findElement(By.id("pollanswers-1"));
		excellent.click();
		
		if (!excellent.isSelected()) {
			System.out.println("Excellent button is Selected and Testcase is Pass");
		}
		else {
			driver.close();
			throw new Exception("Excellent button is not Selected and Testcase is Pass");
		}
		
		driver.close();
		
	}

}
