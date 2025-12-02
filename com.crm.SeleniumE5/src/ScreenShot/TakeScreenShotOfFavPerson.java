package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import UtilityClass.BaseClass;

public class TakeScreenShotOfFavPerson extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		
		String name = "ThalapathyProfile";
		LocalDateTime date = LocalDateTime.now();
		String time = date.toString().replace(":","-");
		String fileName = name+time;
		System.out.println("File Name : "+fileName);
		
		preCondition("chrome", "https://www.instagram.com/actorvijay/?hl=en");
		
		WebElement tProfile = driver.findElement(By.xpath("//img[@alt=\"actorvijay's profile picture\"]"));
		File from = tProfile.getScreenshotAs(OutputType.FILE);
		File to = new File("D:\\Selenium\\SeleniumScreenShot\\"+fileName+".png");
		FileHandler.copy(from, to);
		
		postCondition2();
		
	}

}
