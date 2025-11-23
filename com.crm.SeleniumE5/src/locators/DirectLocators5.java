package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators5 {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	    driver.findElement(By.linkText("Create new account")).click();
	    Thread.sleep(500);
	    driver.findElement(By.name("firstname")).sendKeys("Swanand");
	    Thread.sleep(500);
	    driver.findElement(By.name("lastname")).sendKeys("Gholap");
	    Thread.sleep(500);
	    driver.findElement(By.name("birthday_day")).sendKeys("12");
	    Thread.sleep(500);
	    driver.findElement(By.name("birthday_month")).sendKeys("Aug");
	    Thread.sleep(500);
	    driver.findElement(By.name("birthday_year")).sendKeys("2003");
	    Thread.sleep(3000);
	    driver.quit();
	}

}
