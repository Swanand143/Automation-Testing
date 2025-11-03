package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FillFBSignUpUsingSelectClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		d1.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		Thread.sleep(2000);
		
		d1.findElement(By.xpath("//input[contains(@id,'u_0_8_')]")).sendKeys("Swanand");
		Thread.sleep(1000);
		
		d1.findElement(By.xpath("//input[contains(@id,'u_0_a_')]")).sendKeys("Gholap");
		Thread.sleep(1000);
		
		WebElement day = d1.findElement(By.id("day"));
		Select sel1 = new Select(day);
		sel1.selectByIndex(11);
		Thread.sleep(1000);
		
		WebElement month = d1.findElement(By.id("month"));
		Select sel2 = new Select(month);
		sel2.selectByVisibleText("Nov");
		Thread.sleep(1000);
		
		WebElement year = d1.findElement(By.id("year"));
		Select sel3 = new Select(year);
		sel3.selectByValue("2003");
		Thread.sleep(1000);
		
		d1.findElement(By.xpath("//span[contains(@class,'_5k_3')]/span[2]/label/input")).click();
		Thread.sleep(1000);
		
		d1.findElement(By.xpath("//input[contains(@id,'u_0_h_')]")).sendKeys("8390176037");
		Thread.sleep(1000);
		
		d1.findElement(By.xpath("//input[contains(@name,'reg_passwd__')]")).sendKeys("kvcckwn");
		
		Thread.sleep(3000);
		d1.quit();	
	}

}
