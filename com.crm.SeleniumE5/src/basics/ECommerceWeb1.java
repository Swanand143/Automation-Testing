package basics;

import org.openqa.selenium.edge.EdgeDriver;

public class ECommerceWeb1 {
	
	public static void main(String[] args) {
		
		EdgeDriver edge = new EdgeDriver();
		edge.manage().window().maximize();
		edge.get("https://www.amazon.in/");
		edge.quit();
		
	}

}
