package pom.irctc.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC009  extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC009";
		testCaseDescription = "To verify wheather the user is user is able to register Hotel in IRCTC without GST verify mobile number application ";
		author = "Jakkula Raja Venkata Sai Kiran";
		catogory = "smoke";
		browserName = "chrome";
		appName = "irctc";
		sheetName = "TC009";
				
	}
	
	
	
	
	@Test(dataProvider="fetchData")
	
public void cvds466(String city, String year,
		String month, String date,String year2
		,String month2, String date2,String adultnum, String email,
		String mobile, String title, String firstname,
		String lastname, String country, String state,
		String mobile2, String gstno,String verifyhotel,
		String verifyprice,String verifyotp) {
		
	int adult = Integer.parseInt(adultnum);
		
		new CovidAlertPage(driver,test)
		.clickOnOk()
		
		
		.mouseOverOnHolidays()
		.mouseOverOnStays()
		.clickOnLounge()
		.windowChange1()
		.clickOnHotelsIcon()
		.hotelWindow1()
		
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
		//.clickOnLogInButtonForGst() ;  					
		.clickOnLogInButtonForNoGst()				//with out GST
		
		//new HotelBookWithOutGst()
		.selectTitle(title)
		.enterFirstName(firstname)
		.enterLasteName(lastname)
		.selectCopuntry(country)
		.selectState(state)
		.enterMobileNumber(mobile2)
		//.enterEmailId("tester@gmail.com")
		.selectGstAsYesOrNo(gstno)  
		// no gst
		.verifyHotelName(verifyhotel)
		//.verifyHotelPrice(verifyprice)
		
		
		.clickOnContinue()
		
		//new HotelPaymentWithOutGst()
		.clickOnAgree()
		.clickOnMakePayment()
		
		//new HotelOtpField()
		.verifyTextContainOtp(verifyotp)
		
		
		;
		
}
}
