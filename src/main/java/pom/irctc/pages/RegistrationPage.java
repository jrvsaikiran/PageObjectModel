package pom.irctc.pages;


import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	
	public RegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver; 
		this.test = test;
	}
	
	
	public RegistrationPage enterUserName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.xpath.enterUserName"), data);
		return this;
	}
	public RegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.xpath.enterPassword"), data);
		return this;
	}
	public RegistrationPage enterConformPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.xpath.enterConformPassword"), data);
		return this;
	}
	public RegistrationPage clickOnLanguage() {
		clickByXpath(prop.getProperty("RegistrationPage.xpath.clickOnLanguage"));
		return this;
	}
	public RegistrationPage clickOnPreferredlanguage(String language) {
		clickByXpath(prop.getProperty("RegistrationPage.xpath.clickOnPreferredlanguage"), language);
		return this;
	}
	
	
	
	public RegistrationPage clickOnSequrityQuestion() {
		clickByXpath(prop.getProperty("RegistrationPage.xpath.clickOnSequrityQuestion"));
		return this;
	}
	
	public RegistrationPage clickOnSequrityQuestionNumber(String securityquestion) {
		clickByXpath(prop.getProperty("RegistrationPage.xpath.clickOnSequrityQuestionNumber"), securityquestion);
		return this;
	}
	
	
	
	
	
	public RegistrationPage enterSequrityAnswer(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.xpath.enterSequrityAnswer"), data);
		return this;
	}
	public PersonalDetailsForReg clickOnSubmit() {
		clickByXpath(prop.getProperty("RegistrationPage.xpath.clickOnSubmit"));
		return new PersonalDetailsForReg(driver,test);
	}
	public PersonalDetailsForReg clickOnPersonaldetails() {
		clickByXpath(prop.getProperty("RegistrationPage.xpath.clickOnPersonaldetails"));
		return new PersonalDetailsForReg(driver,test);
	}
	
	
}
