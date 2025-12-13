package DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoColumns {

    @Test(dataProvider = "dwsLogin")
    public void main(String email, String pass) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Correct OrangeHRM locators
        driver.findElement(By.name("username")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(pass);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        driver.quit();
    }

    @DataProvider(name = "dwsLogin")
    public Object[][] dwsLogin() throws EncryptedDocumentException, IOException {

        FileInputStream fls = new FileInputStream(".\\src\\test\\resources\\DataProvider.xlsx");
        Workbook wb = WorkbookFactory.create(fls);
        Sheet sh = wb.getSheet("TwoColumns");
  
        int rows = sh.getPhysicalNumberOfRows();
        int cols = sh.getRow(0).getPhysicalNumberOfCells();

        Object[][] data = new Object[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = sh.getRow(i).getCell(j).toString();
            }
        }

        return data;
    }
}

