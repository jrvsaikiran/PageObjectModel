package pom.facebook.testcase;

import org.testng.annotations.BeforeClass; 
import org.testng.annotations.Test;

import pom.facebook.pages.LoginPage;
import utils.TestDataProvider;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC001";
		testCaseDescription = "To verify wheather the user is user is able to register in facebook application ";
		author = "Jakkula Raja Venkata Sai Kiran";
		catogory = "regression";
		browserName = "chrome";
		appName = "facebook";
		sheetName = "TC001";
				
	}
	
		@Test (dataProvider="fetchData",dataProviderClass=TestDataProvider.class)
		
		public void ghygyg(String firstName, String lastName, 
				String mobile,String password,
				String date, String month, String year, String gender) {
			
			//int dob  = Integer.parseInt(date);
			
			//int yrs  = Integer.parseInt(year);
			
			new LoginPage(driver,test)
			//.clickOnEnglish()
			.clickOnCreatNewAccount()
			.enterFirstName(firstName)
			.enterSecondName(lastName)
			.enterMobileNumberOrEmail(mobile)
			.enterNewPassword(password)
			.selectDay(date)
	
			.selectMonth(month)
		
			.selectYear(year)
		
			.clickOnGender(gender);
			
		}
		
	}


