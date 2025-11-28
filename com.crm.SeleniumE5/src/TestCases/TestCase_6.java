package TestCases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import UtilityClass.BaseClass;

public class TestCase_6 extends BaseClass{

    public static void main(String[] args) throws Exception {

        String actual_url = "https://demowebshop.tricentis.com/";

        //open,maximize,enter
        preCondition("Chrome", "https://demowebshop.tricentis.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //verification by url
        if (actual_url.equals(driver.getCurrentUrl())) {

            System.out.println("Test Case Passed You are in the right website");

            //login
            login();
            Thread.sleep(2000);

            Actions act = new Actions(driver);

            //scroll down
            act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).perform();
            Thread.sleep(1500);

            //click facebook,rss,youtube,google,twitter using findelements
            for (int i = 1; i <= 5; i++) {

                WebElement ele = driver.findElement(By.xpath("(//div[@class='column follow-us']//a)[" + i + "]"));
                String href = ele.getAttribute("href");

                //skip RSS
                if (href.contains("rss")) {
                    continue;
                }

                ele.click();
                Thread.sleep(1500);

                ArrayList<String> handles = new ArrayList<String>(driver.getWindowHandles());
                driver.switchTo().window(handles.get(0));
                Thread.sleep(1000);

                act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).perform();
                Thread.sleep(700);
            }

            //switch and handle facebook + twitter
            Set<String> all_handles = driver.getWindowHandles();

            for (String handle : all_handles) {
                driver.switchTo().window(handle);
                Thread.sleep(1000);

                String url = driver.getCurrentUrl();

                //facebook create new account
                if (url.contains("facebook")) {
                    Thread.sleep(3000);

                    driver.findElement(By.xpath("//span[text()='Create new account']")).click();
                    Thread.sleep(2000);

                }
                //twitter create account
                else if (url.contains("twitter") || url.contains("x.com")) {
                    Thread.sleep(3000);

                    driver.findElement(By.xpath("//span[contains(text(),'Create account')]")).click();
                    Thread.sleep(2000);
                }
            }

            //logout
            ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(0));
            Thread.sleep(1000);

            driver.findElement(By.xpath("//a[text()='Log out']")).click();
            Thread.sleep(1500);

            //close browser
            postCondition2();
            System.out.println();

        }
        else {
            postCondition2();
            throw new Exception("Test Case Failed You are in the wrong page");
        }
    }
}
