package TestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import UtilityClass.BaseClass;

public class TestCase_4 extends BaseClass {

	public static void main(String[] args) throws Exception {

		String expected_url = "https://demowebshop.tricentis.com/";

		// open, maximize, enter
		preCondition("Chrome", "https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// verify url
		if (expected_url.equals(driver.getCurrentUrl())) {

			System.out.println("Test Case Passed You are in the right website");

			// login
			login();
			Thread.sleep(2000);

			// click digital downloads
			driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
			Thread.sleep(2000);

			// -------------------------------
			// VIEW AS DROPDOWN — SAFE LOOP
			// -------------------------------
			WebElement viewAs = driver.findElement(By.id("products-viewmode"));
			Select viewSelect = new Select(viewAs);

			int viewCount = viewSelect.getOptions().size();

			for (int i = 0; i < viewCount; i++) {
				viewAs = driver.findElement(By.id("products-viewmode"));
				viewSelect = new Select(viewAs);
				viewSelect.selectByIndex(i);
				Thread.sleep(1500);
			}

			// -------------------------------
			// SORT BY DROPDOWN — SAFE LOOP
			// -------------------------------
			WebElement sortBy = driver.findElement(By.id("products-orderby"));
			Select sortSelect = new Select(sortBy);

			int sortCount = sortSelect.getOptions().size();

			for (int i = 0; i < sortCount; i++) {
				sortBy = driver.findElement(By.id("products-orderby"));
				sortSelect = new Select(sortBy);
				sortSelect.selectByIndex(i);
				Thread.sleep(1500);
			}

			// -------------------------------
			// DISPLAY DROPDOWN — SAFE LOOP
			// -------------------------------
			WebElement display = driver.findElement(By.id("products-pagesize"));
			Select displaySelect = new Select(display);

			int dispCount = displaySelect.getOptions().size();

			for (int i = 0; i < dispCount; i++) {
				display = driver.findElement(By.id("products-pagesize"));
				displaySelect = new Select(display);
				displaySelect.selectByIndex(i);
				Thread.sleep(1500);
			}

			// logout
			driver.findElement(By.xpath("//a[text()='Log out']")).click();
			Thread.sleep(1500);

			// close browser
			postCondition2();

		} else {
			postCondition2();
			throw new Exception("Test Case Failed You are in the wrong page");
		}
	}
}
