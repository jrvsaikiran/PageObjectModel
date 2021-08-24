package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SaloonMandatoryCheck extends GenericWrappers{
	
	public SaloonMandatoryCheck(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver; 
		this.test = test;
	}
	
	
	
	public SaloonMandatoryCheck enterNameOfApplicant(String data) {
		enterByXpath(prop.getProperty("SaloonMandatoryCheck.xpath.enterNameOfApplicant"), data);
		return this;
	}
	public SaloonMandatoryCheck enterNameOfOrganisation(String data) {
		enterByXpath(prop.getProperty("SaloonMandatoryCheck.xpath.enterNameOfOrganisation"), data);
		return this;
	}
	public SaloonMandatoryCheck enterAddress(String data) {
		enterByXpath(prop.getProperty("SaloonMandatoryCheck.xpath.enterAddress"), data);
		return this;
	}
	public SaloonMandatoryCheck enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("SaloonMandatoryCheck.xpath.enterMobileNumber"), data);
		return this;
	}
	public SaloonMandatoryCheck enteremail(String data) {
		enterByXpath(prop.getProperty("SaloonMandatoryCheck.xpath.enteremail"), data);
		return this;
	}
	public SaloonMandatoryCheck selectrequestfor(String value) {
		selectVisibileTextByXpath(prop.getProperty("SaloonMandatoryCheck.xpath.selectrequestfor"), value);
		return this;
	}
	
	public SaloonMandatoryCheck pageDown() {
		pageDownByXpath("//html/body");
		return this;
	}
	
	
	public SaloonMandatoryCheck enterOrginatingStation(String data) {
		enterByXpath(prop.getProperty("SaloonMandatoryCheck.xpath.enterOrginatingStation"), data);
		return this;
	}
	public SaloonMandatoryCheck enterDestinatingStation(String data) {
		enterByXpath(prop.getProperty("SaloonMandatoryCheck.xpath.enterDestinatingStation"), data);
		return this;
	}
	
	
	public SaloonMandatoryCheck clickOnDateOfDepartureBar() {
		clickByXpath(prop.getProperty("SaloonMandatoryCheck.xpath.clickOnDateOfDepartureBar"));
		return this;
	}
	public SaloonMandatoryCheck selectYear(String value) {
		selectVisibileTextByXpath(prop.getProperty("SaloonMandatoryCheck.xpath.selectYear"), value);		
		return this;
	}
	
	
	
	
	
	public SaloonMandatoryCheck clickOnNextMonthIconOnDeparture() {
		clickByXpath(prop.getProperty("SaloonMandatoryCheck.xpath.clickOnNextMonthIconOnDeparture"));
		return this;
	}
	public SaloonMandatoryCheck clickOnDateOnDeparture(String departure) {
		clickByXpath(prop.getProperty("SaloonMandatoryCheck.xpath.clickOnDateOnDeparture"),departure);
		return this;
	}
	public SaloonMandatoryCheck clickOnDateOfArrival() {
		clickByXpath(prop.getProperty("SaloonMandatoryCheck.xpath.clickOnDateOfArrival"));
		return this;
	}
	public SaloonMandatoryCheck selectArrivalYear(String value) {
		selectVisibileTextByXpath(prop.getProperty("SaloonMandatoryCheck.xpath.selectArrivalYear"), value);		
		return this;
	}
	
	
	public SaloonMandatoryCheck clickOnNextMonthIconOnArrival() {
		clickByXpath(prop.getProperty("SaloonMandatoryCheck.xpath.clickOnNextMonthIconOnArrival"));
		return this;
	}
	public SaloonMandatoryCheck clickArrivalDay(String day) {
		clickByXpath(prop.getProperty("SaloonMandatoryCheck.xpath.clickArrivalDay"),day);
		return this;
	}
	public SaloonMandatoryCheck enterDurationOfTourInTermsOfNumberofDays(String data) {
		enterByXpath(prop.getProperty("SaloonMandatoryCheck.xpath.enterDurationOfTourInTermsOfNumberofDays"), data);
		return this;
	}
	public SaloonMandatoryCheck enterNumberAndTypeOfCoachesRequired(String data) {
		enterByXpath(prop.getProperty("SaloonMandatoryCheck.xpath.enterNumberAndTypeOfCoachesRequired"), data);
		return this;
	}
	public SaloonMandatoryCheck enterNumberOfPassengers(String data) {
		enterByXpath(prop.getProperty("SaloonMandatoryCheck.xpath.enterNumberOfPassengers"), data);
		return this;
	}
	public SaloonMandatoryCheck enterNumberOfPassengers1(String data) {
		enterByXpath(prop.getProperty("SaloonMandatoryCheck.xpath.enterNumberOfPassengers1"), data);
		return this;
	}
	public SaloonMandatoryCheck enterPurposeOfCharter(String data) {
		enterByXpath(prop.getProperty("SaloonMandatoryCheck.xpath.enterPurposeOfCharter"), data);
		return this;
	}
	public SaloonMandatoryCheck enterAdditionalServicesRequired(String data) {
		enterByXpath(prop.getProperty("SaloonMandatoryCheck.xpath.enterAdditionalServicesRequired"), data);
		return this;
	}
	public SaloonMandatoryCheck clickOnSWubmit() {
		clickByXpath(prop.getProperty("SaloonMandatoryCheck.xpath.clickOnSWubmit"));
		return this;
	}
	
	

}
