package ExtentReportsScripts;


import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Sample {
	
	@Test
	public void login() {
		
		//Step-1 : Create Object Of ExtentSparkReporter
		ExtentSparkReporter spark = new ExtentSparkReporter(".\\src\\test\\resources\\Reports\\sample.html");
		
		//Step-2 : Configure ExtentSparkReporter
		spark.config().setDocumentTitle("OrangeHRM");
		spark.config().setReportName("Swanand");
		spark.config().setTheme(Theme.DARK);
		
		//Step-3 : Create Object For ExtentReports
		ExtentReports report = new ExtentReports();
		
		//Step-4 : Set System Configuration For Extent Report
		report.setSystemInfo("System Brand", "Asus");
		report.setSystemInfo("OS", "Windows-11");
		report.setSystemInfo("Browser", "Chrome-143.0.7499.41");
		
		//Step-5 : Attach ExtentSparkReporter To The ExtentReports
		report.attachReporter(spark);
		
		//Step-6 : Create TestCase Name And Attach The Details
		ExtentTest test = report.createTest("login");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement username = driver.findElement(By.name("username"));
		assertTrue(username.isEnabled());
		test.log(Status.INFO, "Username textfield is enabled");
		driver.quit();
		
		//Step-7 : Push All The Details To The Report
		report.flush();
		
	}

}
