package DDT;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import com.crm.FileUtility.ReadFile;

public class ReadFromPropertiesFile {
	
	public static WebDriver driver = null;
	
	@Test
	public void main() throws IOException {
	
		String browser = ReadFile.propertiesFile("browser");
		String url = ReadFile.propertiesFile("url");
		String username = ReadFile.propertiesFile("username");
		String password = ReadFile.propertiesFile("password");
		
		System.out.println("Browser : "+browser);
		System.out.println("Url : "+url);
		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
		
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		}
		else if (browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		else {
			driver = new ChromeDriver();
		}
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		
		WebElement usernameTextField = driver.findElement(By.name("username"));
		usernameTextField.sendKeys(username);
		WebElement passwordTextField = driver.findElement(By.name("password"));
		passwordTextField.sendKeys(password);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		//driver.quit();
		
	}

}
