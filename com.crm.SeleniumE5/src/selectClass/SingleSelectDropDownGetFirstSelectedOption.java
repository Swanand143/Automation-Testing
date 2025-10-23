package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDownGetFirstSelectedOption {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Chrome/demo.html");
		Thread.sleep(2000);
		
		WebElement singleSelect = driver.findElement(By.id("standard_cars"));
		Select sel = new Select(singleSelect);
		List<WebElement> cars = sel.getOptions();
		
		sel.selectByValue("aud");
		Thread.sleep(2000);
		
		sel.selectByVisibleText("BMW");
		Thread.sleep(2000);
		
		sel.selectByIndex(3);
		Thread.sleep(2000);
		
		//Here this getFirstSelectedOption() will not follow order or index, which will we select last in the script those data is selected
		WebElement first = sel.getFirstSelectedOption();
		System.out.println("First data : "+first.getText());
		
		driver.quit();
		
	}
}
