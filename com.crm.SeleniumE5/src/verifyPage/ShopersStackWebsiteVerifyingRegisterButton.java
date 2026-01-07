package verifyPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ShopersStackWebsiteVerifyingRegisterButton {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://shoppersstack.com/");
		Thread.sleep(10000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("Register"));
		
		if (ele.isEnabled()) {
			driver.quit();
			throw new Exception("Button is Enabled!");
		}
		else {
			System.out.println("Button is Disabled!");
		}
		
//		if (ele.getAttribute("disabled").equals("true")) {
//			System.out.println("True");
//		}
		
		Thread.sleep(2000);
		driver.quit();
	}
}
