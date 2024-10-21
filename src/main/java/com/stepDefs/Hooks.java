package com.stepDefs;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

import com.qa.base.BrowserFactory;
import com.qa.base.ConfigReader;
import com.qa.base.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	ConfigReader reader = new ConfigReader();
	BrowserFactory browserFact=new BrowserFactory();
	@Before
	public void setUp() throws Throwable {
		reader.loadProperties();
		String browser = ConfigReader.getBrowserType();
		//DriverFactory.getInstance().getDriver()
		WebDriver driverInstance = browserFact.createBrowserInstance(browser);
		//setting it to thread local for threadsafe
		DriverFactory.getInstance().setDriver(driverInstance);
		//accessing thread safe browser
		WebDriver driver = DriverFactory.getInstance().getDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
		driver.get("https://sampleapp.tricentis.com/101/");
	}
	@After
	public void tearDown(Scenario scenario) {
		DriverFactory.getInstance().getDriver().close();
	}
	
	@AfterStep
	public void actionPostEachStep(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot ss= (TakesScreenshot)DriverFactory.getInstance().getDriver();
			byte[] screenshot = ss.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image.png", ss.toString());
		}
		
	}
	
}
