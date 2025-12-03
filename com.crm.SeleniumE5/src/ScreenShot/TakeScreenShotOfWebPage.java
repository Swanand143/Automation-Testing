package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import UtilityClass.BaseClass;

public class TakeScreenShotOfWebPage extends BaseClass{
	
	public static void main(String[] args) throws IOException {
		
		preCondition("chrome", "https://demowebshop.tricentis.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;//downcasting
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("D:\\Selenium\\SeleniumScreenShot\\dwsHomePage.png");
		FileHandler.copy(from, to);
		
		postCondition2();
		
		
	}

}
