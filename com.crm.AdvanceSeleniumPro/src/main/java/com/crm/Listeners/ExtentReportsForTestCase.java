package com.crm.Listeners;


import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.crm.BaseClass.LoginBase;

public class ExtentReportsForTestCase extends LoginBase implements ITestListener{
	
	public static ExtentSparkReporter spark = null;
	public static ExtentReports report = null;
	public static ExtentTest test = null;
	
	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		Reporter.log(name+" is onTestStart",true);
		
		//Step-6 : Create TestCase Name And Attach The Details
		test = report.createTest(name);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name = result.getMethod().getMethodName();
		
		test.log(Status.PASS,name+" is pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		String name = result.getMethod().getMethodName();
		String date = LocalDateTime.now().toString().replace(':', '-');
		String dynamicName = name+date;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log(name+" is onTestFailure",true);
		TakesScreenshot ts = (TakesScreenshot) driver;
		String from = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(from);
		test.log(Status.FAIL,name+" is fail");
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name = result.getMethod().getMethodName();
		
		test.log(Status.SKIP,name+" is skip");
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("onStart",true);
		
		//Step-1 : Create Object Of ExtentSparkReporter
		spark = new ExtentSparkReporter(".\\src\\test\\resources\\Reports\\OrangeHRM.html");
				
		//Step-2 : Configure ExtentSparkReporter
		spark.config().setDocumentTitle("OrangeHRM");
		spark.config().setReportName("Swanand");
		spark.config().setTheme(Theme.DARK);
				
		//Step-3 : Create Object For ExtentReports
	    report = new ExtentReports();
				
		//Step-4 : Set System Configuration For Extent Report
		report.setSystemInfo("System Brand", "Asus");
		report.setSystemInfo("OS", "Windows-11");
		report.setSystemInfo("Browser", "Chrome-143.0.7499.41");
				
		//Step-5 : Attach ExtentSparkReporter To The ExtentReports
		report.attachReporter(spark);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("onFinish",true);
		report.flush();
	}

}
