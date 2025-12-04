package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;


import UtilityClass.BaseClass;

public class AbhiBusCalenderPopUp extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		preCondition("chrome", "https://www.abhibus.com/");
		Robot bot = new Robot();
		
		driver.findElement(By.xpath("//div[@id='search-from']/div/div/div/div/div[2]/input")).sendKeys("pune");
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='search-to']/div/div/div/div/div[2]/input")).sendKeys("Hyderabad");
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//h3[text()='Departure']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("search-button")).click();
		bot.keyRelease(KeyEvent.VK_ENTER);
		
		postCondition2();
	
	}

}
