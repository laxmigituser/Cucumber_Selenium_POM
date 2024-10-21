Feature: Home Page Test

Scenario: Header validation
 #Given User navigates-to "https://sampleapp.tricentis.com/101/" page 
And User verify page title is "Tricentis Vehicle Insurance"
And User verify tricentics logo is displayed and enabled
And User verify tricentics title is displayed and enabled
And User verify tricentics description is displayed and enabled
And User verify search support input box is displayed and enabled	
And User verify support button is displayed and enabled
And User verify Automobile link is displayed and enabled
And User verify Truck link is displayed and enabled
And User verify Motor cycle link is displayed and enabled
And User verify Camper link is displayed and enabled

Scenario: Slider validation
#Given User navigates-to "https://sampleapp.tricentis.com/101/" page 
And User verify page title is "Tricentis Vehicle Insurancee"
And User verify the slidders displayed on page

Scenario: Welcome block validation
#Given User navigates-to "https://sampleapp.tricentis.com/101/" page 
And User verify page title is "Tricentis Vehicle Insurance"
And User verify welcome container is displayed
And User verify features are displayed below welcome container
And User verify welcome footer text is displayed
And User verify read more link is displayed and enabled

Scenario: Insurance block validation
#Given User navigates-to "https://sampleapp.tricentis.com/101/" page 
And User verify page title is "Tricentis Vehicle Insurance"
And User verify insurance block header is displayed
And User verify automobile image is displayed
And User verify camper image is displayed
And User verify truck image is displayed
And User verify motorcycle image is displayed

Scenario: Footer validation
#Given User navigates-to "https://sampleapp.tricentis.com/101/" page 
And User verify page title is "Tricentis Vehicle Insurance"
And User scroll to footer section
And User verify links in the footer section


