package PopUp.AlertPopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import UtilityClass.BaseClass;

// In simple alert pop up we click the ok button in the pop up window
public class SimpleAlertPopUp extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		preCondition("chrome","https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//clicking the search button without entering any input then the alert window will pop up
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert(); // switch the controller to the alert
		alt.accept();// click on ok
		
		Thread.sleep(2000);
		postCondition2();
		
	}

}
