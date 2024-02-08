package pom.panindia.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.panindia.pages.ApplicationPagePanIndia;
import wrappers.ProjectWrappers;

public class TC003  extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC003";
		testCaseDescription = "To verify wheather the user is user is able to register in panIndia application ";
		author = "Jakkula Raja Venkata Sai Kiran";
		catogory = "smoke";
		browserName = "chrome";
		appName = "panindia";
		sheetName = "TC003";		
	}
	
	
	
	
	@Test (dataProvider="fetchData")
	public void dff878686(String pan_title, String pan_firstname, String pan_middlename, String pan_lastname,
			String pan_fatherfirstname, String pan_fathermiddlename, String pan_fatherlastname, String pan_mobilenumber,
			String pan_email, String pan_sourceofincome, String pan_dob, String buldnumber,
			String pan_addressline1, String pan_addressline2, String state, String country, String pincode,
			String office, String housenumb, String area, String city, String offstate, String pincode2,
			String idproof, String addressproof, String dateproof, String adarproof, String offaddproof
			) {
		
		int date = Integer.parseInt(dateproof);
		//int adar = Integer.parseInt(adarproof);
		//int add = Integer.parseInt(offaddproof);
		
		new ApplicationPagePanIndia(driver, test)
		.selectTitle(pan_title)
		.enterFirstName(pan_firstname)
		.enterMiddleName(pan_middlename)
		.enterLastName(pan_lastname)
		.enterFathersFirstName(pan_fatherfirstname)
		.enterFathersMiddleName(pan_fathermiddlename)
		.enterFathersLastName(pan_fatherlastname)
		.enterMobileNumber(pan_mobilenumber)
		.enterEmail(pan_email)
		.pageDown()
		.selectSourceOfIncome(pan_sourceofincome)
		.clickOnOffice()
		.enterDateOfBirth(pan_dob)
		.pageDown()
		.enterHouseNumberOrBuildingNumber(buldnumber)
		.enterAreaOrRoadStreet(pan_addressline1)
		.enterCItyOrTownOrDistrict(pan_addressline2)
		.selectStateOrUnionTeritory(state)
		.selectCountry(country)
		.enterPinCode(pincode)
		.enterNameOfOffice(office)
		.enterHouseNumber(housenumb)
		.enterAreaStreet(area)
		.enterCity(city)
		.pageDown()
		.selectOfficeState(offstate)
		.enterPincode(pincode2)
		.selectIdentityProof(idproof)
		.selectAddressProof(addressproof)
		.selectDateOfBirthProof1(date)
		.pageDown()
		.selectAadarProof1(adarproof)
		.selectOfficeAddressProof(offaddproof)
		.clickOnAgree()
		
		;
	}

}
