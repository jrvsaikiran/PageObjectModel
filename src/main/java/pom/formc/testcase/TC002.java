package pom.formc.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.formc.pages.Homepage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		
		testCaseName = "TC002";
		testCaseDescription = "To verify wheather the user is user is able to register in FORM C application ";
		author = "Jakkula Raja Venkata Sai Kiran";
		catogory = "smoke";
		browserName = "chrome";
		appName = "formc";
		sheetName = "TC002";
				
	}
	@Test (dataProvider="fetchData")
	
	public void  rtrt5657(String u_id, String pass, String rpass , String seququestion , String u_secans,String u_name,
			String u_gender,
			String u_dob, String u_designation,String u_emailid, String u_mobile, String u_phone,
			String u_nationality, String name, String capacity, String address,  String state, String city_distr, 
			 String acco_type ,String star_rat, String email,String mcontact , String  contact,
			 String name_o, String address_o, String state_o, String citydistr_o,
			 String emailid_o, String phoneno_o , String mobile_o) {
		
		
		int stat = Integer.parseInt(state);
		int dist = Integer.parseInt(city_distr);
		
		int seq = Integer.parseInt(seququestion);
		
		int acco = Integer.parseInt(acco_type);
		int star = Integer.parseInt(star_rat);
		int stao = Integer.parseInt(state_o);
		int city = Integer.parseInt(citydistr_o);
		
		
		new Homepage(driver, test)
		.clickOnSignUpRegistration()
		
		
		//new RegistrationPage()
		.enterUserId(u_id)
		.enterPassword(pass)
		.enterConformPassword(rpass)
		
		
		.selectSequrityQuestion(seq)
		
		.enterYourAnswer(u_secans)
		.enterName(u_name)
		.selectGender(u_gender)
		.enterDateOfBirth(u_dob)
		.enterDesignation(u_designation)
		.enterEmailId(u_emailid)
		.enterMobile(u_mobile)
		.enterPhoneNumber(u_phone)
		.selectNationality(u_nationality)
		.enterName1(name)
		.enterCapasity(capacity)
		.enterAddress(address)
		.selectState(stat)
		.selectCityOrDistrict(dist)
		.selectAccomodationType(acco)
		.selectAccomodationGrade(star)
		.enterEmailId1(email)
		.enterMobile1(mcontact)
		.enterPhoneNumber1(contact)
		
		.enterName11(name_o)
		.enterAddress1(address_o)
		.selectState1(stao)
		.selectCityOrDistrict1(city)
		.enterEmailId11(emailid_o)
		.enterPhoneNumber11(phoneno_o)
		.enterMobileNumber(mobile_o)
		.clickAdd()
		
		.enterName11(name_o)
		.enterAddress1(address_o)
		.selectState1(stao)
		.selectCityOrDistrict1(city)
		.enterEmailId11(emailid_o)
		.enterPhoneNumber11(phoneno_o)
		.enterMobileNumber(mobile_o)
		.clickAdd()
		
		.enterName11(name_o)
		.enterAddress1(address_o)
		.selectState1(stao)
		.selectCityOrDistrict1(city)
		.enterEmailId11(emailid_o)
		.enterPhoneNumber11(phoneno_o)
		.enterMobileNumber(mobile_o)
		.clickAdd()
		
		
		.enterName11(name_o)
		.enterAddress1(address_o)
		.selectState1(stao)
		.selectCityOrDistrict1(city)
		.enterEmailId11(emailid_o)
		.enterPhoneNumber11(phoneno_o)
		.enterMobileNumber(mobile_o)
		.clickAdd()
		
		;
		
	}
	
	}


