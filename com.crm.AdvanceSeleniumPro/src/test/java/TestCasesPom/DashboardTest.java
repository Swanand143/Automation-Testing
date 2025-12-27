package TestCasesPom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.Login;
import com.crm.pom.Dashboard;

public class DashboardTest {

    // TC_11_DASHBOARD - Verify Dashboard title after login
	
    @Test
    public void TC_11_DASHBOARD() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login login = new Login(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        Dashboard dash = new Dashboard(driver);
        System.out.println(dash.getDashboardTitle());

        Thread.sleep(1500);
        driver.quit();
    }

    // TC_12_DASHBOARD - Verify Admin menu navigation
    
    @Test
    public void TC_12_DASHBOARD() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login login = new Login(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        Dashboard dash = new Dashboard(driver);
        dash.clickAdmin();

        Thread.sleep(1500);
        driver.quit();
    }

    // TC_13_DASHBOARD - Verify PIM menu navigation
    
    @Test
    public void TC_13_DASHBOARD() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login login = new Login(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        Dashboard dash = new Dashboard(driver);
        dash.clickPIM();

        Thread.sleep(1500);
        driver.quit();
    }

    // TC_14_DASHBOARD - Verify Leave menu navigation
    
    @Test
    public void TC_14_DASHBOARD() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login login = new Login(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        Dashboard dash = new Dashboard(driver);
        dash.clickLeave();

        Thread.sleep(1500);
        driver.quit();
    }

    // TC_15_DASHBOARD - Verify MyInfo menu navigation
    
    @Test
    public void TC_15_DASHBOARD() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login login = new Login(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        Dashboard dash = new Dashboard(driver);
        dash.clickMyInfo();

        Thread.sleep(1500);
        driver.quit();
    }

    // TC_16_DASHBOARD - Verify Recruitment menu navigation
    
    @Test
    public void TC_16_DASHBOARD() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login login = new Login(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        Dashboard dash = new Dashboard(driver);
        dash.clickRecruitment();

        Thread.sleep(1500);
        driver.quit();
    }

    // TC_17_DASHBOARD - Verify URL after clicking Admin
    
    @Test
    public void TC_17_DASHBOARD() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login login = new Login(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        Dashboard dash = new Dashboard(driver);
        dash.clickAdmin();
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(1500);
        driver.quit();
    }

    // TC_18_DASHBOARD - Verify Dashboard title is displayed
    
    @Test
    public void TC_18_DASHBOARD() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login login = new Login(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        Dashboard dash = new Dashboard(driver);
        boolean visible = dash.getDashboardTitle().equals("Dashboard");
        System.out.println("Dashboard Visible: " + visible);

        Thread.sleep(1500);
        driver.quit();
    }

    // TC_19_DASHBOARD - Verify all main menus exist

    @Test
    public void TC_19_DASHBOARD() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login login = new Login(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        Dashboard dash = new Dashboard(driver);

        boolean adminExists = driver.findElement(By.xpath("//span[text()='Admin']")).isDisplayed();
        boolean pimExists = driver.findElement(By.xpath("//span[text()='PIM']")).isDisplayed();
        boolean leaveExists = driver.findElement(By.xpath("//span[text()='Leave']")).isDisplayed();
        boolean myInfoExists = driver.findElement(By.xpath("//span[text()='My Info']")).isDisplayed();

        System.out.println("Admin Menu Visible: " + adminExists);
        System.out.println("PIM Menu Visible: " + pimExists);
        System.out.println("Leave Menu Visible: " + leaveExists);
        System.out.println("MyInfo Menu Visible: " + myInfoExists);

        Thread.sleep(1500);
        driver.quit();
    }

    // TC_20_DASHBOARD - Verify user stays on Dashboard after refresh
    
    @Test
    public void TC_20_DASHBOARD() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login login = new Login(driver);
        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        driver.navigate().refresh();

        Dashboard dash = new Dashboard(driver);
        System.out.println("After refresh: " + dash.getDashboardTitle());

        Thread.sleep(1500);
        driver.quit();
    }
}
