package UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;


public class CrossBrowserTesting {
	
	public static WebDriver driver = null;
	
	public static void differentEnvironment(){
		
		String browser = PreConditionCase.browser;
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver(); 
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();	
		}
		else if (browser.equalsIgnoreCase("safari")) {
			
			driver = new SafariDriver();	
		}
		else if(browser.equalsIgnoreCase("internetexplorer")) {
			
			driver = new InternetExplorerDriver();
			
		}
		else {
			
			driver = new ChromeDriver();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("1.Chrome");
//	System.out.println("2.Edge");
//	System.out.println("3.Firefox");
//	System.out.println("4.Internet Explorer");
//	System.out.println("5.Safari");
//	System.out.println();
//	System.out.print("Enter The Browser Number : ");
//	int opt = sc.nextInt();
//	
//	switch (opt) {
//	case 1: {
//		
//		driver = new ChromeDriver();
//		break;
//	}
//    case 2: {
//
//		driver = new EdgeDriver();
//		break;
//	}
//    case 3: {
//		
//		driver = new FirefoxDriver();
//		break;
//	}
//    case 4: {
//		
//		driver = new InternetExplorerDriver();
//		break;
//	}
//    case 5: {
//		
//		driver = new SafariDriver();
//		break;
//	}
//	default:
//		throw new IllegalArgumentException("Unexpected option : " + opt);
//	}

}
