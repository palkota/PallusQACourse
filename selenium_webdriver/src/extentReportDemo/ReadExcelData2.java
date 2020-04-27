package extentReportDemo;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData2 
{

	public String[][] getdata() throws IOException
	{
		File  file=new File("C:\\Users\\Dell\\eclipse-workspace\\selenium_webdriver\\src\\SearchData2.xlsx");
		FileInputStream fin=new FileInputStream(file);
		
		//@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(fin);
		XSSFSheet sheet=wb.getSheet("Search");
		
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
		
	}

}

