	package PopUp.FileUploadPopUp;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	
	import UtilityClass.BaseClass;
	
	public class FileUploadPopUp extends BaseClass {
		
		public static void main(String[] args) throws InterruptedException {
			
			preCondition("chrome", "https://www.ilovepdf.com/pdf_to_word");
			Thread.sleep(2000);
			WebElement selectWordFile = driver.findElement(By.xpath("//input[@type='file']"));
			selectWordFile.sendKeys("D:\\Selenium\\NewOneResume.pdf");
			Thread.sleep(2000);
			postCondition2();
			
		}
	
	}
