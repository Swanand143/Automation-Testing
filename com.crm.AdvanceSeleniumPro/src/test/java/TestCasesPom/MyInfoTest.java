package TestCasesPom;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.Login;
import com.crm.pom.MyInfoPage;

public class MyInfoTest {

    // TC_41_MYINFO - Verify My Info page opens
	
    @Test
    public void TC_41_MYINFO() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com");

        Login login = new Login(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        MyInfoPage info = new MyInfoPage(driver);
        info.openMyInfo();

        System.out.println(info.getPersonalDetailsTitle());

        Thread.sleep(1500);
        driver.quit();
    }

    // TC_42_MYINFO - Edit First Name
    
    @Test
    public void TC_42_MYINFO() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com");

        Login login = new Login(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        MyInfoPage info = new MyInfoPage(driver);
        info.openMyInfo();

        info.enterFirstName("Rohit");
        info.clickSave();

        Thread.sleep(1500);
        driver.quit();
    }

    // TC_43_MYINFO - Edit Last Name
    
    @Test
    public void TC_43_MYINFO() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com");

        Login login = new Login(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        MyInfoPage info = new MyInfoPage(driver);
        info.openMyInfo();

        info.enterLastName("Kumar");
        info.clickSave();

        Thread.sleep(1500);
        driver.quit();
    }

    // TC_44_MYINFO - Verify Contact Details tab opens
    
    @Test
    public void TC_44_MYINFO() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com");

        Login login = new Login(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        MyInfoPage info = new MyInfoPage(driver);
        info.openMyInfo();
        info.clickContactDetails();

        Thread.sleep(1500);
        driver.quit();
    }

    // TC_45_MYINFO - Verify Emergency Contacts tab opens
    
    @Test
    public void TC_45_MYINFO() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com");

        Login login = new Login(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        MyInfoPage info = new MyInfoPage(driver);
        info.openMyInfo();
        info.clickEmergencyContacts();

        Thread.sleep(1500);
        driver.quit();
    }

    // TC_46_MYINFO - Verify Dependents tab opens
    
    @Test
    public void TC_46_MYINFO() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com");

        Login login = new Login(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        MyInfoPage info = new MyInfoPage(driver);
        info.openMyInfo();
        info.clickDependents();

        Thread.sleep(1500);
        driver.quit();
    }

    // TC_47_MYINFO - Edit middle name
    
    @Test
    public void TC_47_MYINFO() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com");

        Login login = new Login(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        MyInfoPage info = new MyInfoPage(driver);
        info.openMyInfo();

        info.enterMiddleName("P");
        info.clickSave();

        Thread.sleep(1500);
        driver.quit();
    }

    // TC_48_MYINFO - Verify title is Personal Details
    
    @Test
    public void TC_48_MYINFO() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com");

        Login login = new Login(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        MyInfoPage info = new MyInfoPage(driver);
        info.openMyInfo();

        System.out.println("Page Title: " + info.getPersonalDetailsTitle());

        Thread.sleep(1500);
        driver.quit();
    }

    // TC_49_MYINFO - Verify fields accept input
    
    @Test
    public void TC_49_MYINFO() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com");

        Login login = new Login(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        MyInfoPage info = new MyInfoPage(driver);
        info.openMyInfo();

        info.enterFirstName("Arjun");

        Thread.sleep(1500);
        driver.quit();
    }


    // TC_50_MYINFO - Refresh page remains on My Info
    
    @Test
    public void TC_50_MYINFO() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com");

        Login login = new Login(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        MyInfoPage info = new MyInfoPage(driver);
        info.openMyInfo();

        driver.navigate().refresh();

        System.out.println(info.getPersonalDetailsTitle());

        Thread.sleep(1500);
        driver.quit();
    }
}
