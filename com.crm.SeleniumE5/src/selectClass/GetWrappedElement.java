package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElement {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///G:/QSpiders/Automation%20Testing/com.crm.SeleniumE5/src/basics/Day14/demo.html");
		WebElement multiSelDropdown = driver.findElement(By.id("multiple_cars"));
		
		Select sel = new Select(multiSelDropdown);
		
		WebElement wrappedEle = sel.getWrappedElement();
		
		System.out.println(multiSelDropdown.getTagName());
		System.out.println(multiSelDropdown.getText());
		multiSelDropdown.click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
