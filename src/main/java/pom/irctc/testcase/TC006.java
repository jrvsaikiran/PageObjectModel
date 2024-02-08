package pom.irctc.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{
	
	

	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC006";
		testCaseDescription = "To verify wheather the user is user is able to register in IRCTC registration application ";
		author = "Jakkula Raja Venkata Sai Kiran";
		catogory = "smoke";
		browserName = "chrome";
		appName = "irctc";
		sheetName ="TC006";
				
	}
	
	
	@Test (dataProvider="fetchData")

	public void hjy77(String name,String pass,
			String confpass,String language,
			String securityquestion,String answer,
			String fistname,String secondname,
			String lastname, String occupation,
			String dob, String status, String nation,
			String gender, String email, String mobile,
			String nationality, String flat, String street, String locality,
			String pincode, String state, String city,
			String postoff, String phnumber,String flatnumb,String resistreet,
			String resilocality,String specountry, String  resipin,
			String resistate, String resicity, String resipostoff,
			String resinumb
			) {
		
		
		//int squ = Integer.parseInt(securityquestion);
	//	int occ = Integer.parseInt(occupation);
		int natio = Integer.parseInt(nation);
		
		new CovidAlertPage(driver, test)
		.clickOnOk()
		.clickOnRegister()
		.enterUserName(name)
		.enterPassword(pass)
		.enterConformPassword(confpass)
		.clickOnLanguage()
		.clickOnPreferredlanguage(language)
		.clickOnSequrityQuestion()
		.clickOnSequrityQuestionNumber(securityquestion)
		.enterSequrityAnswer(answer)
		.clickOnSubmit()
	
		
		.enterFirstName(fistname)
		.enterSecondName(secondname)
		.enterLastName(lastname)
		.clickOnOccupation()
		.clickOnSpecificOccupation(occupation)
		.clickOnDateOfBirth()
		.enterDOB(dob)
		
		.clickOnMatrialStatus(status)
		.selectNation(natio)
		.clickOnGender(gender)
		.enterEmail(email)
		.enterMobile(mobile)
		.selectNationality(nationality)
		.clickOnContinue()
		.enterFlatDoorNumber(flat)
		.enterStreetLane(street)
		.enterAddressLocality(locality)
		.enterPincode(pincode)
		.enterState(state)
		.enterCity(city)
		.enterPostOffice(postoff)
		
		
	
		
		.enterPhoneNumber(phnumber)
		.clickOnNo()
		.enterResidenceFlatDoorNumber(flatnumb)
		.enterResidenceStreetLane(resistreet)
		.enterResidenceAddressLocality(resilocality)
		.clickOnCountry()
		.clickOnSpecificCountry(specountry)
		.enterResidencePincode(resipin)
		.enterResidenceOfficeState(resistate)
		
		.enterResidencecity(resicity)
		.enterResidenceOfficePostoffice(resipostoff)
		.enterResidencePhoneNumber(resinumb)
		
		
		
		
		;
	}
}
