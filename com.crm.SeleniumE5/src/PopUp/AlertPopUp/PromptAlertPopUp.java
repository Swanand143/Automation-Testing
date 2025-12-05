package PopUp.AlertPopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import UtilityClass.BaseClass;

public class PromptAlertPopUp extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		preCondition("chrome","https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
		Thread.sleep(1000);
		WebElement clk = driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]"));
		clk.click();
		Thread.sleep(500);
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(500);
		alt.sendKeys("Hi I Am Swanand");
		Thread.sleep(1000);
		alt.accept();
		Thread.sleep(1000);
		clk.click();
		Thread.sleep(500);
		alt.sendKeys("Hi I Am Swanand");
		Thread.sleep(1000);
		alt.dismiss();
		
		Thread.sleep(2000);
		postCondition2();
		
	}

}
