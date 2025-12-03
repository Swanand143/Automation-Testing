package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import UtilityClass.BaseClass;

public class TakeScreenShotOfWebElement extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		
		preCondition("chrome", "https://demowebshop.tricentis.com/");
		
		WebElement giftCard = driver.findElement(By.xpath("//img[@alt='Picture of $25 Virtual Gift Card']"));
		File from = giftCard.getScreenshotAs(OutputType.FILE);
		File to = new File("D:\\Selenium\\SeleniumScreenShot\\giftCard.jpg");
		FileHandler.copy(from, to);
		
		postCondition2();
		
	}

}
