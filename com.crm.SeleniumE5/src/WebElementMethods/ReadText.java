package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadText {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		WebElement cart = driver.findElement(By.className("cart-label"));
		System.out.println(cart.getText());
		System.out.println("--------------------");
		
		String books = driver.findElement(By.linkText("Books")).getText();
		System.out.println(books);
		System.out.println("--------------------");
		
//		String poll = driver.findElement(By.linkText("Community poll")).getText();
//		System.out.println(poll);
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
