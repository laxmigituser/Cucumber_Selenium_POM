package com.stepDefs;

import org.testng.Assert;

import com.qa.base.DriverFactory;
import com.qa.pages.EnterVehicleDataPage;
import com.qa.pages.HomePage;

import io.cucumber.java.en.And;

public class EnterVehicleDataPageStepDefs {

	HomePage homePage = new HomePage();
	EnterVehicleDataPage enterVehicleDataPage = new EnterVehicleDataPage();
	
	//navigations using links
	
	@And("User click on automobile link")
	public void clickAutomobileLink() {
		homePage.clickAutoMobileLink();
	}
	@And("User click on truck link")
	public void clickTruckLink() {
		homePage.clickTruckLink();
	}
	@And("User click on motorcycle link")
	public void clickMotorcycleLink() {
		homePage.clickMotorCycleLink();
	}
	@And("User click on camper link")
	public void clickOnCamperLink() {
		homePage.clickCamperLink();
	}
	
	// tab validation scripts
	
	@And("User verify Enter vehicle data tab is displayed on page")
	public void verifyDataTab() {
		boolean isDisplayed = DriverFactory.getInstance().getDriver().findElement(enterVehicleDataPage.enterVehicleData_tab).isDisplayed();
		Assert.assertTrue(isDisplayed, "Element "+enterVehicleDataPage.enterVehicleData_tab+" is not displayed on page ");
	}
	@And("User verify Enter vehicle data tab count is {string}")
	public void verifyDataTabCount(String expectedCount) {
		String actualCount = DriverFactory.getInstance().getDriver().findElement(enterVehicleDataPage.enterVehicleData_tab_count).getText();
		Assert.assertEquals(actualCount, expectedCount, "Expected count is "+expectedCount+" but found "+actualCount);
	}
	@And("User verify Enter insurant data tab is displayed on page")
	public void verifyInsurantDataTab() {
		boolean isDisplayed = DriverFactory.getInstance().getDriver().findElement(enterVehicleDataPage.enterInsurantData_tab).isDisplayed();
		Assert.assertTrue(isDisplayed, "Element "+enterVehicleDataPage.enterInsurantData_tab+" is not displayed on page ");
	}
	@And("User verify Enter insurant data tab count is {string}")
	public void verifyInsurantDataTabCount(String expectedCount) {
		String actualCount = DriverFactory.getInstance().getDriver().findElement(enterVehicleDataPage.enterInsurantData_tab_count).getText();
		Assert.assertEquals(actualCount, expectedCount, "Expected count is "+expectedCount+" but found "+actualCount);
	}
	@And("User verify Enter product data tab is displayed on page")
	public void verifyProductDataTab() {
		boolean isDisplayed = DriverFactory.getInstance().getDriver().findElement(enterVehicleDataPage.enterProductData_tab).isDisplayed();
		Assert.assertTrue(isDisplayed, "Element "+enterVehicleDataPage.enterProductData_tab+" is not displayed on page ");
	}
	@And("User verify Enter product data tab count is {string}")
	public void verifyProductDataTabCount(String expectedCount) {
		String actualCount = DriverFactory.getInstance().getDriver().findElement(enterVehicleDataPage.enterProductData_tab_count).getText();
		Assert.assertEquals(actualCount, expectedCount, "Expected count is "+expectedCount+" but found "+actualCount);
	}
	@And("User verify select price option tab is displayed on page")
	public void verifySelectPriceOptionTab() {
		boolean isDisplayed = DriverFactory.getInstance().getDriver().findElement(enterVehicleDataPage.enterProductData_tab).isDisplayed();
		Assert.assertTrue(isDisplayed, "Element "+enterVehicleDataPage.enterVehicleData_tab+" is not displayed on page ");
	}
	@And("User verify send quote tab is displayed on page")
	public void verifySendQuoteTab() {
		boolean isDisplayed = DriverFactory.getInstance().getDriver().findElement(enterVehicleDataPage.sendQuote_tab).isDisplayed();
		Assert.assertTrue(isDisplayed, "Element "+enterVehicleDataPage.sendQuote_tab+" is not displayed on page ");
	}
	
	// field validations on page
	
	@And("User verify make dropdown is displayed on page")
	public void verifyMakeDropDisplayed() {
		boolean isDisplayed = DriverFactory.getInstance().getDriver().findElement(enterVehicleDataPage.make_dropdown).isDisplayed();
		Assert.assertTrue(isDisplayed, "Element "+enterVehicleDataPage.make_dropdown+" is not displayed on page ");
	}
	@And("User verify engine performance input box is displayed on page")
	public void verifyEnginePerformanceDisplayed() {
		boolean isDisplayed = DriverFactory.getInstance().getDriver().findElement(enterVehicleDataPage.enginePerformanceIPBox).isDisplayed();
		Assert.assertTrue(isDisplayed, "Element "+enterVehicleDataPage.enginePerformanceIPBox+" is not displayed on page ");
	}
	@And("User verify date of manufacture is displayed on page")
	public void verifyManufactureDateDisplayed() {
		boolean isDisplayed = DriverFactory.getInstance().getDriver().findElement(enterVehicleDataPage.dateOfManufactureIPBox).isDisplayed();
		Assert.assertTrue(isDisplayed, "Element "+enterVehicleDataPage.dateOfManufactureIPBox+" is not displayed on page ");
	}
	@And("User verify seat number dropdown is displayed on page")
	public void verifySeatNoDropDisplayed() {
		boolean isDisplayed = DriverFactory.getInstance().getDriver().findElement(enterVehicleDataPage.numberOfSeatsDropDown).isDisplayed();
		Assert.assertTrue(isDisplayed, "Element "+enterVehicleDataPage.numberOfSeatsDropDown+" is not displayed on page ");
	}
	@And("User verify fuel type dropdown is displayed on page")
	public void verifyFuelTypeDropDisplayed() {
		boolean isDisplayed = DriverFactory.getInstance().getDriver().findElement(enterVehicleDataPage.fuelTypeDropDown).isDisplayed();
		Assert.assertTrue(isDisplayed, "Element "+enterVehicleDataPage.fuelTypeDropDown+" is not displayed on page ");
	}
	@And("User verify list price dropdown is displayed on page")
	public void verifyListPriceDisplayed() {
		boolean isDisplayed = DriverFactory.getInstance().getDriver().findElement(enterVehicleDataPage.listPrice).isDisplayed();
		Assert.assertTrue(isDisplayed, "Element "+enterVehicleDataPage.listPrice+" is not displayed on page ");
	}
	@And("User verify license plate input box is displayed on page")
	public void verifyLicensePlateDisplayed() {
		boolean isDisplayed = DriverFactory.getInstance().getDriver().findElement(enterVehicleDataPage.licensePlateNoIPBox).isDisplayed();
		Assert.assertTrue(isDisplayed, "Element "+enterVehicleDataPage.licensePlateNoIPBox+" is not displayed on page ");
	}
	@And("User verify annual mileage is displayed on page")
	public void verifyAnnualMileageDisplayed() {
		boolean isDisplayed = DriverFactory.getInstance().getDriver().findElement(enterVehicleDataPage.annualmileageIPBox).isDisplayed();
		Assert.assertTrue(isDisplayed, "Element "+enterVehicleDataPage.annualmileageIPBox+" is not displayed on page ");
	}
	@And("User verify payload input box is displayed on page")
	public void verifyPayloadBoxDisplayed() {
		boolean isDisplayed = DriverFactory.getInstance().getDriver().findElement(enterVehicleDataPage.payload).isDisplayed();
		Assert.assertTrue(isDisplayed, "Element "+enterVehicleDataPage.payload+" is not displayed on page ");
	}
	@And("User verify total weight input box is displayed on page")
	public void verifyTotalWeightDisplayed() {
		boolean isDisplayed = DriverFactory.getInstance().getDriver().findElement(enterVehicleDataPage.totalWeight).isDisplayed();
		Assert.assertTrue(isDisplayed, "Element "+enterVehicleDataPage.totalWeight+" is not displayed on page ");
	}
	@And("User verify model dropdown is displayed on page")
	public void verifyModelDropdownDisplayed() {
		boolean isDisplayed = DriverFactory.getInstance().getDriver().findElement(enterVehicleDataPage.model_dropdown).isDisplayed();
		Assert.assertTrue(isDisplayed, "Element "+enterVehicleDataPage.model_dropdown+" is not displayed on page ");
	}
	@And("User verify cylinder capacity input box is displayed on page")
	public void verifyCylinderCapacityDisplayed() {
		boolean isDisplayed = DriverFactory.getInstance().getDriver().findElement(enterVehicleDataPage.cylinder_capacity).isDisplayed();
		Assert.assertTrue(isDisplayed, "Element "+enterVehicleDataPage.cylinder_capacity+" is not displayed on page ");
	}
	@And("User verify total no of seats dropdown is displayed on page")
	public void verifyTotalNoOfSeatsDisplayed() {
		boolean isDisplayed = DriverFactory.getInstance().getDriver().findElement(enterVehicleDataPage.numberOfSeatsDropDown_motorcycle).isDisplayed();
		Assert.assertTrue(isDisplayed, "Element "+enterVehicleDataPage.numberOfSeatsDropDown_motorcycle+" is not displayed on page ");
	}
}
