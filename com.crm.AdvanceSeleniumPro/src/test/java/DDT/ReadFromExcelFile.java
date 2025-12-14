package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcelFile {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Login");
		System.out.println(sh);
		String data1 = sh.getRow(0).getCell(0).toString();
		String data2 = sh.getRow(1).getCell(0).toString();
		String data3 = sh.getRow(2).getCell(0).toString();
		String data4 = sh.getRow(3).getCell(0).toString();
		String data5 = sh.getRow(4).getCell(0).toString();
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
		System.out.println(data5);
	}

}
