package pom.irctc.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC008  extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC008";
		testCaseDescription = "To verify wheather the user is user is able to register Hotel in IRCTC with GST application ";
		author = "Jakkula Raja Venkata Sai Kiran";
		catogory = "smoke";
		browserName = "chrome";
		appName = "irctc";
		sheetName = "TC008";
				
	}
	
	
	
	
	
@Test(dataProvider="fetchData")

	public void ttrftg5g5(String city, String year,
			String month, String date,String year2
			,String month2, String date2, String adultnumber, String email,
			String mobile, String title, String firstname,
			String lastname, String country, String state,String mobile2, String gstyes,
			String gstnum,
			String company, String address, String verifyname,
			String verifyprice,String gstmsg
			
			) {

	int adult = Integer.parseInt(adultnumber);
		
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseOverOnHolidays()
		.mouseOverOnStays()
		
		.clickOnLounge()
		.windowChange1()
		
		.clickOnHotelsIcon()
		
		.hotelWindow1()
		
		//hotelbookingpage
		.enterCityOrHotelName(city)
		.clickOnCity()
		.clickOnCheckInDateBar()
		.clickOnDateHeadder()
		.clickOnYear(year)
		.clickOnMonth(month)
		.clickOnDate(date)
		.clickOnCheckOutDateBar()
		.clickOnCheckOutDateHeadder()
		.clickOnCheckOutYear(year2)
		.clickOnCheckOutMonth(month2)
		.clickOnCheckOutDate(date2)
		.clickOnRoomsGuestBar()
		
		.selectOnAdultsNumber(adult)
		.clickOnDone()
		.clickOnFindHotel()
		
		//new HotelDisplayPage()
		.clickOnFirstDisplayedHotel()
		
		.hotelWindow2()
		
		
		
		//new HotelSecondDisplayed()
		.getTextOfHotelName()
		
		
		.getTextOfHotelPayCost()
		
		
		.clickOnContinueToBook()
		
		//new HotelGuestUserLoginPage()
		.clickOnGuestUserLogin()
		
		//new HotelGuestUserLoginPage2()
		.enterEmail(email)
		.enterMobileNumber(mobile)
		.clickOnLogInButtonForGst()                 //with GST
		
		//new HotelBookWithGst()
		.selectTitle(title)
		.enterFirstName(firstname)
		.enterLasteName(lastname)
		.selectCopuntry(country)
		.selectState(state)
		.enterMobileNumber(mobile2)
		//.enterEmailId("Saikiran@gmail.com")
		.selectGstAsYesOrNo(gstyes)                      //select yes for gst
		.enterGstNumber(gstnum)
		.enterCompanyName(company)
		.pageDown()
		.enterCompanyAddress(address)
		
		
		.verifyHotelName(verifyname)
		
		
		.verifyHotelPrice(verifyprice)
		
		.clickOnContinue()
		.verifyGstErrorMsgDisplayed(gstmsg)
		
		
		
		
		;
	}
}
