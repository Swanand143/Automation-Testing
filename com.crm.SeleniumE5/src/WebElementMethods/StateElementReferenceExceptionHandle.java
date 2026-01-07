package webElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StateElementReferenceExceptionHandle {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
		//for handling StateElementReferenceException
		
		for (int i = 0; i < links.size(); i++) {
			links.get(i).click();
			links = driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
			Thread.sleep(2000);
		}
		
		Thread.sleep(2000);
		driver.quit();
	}

}
