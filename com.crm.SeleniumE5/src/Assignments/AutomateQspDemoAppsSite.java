package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateQspDemoAppsSite {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		
		//click on UI Testing Concept
		d1.findElement(By.xpath("(//div[contains(@title,'Learn More')])[1]")).click();
		Thread.sleep(2000);
		
		//Click on xpath
		d1.findElement(By.xpath("(//section[contains(@class,'poppins text-[15px]')])[2]")).click();
		Thread.sleep(2000);
		
		//click on Login 
		d1.findElement(By.xpath("(//section[contains(@class,'poppins text-[14px]')])[1]")).click();
		Thread.sleep(2000);

	    for (int i = 1; i <=3 ; ) {
	    	
	    	d1.findElement(By.xpath("//section[contains(text(),'Login "+i+".0')]")).click();
	    	Thread.sleep(1000);
	    	if (i==1) {
				d1.findElement(By.xpath("//input[contains(@class,'p-3 w-72 rounded border-none text-lg')][1]")).sendKeys("Swanand");
				d1.findElement(By.xpath("//input[contains(@class,'p-3 w-72 rounded border-none text-lg')][2]")).sendKeys("hhjc@123");
				Thread.sleep(2000);
				i++;
			}
	    	else if(i==2) {
	    		d1.findElement(By.xpath("//input[contains(@class,'p-3 w-72 rounded border-none text-lg')][1]")).sendKeys("Swanand");
				d1.findElement(By.xpath("(//input[contains(@class,'p-3 w-72 rounded border-none text-lg')])[2]")).sendKeys("cd@123");
				Thread.sleep(2000);
				i++;
	    	}
	    	else{
	    		d1.findElement(By.xpath("//input[contains(@class,'p-3 w-72 rounded border-none text-lg')][1]")).sendKeys("Swanand");
			    d1.findElement(By.xpath("(//input[contains(@class,'p-3 w-72 rounded border-none text-lg')])[2]")).sendKeys("abc@123");
				Thread.sleep(2000);
				i++;
	    	}
			
		}
			
		Thread.sleep(3000);
		d1.quit();
		
	}

}
