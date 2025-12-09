package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFile {
	
	public static String path = ".\\src\\test\\resources\\configureFile.properties";
	
	public static String propertiesFile(String key) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
		
	}
}
