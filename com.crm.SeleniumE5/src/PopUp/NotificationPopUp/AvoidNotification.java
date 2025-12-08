package PopUp.NotificationPopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import UtilityClass.BaseClass;

// avoid the notification pop up using Chrome options
public class AvoidNotification  {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		
		//avoid notification
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
