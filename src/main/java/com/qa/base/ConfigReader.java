package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private static String browserType = null;
	static Properties prop;

	public static void setBrowserType(String browser) {
		browserType = browser;
	}

	public static String getBrowserType() throws Throwable {
		if (browserType != null)
			return browserType;
		else
			throw new RuntimeException("browser not specified in the testng.xml");
	}
	
	public void loadProperties() throws Exception {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Config.properties");
			prop.load(ip);
			String value = prop.get("url").toString();
			if(value.isEmpty()) {
				throw new Exception("value not specified for key: url");
			}
	}
	
	public static String getPropertyvalue(String key) throws IOException {
		prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Config.properties");
		prop.load(ip);
		String value = prop.get(key).toString();
		return value;
	}
}
