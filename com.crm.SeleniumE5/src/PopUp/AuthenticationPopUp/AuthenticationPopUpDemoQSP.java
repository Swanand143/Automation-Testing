package PopUp.AuthenticationPopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import UtilityClass.BaseClass;

public class AuthenticationPopUpDemoQSP extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		preCondition("chrome","https://demoapps.qspiders.com/");
		Thread.sleep(1000);
        Robot bot= new Robot();
		
		driver.findElement(By.xpath("//section[@id='optionsBody']/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Authentication']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='AuthLink']")).click();
	
		Thread.sleep(2000);
		
		bot.keyPress(KeyEvent.VK_A);
		Thread.sleep(500);
		bot.keyPress(KeyEvent.VK_D);
		Thread.sleep(500);
		bot.keyPress(KeyEvent.VK_M);
		Thread.sleep(500);
		bot.keyPress(KeyEvent.VK_I);
		Thread.sleep(500);
		bot.keyPress(KeyEvent.VK_N);
		
		Thread.sleep(3000);
		bot.keyPress(KeyEvent.VK_TAB);
		bot.keyPress(KeyEvent.VK_A);
		bot.keyPress(KeyEvent.VK_D);
		bot.keyPress(KeyEvent.VK_M);
		bot.keyPress(KeyEvent.VK_I);
		bot.keyPress(KeyEvent.VK_N);
		
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_ENTER);
		
		bot.keyRelease(KeyEvent.VK_TAB);
		bot.keyRelease(KeyEvent.VK_A);
		bot.keyRelease(KeyEvent.VK_D);
		bot.keyRelease(KeyEvent.VK_M);
		bot.keyRelease(KeyEvent.VK_I);
		bot.keyRelease(KeyEvent.VK_N);
		bot.keyRelease(KeyEvent.VK_TAB);
		bot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);

		postCondition2();
		
	}

}
