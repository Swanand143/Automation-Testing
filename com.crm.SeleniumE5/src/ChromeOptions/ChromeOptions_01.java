package ChromeOptions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_01 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito"); // --incognito is a command to open webpage in incognito mode
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://yesmovies-to.to/");
		Thread.sleep(2000);
		driver.quit();
	}
}
