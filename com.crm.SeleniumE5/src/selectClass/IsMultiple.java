package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Chrome/demo.html");
		Thread.sleep(2000);
		
		WebElement singleSelect = driver.findElement(By.id("standard_cars"));
		
		Select sel = new Select(singleSelect);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		
		//Verification
		if (sel.isMultiple()) {
			System.out.println("It is a Muliple Select DropDown Menu");
		}
		else {
			System.out.println("It is a Single Select Dropdown Menu");
			System.out.println("Deselect can't be Performed");
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
