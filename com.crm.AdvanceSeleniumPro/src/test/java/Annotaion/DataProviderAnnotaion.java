package Annotaion;

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

public class DataProviderAnnotaion {

	@DataProvider(name = "user")
	public Object[][] sender() throws EncryptedDocumentException, IOException{
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\DataProvider.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Username");
		int row = sh.getPhysicalNumberOfRows();
		int col = sh.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] obj = new Object[row][col];
		
		for (int i = 0, j =0 ; i < row; i++) {
			
			obj[i][j] = sh.getRow(i).getCell(j).toString();
			
		}
		
		
		//hardCoding
//		Object[][] obj = new Object[5][1];
//		
//		obj[0][0] = "Admin";
//		obj[1][0] = "Mani";
//		obj[2][0] = "Priya";
//		obj[3][0] = "Chaitanya";
//		obj[4][0] = "Vaishnavi";
		
		return obj;
	}
	
	@Test(dataProvider = "user")
	public void reciver(String username) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(3000);
		driver.quit();
		Thread.sleep(2000);
		
	}
}
