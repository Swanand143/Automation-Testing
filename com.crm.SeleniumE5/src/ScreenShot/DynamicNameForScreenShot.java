package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import UtilityClass.BaseClass;

public class DynamicNameForScreenShot extends BaseClass{
	
	public static void main(String[] args) throws IOException {
		
		//create the dynamic name
		String name = "dwsHomePage";
		LocalDateTime date = LocalDateTime.now();
		String time = date.toString().replace(":","-");
		String fileName = name+time;
		System.out.println("File Name : "+fileName);
		
		preCondition("chrome", "https://demowebshop.tricentis.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;//downcasting
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("D:\\Selenium\\SeleniumScreenShot\\"+fileName+".png");
		FileHandler.copy(from, to);
		
		postCondition2();
		
	}

}
