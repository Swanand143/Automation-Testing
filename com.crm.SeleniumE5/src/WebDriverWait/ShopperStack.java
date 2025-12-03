package WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import UtilityClass.BaseClass;

public class ShopperStack extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		preCondition("chrome", "https://shoppersstack.com/");
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
		
		driver.findElement(By.id("loginBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Create Account']")));
		
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://shoppersstack.com/");
		
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		
		postCondition2();

		
	}

}
