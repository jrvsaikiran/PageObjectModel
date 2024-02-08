package pom.irctc.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC007";
		testCaseDescription = "To verify wheather the user is user is able to register in IRCTC saloon application ";
		author = "Jakkula Raja Venkata Sai Kiran";
		catogory = "smoke";
		browserName = "chrome";
		appName = "irctc";
		sheetName = "TC007";		
	}
	
	
	
	
	@Test(dataProvider="fetchData")
	
	public void ghy77(String name, String organisation, String address,
			String mobile, String email, String request,
			String orgstation, String destination,
			String year1, 
			String departure,String year2,
			String day, String ofdays, String noofcoach,
			String passenger, String passenger2
			, String purpose, String service) {
		
	
	
		
		
		new CovidAlertPage(driver, test)
		.clickOnOk()
		
	
		.mouseOverOnHolidays()
		.mouseOverOnStays()
		.clickOnLounge()
		.windowChange1()
		.clickOverOnMenuAtTopRightSide()
		.clickOnCharter()
		
		.clickOntoprightArrowToClose()
		.clickOnEnquiryForm()
		.enterNameOfApplicant(name)
		.enterNameOfOrganisation(organisation)
		.enterAddress(address)
		.enterMobileNumber(mobile)
		.enteremail(email)
		.selectrequestfor(request)
		.pageDown()
		.enterOrginatingStation(orgstation)
		.enterDestinatingStation(destination)
		.clickOnDateOfDepartureBar()
		.selectYear(year1)
		.clickOnNextMonthIconOnDeparture()
		.clickOnDateOnDeparture(departure)
		.clickOnDateOfArrival()
		.selectArrivalYear(year2)
		.clickOnNextMonthIconOnArrival()
		.clickArrivalDay(day)
		.enterDurationOfTourInTermsOfNumberofDays(ofdays)
		.enterNumberAndTypeOfCoachesRequired(noofcoach)
		.enterNumberOfPassengers(passenger)
		.enterNumberOfPassengers1(passenger2)
		.enterPurposeOfCharter(purpose)
		.enterAdditionalServicesRequired(service)
		.clickOnSWubmit()
		
		
		;
	}
}
