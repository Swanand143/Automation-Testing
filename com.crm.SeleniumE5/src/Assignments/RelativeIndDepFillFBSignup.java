package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeIndDepFillFBSignup {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d1= new ChromeDriver();
		d1.manage().window().maximize();
		Thread.sleep(2000);
		d1.get("https://www.facebook.com/");
		d1.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		Thread.sleep(2000);
//		d1.findElement(By.xpath("//form[contains(@class,'_9vtf')]/div[5]/a")).click();
		d1.findElement(By.xpath("//input[contains(@id,'u_0_8_')]")).click();
		Thread.sleep(1000);
		d1.findElement(By.xpath("//input[contains(@id,'u_0_8_')]")).sendKeys("Swanand");
		Thread.sleep(1000);
		d1.findElement(By.xpath("//input[contains(@id,'u_0_a_')]")).click();
		Thread.sleep(1000);
		d1.findElement(By.xpath("//input[contains(@id,'u_0_a_')]")).sendKeys("Gholap");
		Thread.sleep(1000);
		d1.findElement(By.xpath("//div[contains(@class,'_58mq _5dbb')]/div[2]/span/span/select/option[4]")).click();
		Thread.sleep(1000);
		d1.findElement(By.xpath("//div[contains(@class,'_58mq _5dbb')]/div/span/span/select[2]/option[7]")).click();
		Thread.sleep(1000);
		d1.findElement(By.xpath("//div[contains(@class,'_58mq _5dbb')]/div/span/span/select[3]/option[23]")).click();
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
