package TestRunner;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.qa.base.BrowserFactory;
import com.qa.base.ConfigReader;
import com.qa.base.DriverFactory;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
    
@CucumberOptions(tags = "", 
				features = {"src/test/resources/features/home_page.feature","src/test/resources/features/enter_vehicle_data_page.feature"}, 
				glue = {"com.stepDefs"},
                 plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
    
public class Runner extends AbstractTestNGCucumberTests {
    @DataProvider(parallel = true)//parallel = true
    @Override
    public Object[][] scenarios(){
    	return super.scenarios();
    }
    
    @BeforeTest
    @Parameters({ "browser" })
	public void defineBrowser(String browser) throws Throwable {
		ConfigReader.setBrowserType(browser);
	}
    
	

	
	
    
}
