package pom.irctc.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
//import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers {
	
	
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC005";
		testCaseDescription = "To verify wheather the user is user is able to register in IRCTC FTR application ";
		author = "Jakkula Raja Venkata Sai Kiran";
		catogory = "smoke";
		browserName = "chrome";
		appName = "irctc";
		sheetName = "TC005";		
	}
	
	
	
@Test (dataProvider="fetchData")

//@Test(priority=1, enabled = true, dataProvider="")

	public void dfrt56ty( String id, String pass, String conpss,String squque,
			String sqans,String year,String month,
			String day,String gender, String status,
			String email,String occupation,String fname,
			String mname,String lname, String nation,String flat,
			String street,String area,String country,
			String mobnumb,String pincode, String city, String state,
			String postoff,String resflat, String resstreet,
			String resarea,String rescountry, String resmobilr,
			String respin,String rescity, String resstate,
			String respostoff) {
		
	
		//int day = Integer.parseInt(date);
		int cityo = Integer.parseInt(city);
		int stateo = Integer.parseInt(state);
		int pooff = Integer.parseInt(postoff);
		int recity = Integer.parseInt(rescity);
	
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseOverOnHolidays()
		
		.mouseOverOnStays()
		.clickOnLounge()
		
		.windowChange1()
		.clickOverOnMenuAtTopRightSide()
	
		
		.clickOnBookYourcoachOrTrain()
		.windowChange2()
		
		.clickOnNewUserOrSignUp()
		
		.enterUserId(id)
		.enterPassword(pass)
		.enterConformPassword(conpss)
		.selectSequrityQuestion(squque)
		.enterSequrityAnswer(sqans)
		.clickOnDateBar()
		.selectYear(year)
		.selectMonth(month)
		.clickOnDate(day)
		.clickOnGender(gender)
		.clickOnMaritalStatus(status)
		.enterEmail(email)
		.selectOccupation(occupation)
		.enterFirstName(fname)
		.enterMiddleName(mname)
		
		
		
		.enterLastName(lname)
		.selectNation(nation)
		.enterFlatOrDoorNumber(flat)
		.enterStreetNumber(street)
		.enterArear(area)
		.selectCountry(country)
		.enterMobileNumber(mobnumb)
		
		.enterPincode(pincode)
		
		.clickOnCity()
		.selectCityOrTown(cityo)
		.selectState(stateo)
		.pageDown()
		.selectPostoffice(pooff)
		.clickOnNo()
		.enterResidenceFlatOrDoorNumber(resflat)
		.enterResidenceStreetNumber(resstreet)
		.enterResidenceArear(resarea)
		.selecResidenceCountry(rescountry)
		.enterResidenceMobileNumber(resmobilr)
		.enterResidencePincode(respin)
		
		.clickOnResidenceCity()
		.selectResidenceCityOrTown(recity)
		.selectResidenceState(resstate)
		.selectResidencePostOffice(respostoff)
		
		;
		
	}
	
	
}
