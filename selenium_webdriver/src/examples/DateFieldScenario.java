package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DateFieldScenario 
{
	//EXAMPLE TO WORK WITH DATE FIELD SCENARIO (WORKING PROGRAM)
	// UNDER ACCOUNT ACTIVITY TAB >> FIND TRANSACTIONS TAB
	
	static WebDriver driver;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\PALLU-QA-SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://zero.webappsecurity.com");
		
		WebElement signin =driver.findElement(By.id("signin_button"));
		signin.click();
		
		driver.findElement(By.id("user_login")).sendKeys("username");
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.linkText("Account Activity")).click();
		driver.findElement(By.partialLinkText("Find")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("aa_fromDate"))).click();
		selectDate("2012-September-1"); //calling method for "From DatePicker field"
		driver.findElement(By.id("aa_toDate")).click();
		selectDate("2012-September-5"); //calling method for  "To DatePicker field
		
	} //end main
	
	static void selectDate(String date)
	{
	  goToYear(Integer.parseInt(date.split("-")[0]));  //calling method for year part
	  
	  goToMonth(date.split("-")[1]); //calling method for month part
	  
	  goToDate(date.split("-")[2]); //calling method for year part
	  
	 }
	
	static void goToYear( int year)
	{
		 
		 while(true)
		 {
			 int year_=Integer.parseInt(driver.findElement(By.className("ui-datepicker-year")).getText());
			 System.out.println(year+ " "+ year_);
			 
			 if(year<year_)
			 {
				 driver.findElement(By.xpath("//span[text()='Prev']")).click(); 
				 
			 }
			 
			 else if(year>year_)
			 {
				 
				 driver.findElement(By.xpath("//span[text()='Next']")).click();
			 }
			 
			 else
			 {
				 break;
			 }
			 
		 }//end while
		 
	}//end goToYear method
	
	static void goToMonth(String month)
	{
		while(true)
		{
			String month_=driver.findElement(By.className("ui-datepicker-month")).getText();
			
			if(month.equals(month_))
			{ 
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			}
			
		}//end while
		
	} //end go ToMonth method
	
	static void goToDate(String date)
	{
		driver.findElement(By.xpath("//a[text()="+date+"]")).click();
		
	}
	
	
		
}//end class
	


