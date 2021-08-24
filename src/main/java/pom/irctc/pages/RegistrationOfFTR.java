package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationOfFTR extends GenericWrappers{
	
	
	
	public RegistrationOfFTR(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver; 
		this.test = test;
	}
	
	public RegistrationOfFTR enterUserId(String data) {
		enterByXpath(prop.getProperty("RegistrationOfFTR.xpath.enterUserId"), data);
		return this;
	}
	public RegistrationOfFTR enterPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationOfFTR.xpath.enterPassword"), data);
		return this;
	}
	public RegistrationOfFTR enterConformPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationOfFTR.xpath.enterConformPassword"), data);
		return this;
	}
	public RegistrationOfFTR selectSequrityQuestion(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationOfFTR.xpath.selectSequrityQuestion"), value);
		return this;
	}
	public RegistrationOfFTR enterSequrityAnswer(String data) {
		enterByXpath(prop.getProperty("RegistrationOfFTR.xpath.enterSequrityAnswer"), data);
		return this;
	}
	public RegistrationOfFTR clickOnDateBar() {
		clickByXpath(prop.getProperty("RegistrationOfFTR.xpath.clickOnDateBar"));
		return this;
	}
	
	
	
	public RegistrationOfFTR selectYear(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationOfFTR.xpath.selectYear") , value);
		return this;
	}
	
	public RegistrationOfFTR selectMonth(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationOfFTR.xpath.selectMonth") , value);
		return this;
	}
	public RegistrationOfFTR clickOnDate(String day) {
		clickByXpath(prop.getProperty("RegistrationOfFTR.xpath.clickOnDate"),day);
		return this;
	}
	public RegistrationOfFTR clickOnGender(String gender) {
		clickByXpath(prop.getProperty("RegistrationOfFTR.xpath.clickOnGender"),gender);
		return this;
	}
	
	
	
	public RegistrationOfFTR clickOnMaritalStatus(String status) {
		clickByXpath(prop.getProperty("RegistrationOfFTR.xpath.clickOnMaritalStatus"), status);
		return this;
	}
	
	
	public RegistrationOfFTR enterEmail(String data) {
		enterByXpath(prop.getProperty("RegistrationOfFTR.xpath.enterEmail"), data);
		return this;
	}
	public RegistrationOfFTR selectOccupation(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationOfFTR.xpath.selectOccupation"), value);
		return this;
	}
	public RegistrationOfFTR enterFirstName(String data) {
		enterByXpath(prop.getProperty("RegistrationOfFTR.xpath.enterFirstName"), data);
		return this;
	}
	public RegistrationOfFTR enterMiddleName(String data) {
		enterByXpath(prop.getProperty("RegistrationOfFTR.xpath.enterMiddleName"), data);
		return this;
	}
	public RegistrationOfFTR enterLastName(String data) {
		enterByXpath(prop.getProperty("RegistrationOfFTR.xpath.enterLastName"), data);
		return this;
	}	
	public RegistrationOfFTR selectNation(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationOfFTR.xpath.selectNation"), value);
		return this;
	}
	public RegistrationOfFTR enterFlatOrDoorNumber(String data) {
		enterByXpath(prop.getProperty("RegistrationOfFTR.xpath.enterFlatOrDoorNumber"), data);
		return this;
	}
	public RegistrationOfFTR enterStreetNumber(String data) {
		enterByXpath(prop.getProperty("RegistrationOfFTR.xpath.enterStreetNumber"), data);
		return this;
	}
	public RegistrationOfFTR enterArear(String data) {
		enterByXpath(prop.getProperty("RegistrationOfFTR.xpath.enterArear"), data);
		return this;
	}
	public RegistrationOfFTR selectCountry(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationOfFTR.xpath.selectCountry"), value);
		return this;
	}
	public RegistrationOfFTR enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("RegistrationOfFTR.xpath.enterMobileNumber"), data);
		return this;
	}
	
	
	
	
	
	public RegistrationOfFTR enterPincode(String data) {
		enterByXpath(prop.getProperty("RegistrationOfFTR.xpath.enterPincode"), data);
		return this;
	}
	
	public RegistrationOfFTR clickOnCity() {
		clickByXpath(prop.getProperty("RegistrationOfFTR.xpath.clickOnCity"));
		return this;
	}
	
	
	
	
	
	public RegistrationOfFTR selectCityOrTown(int value) {
		selectIndexByXpath(prop.getProperty("RegistrationOfFTR.xpath.selectCityOrTown"), value);
		return this;
	}
	public RegistrationOfFTR selectState(int value) {
		selectIndexByXpath(prop.getProperty("RegistrationOfFTR.xpath.selectState"), value);
		return this;
	}
	public RegistrationOfFTR selectPostoffice(int value) {
		selectIndexByXpath(prop.getProperty("RegistrationOfFTR.xpath.selectPostoffice"), value);
		return this;
	}
	
	public RegistrationOfFTR pageDown() {
		pageDownByXpath("//html/body");
		return this;
	}
	
	
	
	
	public RegistrationOfFTR clickOnNo() {
		clickByXpath(prop.getProperty("RegistrationOfFTR.xpath.clickOnNo"));
		return this;
	}
	public RegistrationOfFTR enterResidenceFlatOrDoorNumber(String data) {
		enterByXpath(prop.getProperty("RegistrationOfFTR.xpath.enterResidenceFlatOrDoorNumber"), data);
		return this;
	}
	public RegistrationOfFTR enterResidenceStreetNumber(String data) {
		enterByXpath(prop.getProperty("RegistrationOfFTR.xpath.enterResidenceStreetNumber"), data);
		return this;
	}
	public RegistrationOfFTR enterResidenceArear(String data) {
		enterByXpath(prop.getProperty("RegistrationOfFTR.xpath.enterResidenceArear"), data);
		return this;
	}
	public RegistrationOfFTR selecResidenceCountry(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationOfFTR.xpath.selecResidenceCountry"), value);
		return this;
	}
	public RegistrationOfFTR enterResidenceMobileNumber(String data) {
		enterByXpath(prop.getProperty("RegistrationOfFTR.xpath.enterResidenceMobileNumber"), data);
		return this;
	}
	public RegistrationOfFTR enterResidencePincode(String data) {
		enterByXpath(prop.getProperty("RegistrationOfFTR.xpath.enterResidencePincode"), data);
		return this;
	}
	
	public RegistrationOfFTR clickOnResidenceCity() {
		clickByXpath(prop.getProperty("RegistrationOfFTR.xpath.clickOnResidenceCity"));
		return this;
	}
	
	
	
	
	
	
	
	public RegistrationOfFTR selectResidenceCityOrTown(int value) {
		selectIndexByXpath(prop.getProperty("RegistrationOfFTR.xpath.selectResidenceCityOrTown"), value);
		return this;
	}
	public RegistrationOfFTR selectResidenceState(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationOfFTR.xpath.selectResidenceState"), value);
		return this;
	}
	public RegistrationOfFTR selectResidencePostOffice(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationOfFTR.xpath.selectResidencePostOffice"), value);
		return this;
	}

}
