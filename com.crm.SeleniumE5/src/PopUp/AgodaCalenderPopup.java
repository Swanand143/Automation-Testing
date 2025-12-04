package PopUp;

import org.openqa.selenium.By;

import UtilityClass.BaseClass;

public class AgodaCalenderPopup extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		preCondition("chrome", "https://www.agoda.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='IconBox__child'])[2]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[contains(@data-selenium-date,'2025-11-09')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[@class='IconBox__child'])[3]")).click();
		driver.findElement(By.xpath("(//div[@class='IconBox__child'])[3]")).click();
		
		

		for (;;) {
			
			try {
				driver.findElement(By.xpath("//span[contains(@data-selenium-date,'2025-03-09')]")).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("(//span[@class='a3315-inline-flex a3315-align-baseline'])[5]")).click();
			}
			Thread.sleep(1000);
		}

		
		Thread.sleep(1000);
		
		postCondition2();
		
	}

}
