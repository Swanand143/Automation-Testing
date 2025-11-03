package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoAppsQSPDragAndDrop {
    
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/");
        Thread.sleep(2000);
        
        Actions act = new Actions(driver);
        
        // click on UI Testing Concept
        WebElement ui = driver.findElement(By.xpath("(//div[contains(@title,'Learn More')])[1]"));
        act.click(ui).perform();
        Thread.sleep(2000);
        
        // click on Mouse Actions
        WebElement mouseActions = driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
        act.click(mouseActions).perform();
        Thread.sleep(2000);
        
        // click on Drag & Drop
        WebElement dragAnddrop = driver.findElement(By.xpath("//section[text()='Drag & Drop']"));
        act.click(dragAnddrop).perform();
        Thread.sleep(2000);
        
        // click on Drag Position
        WebElement dragPosition = driver.findElement(By.xpath("//a[text()='Drag Position']"));
        act.click(dragPosition).perform();
        Thread.sleep(3000);
        
        // Drag Mobile Charger & Mobile Cover
        WebElement mobileCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
        WebElement mobileCover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
        WebElement mobileDrop = driver.findElement(By.xpath("(//div[contains(@class,'drop-column')])[1]"));
        
        act.dragAndDrop(mobileCharger, mobileDrop).perform();
        Thread.sleep(2000);
        act.dragAndDrop(mobileCover, mobileDrop).perform();
        Thread.sleep(2000);
        
        // Drag Laptop Charger & Laptop Cover
        WebElement laptopCharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
        WebElement laptopCover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
        WebElement laptopDrop = driver.findElement(By.xpath("(//div[contains(@class,'drop-column')])[2]"));
        
        act.dragAndDrop(laptopCharger, laptopDrop).perform();
        Thread.sleep(2000);
        act.dragAndDrop(laptopCover, laptopDrop).perform();
        Thread.sleep(2000);
        
        driver.quit();
    }
}
