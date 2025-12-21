package AssertionsMethods;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftRealTime {
	
	public static WebDriver driver = null;
	public static String browser ="chrome";
	
	@Test
	public void main() {
		
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		else {
			driver = new ChromeDriver();
		}
		
		assertNotNull(driver,"driver is null");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("admin01@gamil.com");
		driver.findElement(By.id("Password")).sendKeys("admin");
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals("https://demowebshop.tricentis.com/", driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.findElement(By.className("ico-cart")).click();
		List<WebElement> product = driver.findElements(By.xpath("//a[text()='3rd Album']"));
		assertTrue(0<product.size(),"product is not added and Testcase Fail");
		Reporter.log("product is added and TestCase Pass",true);
		driver.quit();
		soft.assertAll();
		
	}
}
