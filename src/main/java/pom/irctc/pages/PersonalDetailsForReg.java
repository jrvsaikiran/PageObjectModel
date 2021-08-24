package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PersonalDetailsForReg extends GenericWrappers{

	
	public PersonalDetailsForReg (RemoteWebDriver driver , ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	

	public PersonalDetailsForReg enterFirstName(String data) {
		enterByXpath(prop.getProperty("PersonalDetailsForReg.xpath.enterFirstName"), data);
		return this;
	}
	public PersonalDetailsForReg enterSecondName(String data) {
		enterByXpath(prop.getProperty("PersonalDetailsForReg.xpath.enterSecondName"), data);
		return this;
	}
	public PersonalDetailsForReg enterLastName(String data) {
		enterByXpath(prop.getProperty("PersonalDetailsForReg.xpath.enterLastName"), data);
		return this;
	}
	public PersonalDetailsForReg clickOnOccupation() {
		clickByXpath(prop.getProperty("PersonalDetailsForReg.xpath.clickOnOccupation"));
		return this;
	}
	public PersonalDetailsForReg clickOnSpecificOccupation(String occupation) {
		//range 1-7
		clickByXpath(prop.getProperty("PersonalDetailsForReg.xpath.clickOnSpecificOccupation"),occupation);
		return this;
	}
	
	
	
	
	
	
	public PersonalDetailsForReg clickOnDateOfBirth() {
		clickByXpath(prop.getProperty("PersonalDetailsForReg.xpath.clickOnDateOfBirth"));
		return this;
	}
	public PersonalDetailsForReg enterDOB(String data) {
		enterByXpath(prop.getProperty("PersonalDetailsForReg.xpath.enterDOB"), data);
		return this;
	}
	
	
	
	public PersonalDetailsForReg selectYear(int value) {
		selectValueByXpath(prop.getProperty("PersonalDetailsForReg.xpath.selectYear"), value);
		return this;
	}
	public PersonalDetailsForReg selectMonth(String value) {
		selectVisibileTextByXpath(prop.getProperty("PersonalDetailsForReg.xpath.selectMonth"), value);
		return this;
	}
	public PersonalDetailsForReg clickOnDay(int day) {
		clickByXpath(prop.getProperty("PersonalDetailsForReg.xpath.clickOnDay"));
		
		return this;
	}
	
	public PersonalDetailsForReg clickOnMatrialStatus(String status) {
		clickByXpath(prop.getProperty("PersonalDetailsForReg.xpath.clickOnMatrialStatus"), status);
		return this;
	}
	
	
	public PersonalDetailsForReg selectNation(int value) {
		selectValueByXpath(prop.getProperty("PersonalDetailsForReg.xpath.selectNation"), value);
		return this;
	}
	public PersonalDetailsForReg clickOnGender(String gender) {
		clickByXpath(prop.getProperty("PersonalDetailsForReg.xpath.clickOnGender"), gender);
		return this;
	}
	
	
	
	
	public PersonalDetailsForReg enterEmail(String data) {
		enterByXpath(prop.getProperty("PersonalDetailsForReg.xpath.enterEmail"), data);
		return this;
	}
	public PersonalDetailsForReg enterMobile(String data) {
		enterByXpath(prop.getProperty("PersonalDetailsForReg.xpath.enterMobile"), data);
		return this;
	}
	public PersonalDetailsForReg selectNationality(String value) {
		selectVisibileTextByXpath(prop.getProperty("PersonalDetailsForReg.xpath.selectNationality"), value);
		return this;
	}
	public AddressFieldReg clickOnContinue() {
		clickByXpath(prop.getProperty("PersonalDetailsForReg.xpath.clickOnContinue"));
		return new AddressFieldReg(driver,test);
	}   
	
	
}
