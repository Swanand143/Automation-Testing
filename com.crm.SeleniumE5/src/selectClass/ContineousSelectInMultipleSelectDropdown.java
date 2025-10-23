package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContineousSelectInMultipleSelectDropdown {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Chrome/demo.html");
		Thread.sleep(2000);
		
		WebElement multipleSelect = driver.findElement(By.id("multiple_cars"));
		Select sel = new Select(multipleSelect);
		List<WebElement> cars = sel.getOptions();
		
		int i = 0;
		for (WebElement web : cars) {
			sel.selectByIndex(i++);
			Thread.sleep(1000);
		}
		
		if (sel.isMultiple()) {
			sel.deselectAll();
			System.out.println("Pass");
		}
		else {
			driver.quit();
			throw new Exception("Fail");
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
