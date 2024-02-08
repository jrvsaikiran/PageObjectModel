package pom.phptravels.testcase;

import org.testng.annotations.BeforeClass; 
import org.testng.annotations.Test;

import pom.phptravels.pages.RegistrationOfPhpTravels;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC004";
		testCaseDescription = "To verify wheather the user is user is able to register in phpTravels application ";
		author = "Jakkula Raja Venkata Sai Kiran";
		catogory = "smoke";
		browserName = "chrome";
		appName = "phptravels";
		sheetName = "TC004";
				
	}
	
	@Test(dataProvider="fetchData")
	
	public void ju78 (String firstname, String lastname
			,String email , String phone,
			String company, String address1
			,String address2, String city,
			String state, String pincode, String country,
			String mobile, String pass, String confpass) {
		
		//int count = Integer.parseInt(country);
		
		new RegistrationOfPhpTravels(driver,test)
		.enterFirstName(firstname)
		.enterLastName(lastname)
		.enterEmailId(email)
		.clickONNation()
		.clickByNation()
		.enterPhoneNumber(phone)
		.enterCompanyName(company)
		.enterStreetAddress(address1)
		.enterStreetAddress1(address2)
		.entercity(city)
		//.selectState("Andhra Pradesh")
		.enterState(state)
		.enterPostCode(pincode)
		//.waitTime(5000)
		.selectCountry(country)
	
		.enterMobileNumber(mobile)
		.enterPassword(pass)
		.enterConformPassword(confpass)
		;
		
		
	}
	
}
