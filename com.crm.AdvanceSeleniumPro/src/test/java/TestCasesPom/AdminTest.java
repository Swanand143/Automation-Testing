package TestCasesPom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.Login;
import com.crm.pom.Dashboard;
import com.crm.pom.AdminPage;

public class AdminTest {

    // TC_21_ADMIN - Verify Admin page loads successfully
	
    @Test
    public void TC_21_ADMIN() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login log = new Login(driver);
        log.enterUsername("Admin");
        log.enterPassword("admin123");
        log.clickLogin();

        Dashboard dash = new Dashboard(driver);
        dash.clickAdmin();

        AdminPage admin = new AdminPage(driver);
        System.out.println(admin.getTitle());

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_22_ADMIN - Verify Add User button is clickable
    
    @Test
    public void TC_22_ADMIN() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login log = new Login(driver);
        log.enterUsername("Admin");
        log.enterPassword("admin123");
        log.clickLogin();

        Dashboard dash = new Dashboard(driver);
        dash.clickAdmin();

        AdminPage admin = new AdminPage(driver);
        admin.clickAdd();

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_23_ADMIN - Search valid username
    
    @Test
    public void TC_23_ADMIN() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login log = new Login(driver);
        log.enterUsername("Admin");
        log.enterPassword("admin123");
        log.clickLogin();

        Dashboard dash = new Dashboard(driver);
        dash.clickAdmin();

        AdminPage admin = new AdminPage(driver);
        admin.enterSearchUsername("Admin");
        admin.clickSearch();

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_24_ADMIN - Search invalid username
    
    @Test
    public void TC_24_ADMIN() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login log = new Login(driver);
        log.enterUsername("Admin");
        log.enterPassword("admin123");
        log.clickLogin();

        Dashboard dash = new Dashboard(driver);
        dash.clickAdmin();

        AdminPage admin = new AdminPage(driver);
        admin.enterSearchUsername("xyz123noUser");
        admin.clickSearch();

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_25_ADMIN - Reset search filters
    
    @Test
    public void TC_25_ADMIN() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login log = new Login(driver);
        log.enterUsername("Admin");
        log.enterPassword("admin123");
        log.clickLogin();

        Dashboard dash = new Dashboard(driver);
        dash.clickAdmin();

        AdminPage admin = new AdminPage(driver);
        admin.enterSearchUsername("Admin");
        admin.clickReset();

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_26_ADMIN - Verify System Users title is displayed
    
    @Test
    public void TC_26_ADMIN() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login log = new Login(driver);
        log.enterUsername("Admin");
        log.enterPassword("admin123");
        log.clickLogin();

        Dashboard dash = new Dashboard(driver);
        dash.clickAdmin();

        boolean titleVisible = driver.findElement(By.xpath("//h5[text()='System Users']")).isDisplayed();
        System.out.println("System Users Title Visible: " + titleVisible);

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_27_ADMIN - Verify Add User form opens
    
    @Test
    public void TC_27_ADMIN() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login log = new Login(driver);
        log.enterUsername("Admin");
        log.enterPassword("admin123");
        log.clickLogin();

        Dashboard dash = new Dashboard(driver);
        dash.clickAdmin();

        AdminPage admin = new AdminPage(driver);
        admin.clickAdd();

        boolean formVisible = driver.findElement(By.xpath("//h6[text()='Add User']")).isDisplayed();
        System.out.println("Add User Form Visible: " + formVisible);

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_28_ADMIN - Verify search works without entering anything
    
    @Test
    public void TC_28_ADMIN() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login log = new Login(driver);
        log.enterUsername("Admin");
        log.enterPassword("admin123");
        log.clickLogin();

        Dashboard dash = new Dashboard(driver);
        dash.clickAdmin();

        AdminPage admin = new AdminPage(driver);
        admin.clickSearch();

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_29_ADMIN - Verify user table appears
    
    @Test
    public void TC_29_ADMIN() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login log = new Login(driver);
        log.enterUsername("Admin");
        log.enterPassword("admin123");
        log.clickLogin();

        Dashboard dash = new Dashboard(driver);
        dash.clickAdmin();

        boolean tablePresent = driver.findElement(By.xpath("//div[@class='oxd-table']")).isDisplayed();
        System.out.println("User Table Visible: " + tablePresent);

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_30_ADMIN - Verify user can refresh Admin page
    
    @Test
    public void TC_30_ADMIN() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Login log = new Login(driver);
        log.enterUsername("Admin");
        log.enterPassword("admin123");
        log.clickLogin();

        Dashboard dash = new Dashboard(driver);
        dash.clickAdmin();

        driver.navigate().refresh();

        boolean titleVisible = driver.findElement(By.xpath("//h5[text()='System Users']")).isDisplayed();
        System.out.println("After Refresh: " + titleVisible);

        Thread.sleep(1500);
        driver.quit();
    }
}
