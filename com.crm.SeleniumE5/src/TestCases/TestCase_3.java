package TestCases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class TestCase_3 extends BaseClass{

	public static void main(String[] args) throws Exception {

		String expected_url = "https://demowebshop.tricentis.com/";

		//open,maximize,enter
		preCondition("Chrome", "https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		//verify url
		if (expected_url.equals(driver.getCurrentUrl())) {

			System.out.println("Test Case Passed You are in the right website");

			//login
			login();
			Thread.sleep(2000);

			//open digital downloads page
			driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
			Thread.sleep(2000);

			//Add all products using findElements
			List<WebElement> addButtons = driver.findElements(By.xpath("//input[contains(@value,'Add to cart')]"));
			for (WebElement btn : addButtons) {
				btn.click();
				Thread.sleep(1500);
			}

			//open shopping cart
			driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
			Thread.sleep(2000);

			//store string prices from cart
			ArrayList<String> priceTextList = new ArrayList<String>();
			List<WebElement> priceElements = driver.findElements(By.xpath("//table[contains(@class,'cart')]//tbody/tr/td[4]/span[2]"));

			for (WebElement p : priceElements) {
				String txt = p.getText();     // e.g. "25.00"
				priceTextList.add(txt);
			}

			//convert all prices to double for max calculation
			ArrayList<Double> priceDoubleList = new ArrayList<Double>();
			for (String s : priceTextList) {
				priceDoubleList.add(Double.parseDouble(s));
			}

			//find max price
			double max = Collections.max(priceDoubleList);

			//convert back to original UI price format e.g. "25.00"
			String maxText = String.format("%.2f", max);

			//select checkbox for highest price
			driver.findElement(By.xpath("//span[text()='"+maxText+"']/../preceding-sibling::td/input")).click();
			Thread.sleep(1500);

			//update cart
			driver.findElement(By.name("updatecart")).click();
			Thread.sleep(2000);

			//verify removal
			try {
				driver.findElement(By.xpath("//span[text()='"+maxText+"']"));
				System.out.println("Product Not Removed");
			}
			catch (Exception e) {
				System.out.println("Highest Price Product Successfully Removed");
			}

			//logout
			logout();
			Thread.sleep(1500);

			//close browser
			postCondition2();

		}
		else {
			postCondition2();
			throw new Exception("Test Case Failed You are in the wrong page");
		}
	}
}
