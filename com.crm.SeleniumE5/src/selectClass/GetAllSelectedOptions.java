package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///G:/QSpiders/Automation%20Testing/com.crm.SeleniumE5/src/basics/Day14/demo.html");
		WebElement multiSelDropdown = driver.findElement(By.id("multiple_cars"));
		
		Select sel = new Select(multiSelDropdown);
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		sel.deselectByIndex(2);
		sel.selectByIndex(3);
		
		List<WebElement> allSelectedOpt = sel.getAllSelectedOptions();
		
		for (WebElement webElement : allSelectedOpt) {
			System.out.println(webElement.getText());
		}
		
		driver.quit();
	}

}
