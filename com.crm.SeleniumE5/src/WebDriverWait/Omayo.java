package WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import UtilityClass.BaseClass;

public class Omayo extends BaseClass {
	
	public static void main(String[] args) throws Exception {
		
		preCondition("chrome", "https://omayo.blogspot.com/");
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		
		Actions act= new Actions(driver);
		
		act.scrollToElement(driver.findElement(By.id("delayedText"))).perform();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("delayedText")));
		String text= driver.findElement(By.id("delayedText")).getText();
		System.out.println(text);
		
		driver.navigate().refresh();
		
		try {
			act.scrollToElement(driver.findElement(By.id("timerButton"))).perform();
		
			wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
			driver.findElement(By.id("timerButton")).click();
			Alert alt= driver.switchTo().alert();
			alt.accept();
			System.out.println("PopUp is handled");
		}
		catch(Exception e) {
			postCondition2();
			throw new Exception("Unable to handle popup");
		}
		driver.quit();
	}
		
	

}
