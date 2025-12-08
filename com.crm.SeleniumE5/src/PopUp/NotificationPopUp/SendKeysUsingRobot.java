package PopUp.NotificationPopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import UtilityClass.BaseClass;

public class SendKeysUsingRobot extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		preCondition("chrome", "https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).click();
		
		Robot bot= new Robot();
		bot.keyPress(KeyEvent.VK_P);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_E);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_N);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_D);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_R);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_I);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_E);
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
