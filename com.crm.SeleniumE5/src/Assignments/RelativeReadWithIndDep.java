package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeReadWithIndDep {
	
	public static void main(String[] args) throws InterruptedException {
		
		   ChromeDriver dir = new ChromeDriver();
		   
		   dir.manage().window().maximize();
		   
		   dir.get("https://demowebshop.tricentis.com/");
		   
		   dir.findElement(By.xpath("//div[contains(@class,'header-menu')]/ul/li[5]/a")).click();
		   
		   String price =  dir.findElement(By.xpath("(//div[contains(@class,'product-item')])[1]/div[2]/div[3]/div/span")).getText();
//		   String price =  dir.findElement(By.xpath("//h2/following-sibling::div[3]/div/span")).getText();
		   
		   String price1 =  dir.findElement(By.xpath("(//div[contains(@class,'product-item')])[2]/div[2]/div[3]/div/span")).getText();
		 
		   String price2 =  dir.findElement(By.xpath("(//div[contains(@class,'product-item')])[3]/div[2]/div[3]/div/span")).getText();
		   
		    System.out.println(price);
		    System.out.println(price1);
		    System.out.println(price2);
		    
		    Thread.sleep(2000);
		    dir.quit();
		}


}
