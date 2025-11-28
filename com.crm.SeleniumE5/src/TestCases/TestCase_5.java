package TestCases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class TestCase_5 extends BaseClass{

	public static void main(String[] args) throws Exception {

		String actual_url = "https://demowebshop.tricentis.com/";

		//open,maximize,enter
		preCondition("Chrome", "https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		//verify url
        if(!driver.getCurrentUrl().equals(actual_url)) {
			postCondition2();
			throw new Exception("Wrong Page");
		}

		System.out.println("Test Case Passed You are in the right website");

		//login
		login();
		Thread.sleep(2000);

		Actions act = new Actions(driver);

		//scroll down
		act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(1500);

		// click all social links except rss
		for (int i = 1; i <= 5; i++) {

			WebElement link = driver.findElement(By.xpath("(//div[@class='column follow-us']//a)[" + i + "]"));
			String href = link.getAttribute("href");

			if(href.contains("rss"))
				continue;

			link.click();
			Thread.sleep(1500);

			ArrayList<String> handles = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(handles.get(0));
			Thread.sleep(800);
		}

		// switch to twitter tab
		Set<String> allHandles = driver.getWindowHandles();

		for (String handle : allHandles) {

			driver.switchTo().window(handle);
			Thread.sleep(800);

			if(driver.getCurrentUrl().contains("x.com") || driver.getCurrentUrl().contains("twitter.com")) {

				Thread.sleep(3000);

				// click create account
				driver.findElement(By.xpath("//span[text()='Create account']")).click();
				Thread.sleep(2000);

				// enter Name
				WebElement nameBox = driver.findElement(
						By.xpath("//span[text()='Name']/ancestor::label/following::div[@role='textbox'][1]"));
				act.click(nameBox).sendKeys("Swanand").perform();
				Thread.sleep(1000);

				// enter Email
				WebElement emailBox = driver.findElement(
						By.xpath("//span[text()='Email']/ancestor::label/following::div[@role='textbox'][1]"));
				act.click(emailBox).sendKeys("swanandgholap@gmail.com").perform();
				Thread.sleep(1000);

				// DOB fields — Twitter auto opens dropdown; we skip or choose default
				System.out.println("Data Entered Successfully in Twitter!");

				break;
			}
		}

		// logout from dws
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(1000);

		logout();
		Thread.sleep(1000);

		postCondition2();
		System.out.println("TestCase-5 Completed Successfully");
	}
}
