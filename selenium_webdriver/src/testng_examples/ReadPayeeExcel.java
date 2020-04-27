package testng_examples;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadPayeeExcel 
{
	public String[][] getdata() throws IOException  //main function is changed into this getdata() function
	{
		File  file=new File("C:\\Users\\Dell\\eclipse-workspace\\selenium_webdriver\\src\\PayeeDetails.xlsx");
		FileInputStream fin=new FileInputStream(file);
		
		//@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(fin);
		XSSFSheet sheet=wb.getSheet("PayeeDetails"); //name of the sheet inside the excel file
		
		String data[][]=new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
			{
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
			
		}
		
		return data;
		
		//wb.close();
		//fin.close();
		
	}//end 

}
