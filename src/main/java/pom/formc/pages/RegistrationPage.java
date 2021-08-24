package pom.formc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	
	public RegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver; 
		this.test = test;
	}
	
	
	
	

	public RegistrationPage enterUserId(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.xpath.enterUserId"), data);
		return this;
	}
	public RegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.enterPassword.xpath"), data);
		return this;
	}
	public RegistrationPage enterConformPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.enterConformPassword.xpath"), data);
		return this;
	}
	
	
	
	public RegistrationPage selectSequrityQuestion(int data) {
		
		selectIndexByXpath(prop.getProperty("RegistrationPage.xpath.selectSequrityQuestion"), data);
		return this;
	}
	
	
	
	public RegistrationPage enterYourAnswer(String data){
		enterByXpath(prop.getProperty("RegistrationPage.xpath.enterYourAnswer"), data);
		return this;
	}
	public RegistrationPage enterName(String data){
		enterByXpath(prop.getProperty("RegistrationPage.xpath.enterName"), data);
		return this;
	}
	
	
	
	
	
	public RegistrationPage selectGender(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.xpath.selectGender"), value);
		return this;
	}
	/*public RegistrationPage clickGender(String gender) {
		clickByXpath("//option[@value='"+gender+"']");
		return this;
	}*/
	
	
	
	
	
	
	
	
	
	
	
	public RegistrationPage enterDateOfBirth(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.xpath.enterDateOfBirth"), data);
		return this;
	}
	public RegistrationPage enterDesignation(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.xpath.enterDesignation"), data);
		return this;
	}
	public RegistrationPage enterEmailId(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.xpath.enterEmailId"), data);
		return this;
	}
	public RegistrationPage enterMobile(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.xpath.enterMobile"), data);
		return this;
	}
	public RegistrationPage enterPhoneNumber(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.xpath.enterPhoneNumber"), data);
		return this;
	}
	public RegistrationPage selectNationality(String value) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.xpath.selectNationality"), value);
		return this;
	}
	public RegistrationPage enterName1(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.xpath.enterName1"), data);
		return this;
	}
	public RegistrationPage enterCapasity(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.xpath.enterCapasity"), data);
		return this;
	}
	public RegistrationPage enterAddress(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.xpath.enterAddress"), data);
		return this;
	}
	public RegistrationPage selectState(int state) {
		selectIndexByXpath(prop.getProperty("RegistrationPage.xpath.selectState"), state);
		return this;
	}
	public RegistrationPage selectCityOrDistrict(int value) {
		selectIndexByXpath(prop.getProperty("RegistrationPage.xpath.selectCityOrDistrict"), value);
		return this;
	}
	public RegistrationPage selectAccomodationType(int value) {
		selectIndexByXpath(prop.getProperty("RegistrationPage.xpath.selectAccomodationType"), value);
		return this;
	}
	public RegistrationPage selectAccomodationGrade(int value) {
		selectIndexByXpath(prop.getProperty("RegistrationPage.xpath.selectAccomodationGrade"), value);
		return this;
	}
	public RegistrationPage enterEmailId1(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.xpath.enterEmailId1"), data);
		return this;
	}
	public RegistrationPage enterMobile1(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.xpath.enterMobile1"), data);
		return this;
	}
	public RegistrationPage enterPhoneNumber1(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.xpath.enterPhoneNumber1"), data);
		return this;
	}
	public RegistrationPage enterName11(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.xpath.enterName11"), data);
		return this;
	}
	public RegistrationPage enterAddress1(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.xpath.enterAddress1"), data);
		return this;
	}
	public RegistrationPage selectState1(int value) {
		selectIndexByXpath(prop.getProperty("RegistrationPage.xpath.selectState1"), value);
		return this;
	}
	public RegistrationPage selectCityOrDistrict1(int value) {
		selectIndexByXpath(prop.getProperty("RegistrationPage.xpath.selectCityOrDistrict1"), value);
		return this;
	}
	public RegistrationPage enterEmailId11(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.xpath.enterEmailId11"), data);
		return this;
	}
	public RegistrationPage enterPhoneNumber11(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.xpath.enterPhoneNumber11"), data);
		return this;
	}
	public RegistrationPage enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.xpath.enterMobileNumber"), data);
		return this;
		
	}
	
	public RegistrationPage clickAdd() {
		clickByXpath("//input[@value='Add']");
		return this;
	}
	
	
	
	
	
	
	
}
