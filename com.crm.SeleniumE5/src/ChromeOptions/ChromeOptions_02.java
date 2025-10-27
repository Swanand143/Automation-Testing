package ChromeOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_02 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless"); // all done in Background only
		
		ChromeDriver driver = new ChromeDriver(options);
		System.out.println("Open the Chrome Browser");
		driver.manage().window().maximize();
		System.out.println("Maximize it");
		Thread.sleep(1000);
		driver.get("https://yesmovies-to.to/");
		System.out.println("Enter into yes Movies");
		Thread.sleep(1000);
		String str = driver.findElement(By.xpath("//a[@rel='nofollow']")).getText();
		System.out.println("Find WebElement : " + str);
		driver.quit();
		System.out.println("Close the Browser");
	}
}
