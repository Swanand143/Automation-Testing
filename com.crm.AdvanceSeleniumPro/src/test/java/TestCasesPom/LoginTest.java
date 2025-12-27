package TestCasesPom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.Login;

public class LoginTest {

    // TC_01_LOGIN - Valid Login
    
    @Test
    public void TC_01_LOGIN() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login log = new Login(driver);
        log.enterUsername("Admin");
        log.enterPassword("admin123");
        log.clickLogin();

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_02_LOGIN - Invalid Username
  
    @Test
    public void TC_02_LOGIN() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login log = new Login(driver);
        log.enterUsername("WrongUser");
        log.enterPassword("admin123");
        log.clickLogin();

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_03_LOGIN - Invalid Password
   
    @Test
    public void TC_03_LOGIN() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login log = new Login(driver);
        log.enterUsername("Admin");
        log.enterPassword("WrongPass");
        log.clickLogin();

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_04_LOGIN - Empty Username
   
    @Test
    public void TC_04_LOGIN() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login log = new Login(driver);
        log.enterUsername("");
        log.enterPassword("admin123");
        log.clickLogin();

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_05_LOGIN - Forgot Password Link
 
    @Test
    public void TC_05_LOGIN() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login log = new Login(driver);
        log.clickForgotPassword();

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_06_LOGIN - Login with leading/trailing spaces
   
    @Test
    public void TC_06_LOGIN() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login log = new Login(driver);
        log.enterUsername("   Admin   ");
        log.enterPassword("admin123");
        log.clickLogin();

        Thread.sleep(1500);
        driver.quit();
    }


    // TC_07_LOGIN - Case-sensitive username check
    
    @Test
    public void TC_07_LOGIN() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login log = new Login(driver);
        log.enterUsername("admin");
        log.enterPassword("admin123");
        log.clickLogin();

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_08_LOGIN - Login without password
  
    @Test
    public void TC_08_LOGIN() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login log = new Login(driver);
        log.enterUsername("Admin");
        log.enterPassword("");
        log.clickLogin();

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_09_LOGIN - Login without username
    
    @Test
    public void TC_09_LOGIN() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login log = new Login(driver);
        log.enterUsername("");
        log.enterPassword("admin123");
        log.clickLogin();

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_10_LOGIN - Login with special characters
    
    @Test
    public void TC_10_LOGIN() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login log = new Login(driver);
        log.enterUsername("@@@###$$$");
        log.enterPassword("admin123");
        log.clickLogin();

        Thread.sleep(1500);
        driver.quit();
    }
}
