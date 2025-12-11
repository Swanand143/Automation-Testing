package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class RegisterDemo {
	
	@Test
	public static void main() throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Register.html");
		
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Swanand");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Gholap");
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Nashik, Maharashtra");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test123@gmail.com");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9876543210");

        driver.findElement(By.xpath("//input[@value='Male']")).click();

        driver.findElement(By.id("checkbox1")).click(); 
        driver.findElement(By.id("checkbox2")).click();
        driver.findElement(By.id("checkbox3")).click(); 
     
        driver.findElement(By.id("msdd")).click();
        driver.findElement(By.xpath("//a[text()='Arabic']")).click();
        driver.findElement(By.id("msdd")).click();
        driver.findElement(By.xpath("//a[text()='English']")).click();

        Select skills = new Select(driver.findElement(By.id("Skills")));
        skills.selectByVisibleText("Java");

        driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();

        driver.findElement(By.xpath("//li[text()='India']")).click();

        Select year = new Select(driver.findElement(By.id("yearbox")));
        year.selectByVisibleText("2003");

        Select month = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
        month.selectByVisibleText("May");

        Select day = new Select(driver.findElement(By.id("daybox")));
        day.selectByVisibleText("12");
        
        driver.findElement(By.id("firstpassword")).sendKeys("Test@123");
        driver.findElement(By.id("secondpassword")).sendKeys("Test@123");
        
        WebElement upload = driver.findElement(By.id("imagesrc"));
        upload.sendKeys("D:\\Selenium\\NewOneResume.pdf");  
        
        driver.findElement(By.id("submitbtn")).click();

        Thread.sleep(8000);
        driver.quit();
		
	}

}
