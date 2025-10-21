package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsOnDWS {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
        Thread.sleep(2000);
   	
        WebElement singleSelect = driver.findElement(By.id("products-orderby"));
		
		Select sel = new Select(singleSelect);
		List<WebElement> sort = sel.getOptions();
		
		int i = 0;
		for (WebElement web : sort) {
			singleSelect = driver.findElement(By.id("products-orderby"));
			sel = new Select(singleSelect);
			sel.selectByIndex(i++);
			Thread.sleep(1000);
		}
		
		// 2nd way
//		int size = sel.getOptions().size();
//		for (int i = 0; i < size; i++) {
//			singleSelect = driver.findElement(By.id("products-orderby"));
//			sel = new Select(singleSelect);
//			sel.selectByIndex(i);
//			Thread.sleep(1000);
//		}
//		
        Thread.sleep(2000);
		driver.quit();		
	}
}
