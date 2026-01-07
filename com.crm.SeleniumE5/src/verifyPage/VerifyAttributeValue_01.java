package verifyPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyAttributeValue_01 {
	public static void main(String[] args) throws InterruptedException {
		
		String data = "Manish Sir";
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement searchField = driver.findElement(By.id("small-searchterms"));
		searchField.sendKeys(data);
		Thread.sleep(2000);
		
		String currentData = searchField.getAttribute("value"); // this method gives any attribute present value here we fetch the value attribute value
		
		if (data.equals(currentData)) {
			System.out.println("Data Matched Successfully!");
		}
		else {
			System.out.println("Data not matched!");
		}
		
		Thread.sleep(2000);
		driver.quit();
	}
}
