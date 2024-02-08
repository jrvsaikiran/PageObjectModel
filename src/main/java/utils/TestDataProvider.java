package utils;

import java.io.FileInputStream;  
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class TestDataProvider {
	
//	@Test
	@DataProvider(name="fetchData")
	public static String[][] getData(String sheetName) {
		
		
		String[][] testData = null ;
		
	/*	testData[0][0] = "TesterSon";
		testData[0][1] = "JohnSon";
		testData[0][2] = "TesterSon@gmail.com";
		testData[0][3] = "TesterSon@gmail.com";
		
		testData[1][0] = "Peter";
		testData[1][1] = "Sam";
		testData[1][2] = "Peter@gmail.com";
		testData[1][3] = "Peter@gmail.com";*/
		
		try {
			FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			XSSFSheet sheet = wb.getSheet(sheetName);
			
			
			int rowCount = sheet.getLastRowNum();
			
			int columnCount = sheet.getRow(0).getLastCellNum();
			
			System.out.println("Row Count "+rowCount);
			
			System.out.println("Column Count "+columnCount);
			
			testData = new String[rowCount][columnCount];
			
			
			for(int i=1;i<=rowCount;i++) {
				
				XSSFRow row = sheet.getRow(i);
				
				for(int j=0;j<columnCount;j++) {
					
					String cellData = row.getCell(j).getStringCellValue();
					
					System.out.println("The value of row "+(i-1)+" and column "+j+" is : "+cellData);
					
					testData[i-1][j]= cellData;
					
				}
				
			}
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return testData;
		
	}
	
	
	

}
