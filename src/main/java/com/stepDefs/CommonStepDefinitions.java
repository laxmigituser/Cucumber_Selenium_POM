package com.stepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.qa.base.BrowserFactory;
import com.qa.base.DriverFactory;

import com.qa.pages.EnterVehicleDataPage;
import com.qa.pages.HomePage;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class CommonStepDefinitions{

	BrowserFactory browserFact = new BrowserFactory();
	EnterVehicleDataPage enterVehicleDataPage = new EnterVehicleDataPage();
	
	
	
	@Given("User navigates-to {string} page")
	public void navigate(String url) throws InterruptedException {
		//create browser instance
				WebDriver driverInstance = browserFact.createBrowserInstance("chrome");
				//setting it to thread local for threadsafe
				DriverFactory.getInstance().setDriver(driverInstance);
				//accessing thread safe browser
				WebDriver driver = DriverFactory.getInstance().getDriver();
				
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
				driver.get(url);
		Thread.sleep(6000);
	}
	
	@And("User verify page title is {string}")
	public void verifyPageTitle(String expectedTitle) {
		String actualTitle = DriverFactory.getInstance().getDriver().getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Expected "+expectedTitle+" but found "+actualTitle);
	}
	
	@And("User verify breadcrumb text is {string}")
	public void verifyBreadCrumbText(String expectedText) {
		String actualText = DriverFactory.getInstance().getDriver().findElement(enterVehicleDataPage.breadCrumb).getText();
		Assert.assertEquals(actualText, expectedText, "Expected "+expectedText+" but found "+actualText);
	}
	
	
	
}
