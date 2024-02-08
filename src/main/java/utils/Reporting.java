package utils;

import org.testng.annotations.Test;  

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

@Test
public abstract class Reporting {
	
	
		
		public static ExtentReports report;
		
		public ExtentTest test;
		
		public String testCaseName, testCaseDescription;
		
		public String author, catogory;
		
		public void startReport() {
			 report = new ExtentReports("./reports_Latest2/Result.html", false);
		}
		
		
		public void startTest(String testName, String description) {
			 
			test = report.startTest(testName, description);
			 test.assignAuthor(author);
			 test.assignCategory(catogory);
		}
		
		public abstract long takeSnap();
			
		
		
		public void reportStep(String details, String status) {
			
			long number = takeSnap();
		
			if(status.equalsIgnoreCase("pass")) {
				test.log(LogStatus.PASS, details +test.addScreenCapture(".././reports/screenshots/"+number+".png")	);
			} else if(status.equalsIgnoreCase("fail")) {
				test.log(LogStatus.FAIL, details +test.addScreenCapture(".././reports/screenshots/"+number+".png")	);
			} else if(status.equalsIgnoreCase("info")) {
				test.log(LogStatus.INFO, details +test.addScreenCapture(".././reports/screenshots/"+number+".png")	);
			} else if(status.equalsIgnoreCase("warning")) {
				test.log(LogStatus.WARNING, details +test.addScreenCapture(".././reports/screenshots/"+number+".png")	);
			}
				
		}
		
		
		

		public void reportStep(String details, String status, boolean snap) {
			
			//long number = takesnap();
			if(!snap) {
				

			if(status.equalsIgnoreCase("pass")) {
				test.log(LogStatus.PASS, details 	);
			} else if(status.equalsIgnoreCase("fail")) {
				test.log(LogStatus.FAIL, details);
			} else if(status.equalsIgnoreCase("info")) {
				test.log(LogStatus.INFO, details );
			} else if(status.equalsIgnoreCase("warning")) {
				test.log(LogStatus.WARNING, details );
			}
			}
				
		}
		
		
		public void endTest() {
			report.endTest(test);
		}
		
		
		public void endReport() {
			report.flush();
		}

}
