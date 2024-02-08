package pom.facebook.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers{
	
	public LoginPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver; 
		this.test = test;
	}
	
 
	public LoginPage clickOnEnglish() {
		clickByXpath(prop.getProperty("LoginPage.clickOnEnglish.xpath"));
			
		return this;
	}
	public SignUpPage clickOnCreatNewAccount() {
		clickByXpath(prop.getProperty("LoginPage.clickOnCreatNewAccount.xpath"));
		return new SignUpPage(driver,test);
		
	}
	}

