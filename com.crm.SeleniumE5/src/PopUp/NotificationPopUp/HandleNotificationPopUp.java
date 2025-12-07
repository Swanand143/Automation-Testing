package PopUp.NotificationPopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import UtilityClass.BaseClass;

public class HandleNotificationPopUp extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException,AWTException {
		
		preCondition("chrome", "https://www.easemytrip.com/");
		Thread.sleep(5000);
		
		Robot bot = new Robot();
		
		//here we pressing the TAB 3 Times
		bot.keyPress(KeyEvent.VK_TAB);//1
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_TAB);//2
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_TAB);//3
		Thread.sleep(1000);
		
		//pressing the ENTER 1 time
		bot.keyPress(KeyEvent.VK_ENTER);//1
		Thread.sleep(1000);
		
		//Release the TAB at least 1 time
		bot.keyRelease(KeyEvent.VK_TAB);
		
		//Release the ENTER at least 1 time
		bot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		driver.quit();	
		
	}

}
