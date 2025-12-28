package TestCasesPom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.Login;
import com.crm.pom.Dashboard;
import com.crm.pom.PIMPage;

public class PIMTest {

    // TC_31_PIM - Verify PIM page loads successfully
	
    @Test
    public void TC_31_PIM() throws Exception {

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

        PIMPage pim = new PIMPage(driver);
        System.out.println(pim.getTitle());

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_32_PIM - Verify Add Employee button is clickable
    
    @Test
    public void TC_32_PIM() throws Exception {

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

        PIMPage pim = new PIMPage(driver);
        pim.clickAddEmployee();

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_33_PIM - Search employee by name
    
    @Test
    public void TC_33_PIM() throws Exception {

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

        PIMPage pim = new PIMPage(driver);
        pim.enterEmployeeName("Peter");
        pim.clickSearch();

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_34_PIM - Search employee by ID
    
    @Test
    public void TC_34_PIM() throws Exception {

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

        PIMPage pim = new PIMPage(driver);
        pim.enterEmployeeID("0012");
        pim.clickSearch();

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_35_PIM - Reset filters
    
    @Test
    public void TC_35_PIM() throws Exception {

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

        PIMPage pim = new PIMPage(driver);
        pim.enterEmployeeName("TestUser");
        pim.clickReset();

        Thread.sleep(1500);
        driver.quit();
    }



 // TC_36_PIM - Verify employee table is displayed

    @Test
    public void TC_36_PIM() throws Exception {

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

        boolean tableVisible = driver.findElement(
            By.xpath("//div[contains(@class,'oxd-table-card')]")
        ).isDisplayed();

        System.out.println("Employee Table Visible: " + tableVisible);

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_37_PIM - Verify PIM page title is displayed
    
    @Test
    public void TC_37_PIM() throws Exception {

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

        PIMPage pim = new PIMPage(driver);
        System.out.println("Title: " + pim.getTitle());

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_38_PIM - Verify search without entering anything
    
    @Test
    public void TC_38_PIM() throws Exception {

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

        PIMPage pim = new PIMPage(driver);
        pim.clickSearch();

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_39_PIM - Verify Add Employee form opens
    
    @Test
    public void TC_39_PIM() throws Exception {

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

        PIMPage pim = new PIMPage(driver);
        pim.clickAddEmployee();

        boolean formVisible = driver.findElement(By.xpath("//h6[text()='Add Employee']")).isDisplayed();
        System.out.println("Add Employee Form Visible: " + formVisible);

        Thread.sleep(1500);
        driver.quit();
    }



    // TC_40_PIM - Verify refresh keeps user on PIM page
    
    @Test
    public void TC_40_PIM() throws Exception {

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

        driver.navigate().refresh();

        boolean titleVisible = driver.findElement(By.xpath("//h5[text()='Employee Information']")).isDisplayed();
        System.out.println("After Refresh: " + titleVisible);

        Thread.sleep(1500);
        driver.quit();
    }
}
