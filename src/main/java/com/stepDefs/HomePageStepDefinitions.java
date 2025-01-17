package com.stepDefs;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.qa.base.DriverFactory;
import com.qa.pages.HomePage;

import io.cucumber.java.en.And;

public class HomePageStepDefinitions {

	HomePage homePage = new HomePage();
	
	@And("User verify tricentics logo is displayed and enabled")
	public void verifyLogo() {
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.tricentics_Logo).isDisplayed(), " Element "+homePage.tricentics_Logo+" is not displayed on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.tricentics_Logo).isEnabled(), " Element "+homePage.tricentics_Logo+" is not enabled");
	}
	@And("User verify tricentics title is displayed and enabled")
	public void verifyTitle() {
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.tricentics_Title).isDisplayed(), " Element "+homePage.tricentics_Title+" is not displayed on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.tricentics_Title).isEnabled(), " Element "+homePage.tricentics_Title+" is not enabled");
	}
	@And("User verify tricentics description is displayed and enabled")
	public void verifyDescription() {
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.tricentics_Title_Description).isDisplayed(), " Element "+homePage.tricentics_Title_Description+" is not displayed on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.tricentics_Title_Description).isEnabled(), " Element "+homePage.tricentics_Title_Description+" is not enabled");
	}
	@And("User verify search support input box is displayed and enabled")
	public void verifySearchBox() {
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.search_support_IPBox).isDisplayed(), " Element "+homePage.search_support_IPBox+" is not displayed on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.search_support_IPBox).isEnabled(), " Element "+homePage.search_support_IPBox+" is not enabled");
	}
	@And("User verify support button is displayed and enabled")
	public void verifySupportButton() {
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.visit_support_Button).isDisplayed(), " Element "+homePage.visit_support_Button+" is not displayed on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.visit_support_Button).isEnabled(), " Element "+homePage.visit_support_Button+" is not enabled");
	}
	@And("User verify Automobile link is displayed and enabled")
	public void verifyAutomobileLink() {
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.autoMobile_link).isDisplayed(), " Element "+homePage.autoMobile_link+" is not displayed on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.autoMobile_link).isEnabled(), " Element "+homePage.autoMobile_link+" is not enabled");
	}
	@And("User verify Truck link is displayed and enabled")
	public void verifyTruckLink() {
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.truck_link).isDisplayed(), " Element "+homePage.truck_link+" is not displayed on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.truck_link).isEnabled(), " Element "+homePage.truck_link+" is not enabled");
	}
	@And("User verify Motor cycle link is displayed and enabled")
	public void verifyMotorCycleLink() {
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.motorCycle_link).isDisplayed(), " Element "+homePage.motorCycle_link+" is not displayed on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.motorCycle_link).isEnabled(), " Element "+homePage.motorCycle_link+" is not enabled");
	}
	@And("User verify Camper link is displayed and enabled")
	public void verifyCamperLink() {
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.camper_link).isDisplayed(), " Element "+homePage.camper_link+" is not displayed on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.camper_link).isEnabled(), " Element "+homePage.camper_link+" is not enabled");
	}
	@And("User verify the slidders displayed on page")
	public void verifySlider() throws InterruptedException {
		//check if 4 slider are found on page
		List<WebElement> findSlideElements = DriverFactory.getInstance().getDriver().findElements(homePage.allSlides);
		Assert.assertTrue(findSlideElements.size()==4, "Number of slide on page is not 4");
		List<String> imagesString = Arrays.asList("images/slider_car.png","images/slider_truck.png","images/slider_bike.png","images/slider_camper.jpg");
		//wait for active slide
		WebDriverWait wait = new WebDriverWait(DriverFactory.getInstance().getDriver(), Duration.ofSeconds(20));
		WebElement activeSlideImage = wait.until(ExpectedConditions.presenceOfElementLocated(homePage.activeSlide));
		//iterate through all slide and compare with previous slide image text
		String prevSlideImage= "";
		for(int i=0;i<findSlideElements.size();i++) {
			String bg_img_attribute = activeSlideImage.getAttribute("data-bg-image");
			assertTrue(imagesString.contains(bg_img_attribute), "image displayed not valid");
			assertTrue(prevSlideImage!=bg_img_attribute, "slider image not changed");
			prevSlideImage = bg_img_attribute;
			//validate card displayed on top of slider image
//			if (bg_img_attribute.equals("images/slider_car.png")) {
//				assertTrue(DriverFactory.getInstance().getDriver().findElement(sliderCardHeader).getText().trim().equalsIgnoreCase("Automobile Insurance"), "Header text mismatch");
//			}else if(bg_img_attribute.equals("images/slider_truck.png")) {
//				assertTrue(DriverFactory.getInstance().getDriver().findElement(sliderCardHeader).getText().trim().equalsIgnoreCase("Truck Insurance"), "Card header text is not matching");
//			}else if(bg_img_attribute.equals("images/slider_bike.png")) {
//				assertTrue(DriverFactory.getInstance().getDriver().findElement(sliderCardHeader).getText().trim().equalsIgnoreCase("Motorcycle Insurance"), "Card header text is not matching");
//			}else if(bg_img_attribute.equals("images/slider_camper.jpg")) {
//				assertTrue(DriverFactory.getInstance().getDriver().findElement(sliderCardHeader).getText().trim().equalsIgnoreCase("Camper Insurance"), "Card header text is not matching");
//			}
//			assertTrue(DriverFactory.getInstance().getDriver().findElement(sliderCardDescription).isDisplayed(), "Card description not displayed");
//			assertTrue(DriverFactory.getInstance().getDriver().findElement(getQuoteCardButton).isDisplayed(), "Card Button  not displayed");
			//
			Thread.sleep(5000);
		}
	}
	@And("User verify welcome container is displayed")
	public void verifyWelcomeContainer() {
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.welcom_container).isDisplayed(), "welcome container is not displayed on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.welcom_container_header).isDisplayed(), " Element "+homePage.welcom_container_header+" is not displayed on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.welcom_container_header_desc).isDisplayed(), " Element "+homePage.welcom_container_header_desc+" is not displayed on the page");
	}
	@And("User verify features are displayed below welcome container")
	public void verifyWelcomeContainerFeatures() {
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.feature1_img).isDisplayed(), " Element "+homePage.feature1_img+" is not displayed on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.feature1_title).isDisplayed(), " Element "+homePage.feature1_title+" is not displayed on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.feature1_desc).isDisplayed(), " Element "+homePage.feature1_desc+" is not displayed on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.feature2_img).isDisplayed(), " Element "+homePage.feature2_img+" is not displayed on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.feature2_title).isDisplayed(), " Element "+homePage.feature2_title+" is not displayed on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.feature2_desc).isDisplayed(), " Element "+homePage.feature2_desc+" is not displayed on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.feature3_img).isDisplayed(), " Element "+homePage.feature3_img+" is not displayed on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.feature3_title).isDisplayed(), " Element "+homePage.feature3_title+" is not displayed on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.feature3_desc).isDisplayed(), " Element "+homePage.feature3_desc+" is not displayed on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.feature4_img).isDisplayed(), " Element "+homePage.feature4_img+" is not displayed on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.feature4_title).isDisplayed(), " Element "+homePage.feature4_title+" is not displayed on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.feature4_desc).isDisplayed(), " Element "+homePage.feature4_desc+" is not displayed on the page");
	}
	@And("User verify welcome footer text is displayed")
	public void verifyFooterText() {
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.welcome_block_footer_text).isDisplayed(), " Element "+homePage.welcome_block_footer_text+" is not displayed on the page");
	}
	@And("User verify read more link is displayed and enabled")
	public void verifyReadMoreLink() {
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.read_more_link).isDisplayed(), " Element "+homePage.read_more_link+" is not displayed on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.read_more_link).isEnabled(), " Element "+homePage.read_more_link+" is not enabled on the page");
	}
	@And("User verify insurance block header is displayed")
	public void verifyInsuranceBlock() throws InterruptedException {
		WebElement element = DriverFactory.getInstance().getDriver().findElement(homePage.insurance_block_header);
		((JavascriptExecutor) DriverFactory.getInstance().getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.insurance_block_subtitle).isDisplayed(), " Element "+homePage.insurance_block_subtitle+" is not displayed on the page");
	}
	@And("User verify automobile image is displayed")
	public void verifyAutomobileImage() throws InterruptedException {
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.insurance_block_automobile_link).isEnabled(), " Element "+homePage.insurance_block_automobile_link+" is not enabled");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.insurance_block_automobile).isDisplayed(), " Element "+homePage.insurance_block_automobile+" is not displayed on the page");
	}
	@And("User verify camper image is displayed")
	public void verifyCamperImage() throws InterruptedException {
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.insurance_block_camper_link).isEnabled(), " Element "+homePage.insurance_block_camper_link+" is not enabled");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.insurance_block_camper).isDisplayed(), " Element "+homePage.insurance_block_camper+" is not displayed on the page");
	}
	@And("User verify truck image is displayed")
	public void verifyTruckImage() throws InterruptedException {
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.insurance_block_truck_link).isEnabled(), " Element "+homePage.insurance_block_truck_link+" is not enabled");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.insurance_block_truck).isDisplayed(), " Element "+homePage.insurance_block_truck+" is not displayed on the page");
	}
	@And("User verify motorcycle image is displayed")
	public void verifyMotorCycleImage() throws InterruptedException {
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.insurance_block_motorcycle_link).isEnabled(), " Element "+homePage.insurance_block_motorcycle_link+" is not enabled");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.insurance_block_motorcycle).isDisplayed(), " Element "+homePage.insurance_block_motorcycle+" is not displayed on the page");	
	}
	@And("User scroll to footer section")
	public void scrollToFooter() throws InterruptedException {
		WebElement element = DriverFactory.getInstance().getDriver().findElement(homePage.about_link);
		((JavascriptExecutor) DriverFactory.getInstance().getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);	
	}
	@And("User verify links in the footer section")
	public void verifyFooterLink() throws InterruptedException {
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.about_link).isEnabled(), " Element "+homePage.about_link+" is not enabled on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.products_link).isEnabled(), " Element "+homePage.products_link+" is not enabled on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.events_link).isEnabled(), " Element "+homePage.events_link+" is not enabled on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.resources_link).isEnabled(), " Element "+homePage.resources_link+" is not enabled on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.services_link).isEnabled(), " Element "+homePage.services_link+" is not enabled on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.facebook_link).isEnabled(), " Element "+homePage.facebook_link+" is not enabled on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.twitter_link).isEnabled(), " Element "+homePage.twitter_link+" is not enabled on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.google_link).isEnabled(), " Element "+homePage.google_link+" is not enabled on the page");
		Assert.assertTrue(DriverFactory.getInstance().getDriver().findElement(homePage.copyright_text).isDisplayed(), " Element "+homePage.copyright_text+" is not enabled on the page");
	}
	
	
	
	
	
	
}
