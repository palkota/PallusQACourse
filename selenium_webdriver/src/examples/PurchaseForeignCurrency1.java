package examples;

import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

//import bsh.Console;

//TESTING PAY BILLS TAB > PURCHASE FOREIGN CURRENCY SCENARIO

public class PurchaseForeignCurrency1 {



	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\PALLU-QA-SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

	try {

			driver.manage().window().maximize();

			driver.navigate().to("http://zero.webappsecurity.com/");

			WebElement signin1=driver.findElement(By.id("signin_button"));

			signin1.click();

			

			driver.findElement(By.id("user_login")).sendKeys("username");

			driver.findElement(By.id("user_password")).sendKeys("password");

			driver.findElement(By.name("submit")).click();

		for(int i=2;i<=12;i++)	
	    {	

			driver.findElement(By.xpath("//a[text()='Pay Bills']")).click();

			driver.findElement(By.xpath("//a[text()='Purchase Foreign Currency']")).click();

		//FOR DIFFERENT TYPES OF WAIT & USAGES REFER TO notepad notes-"waitfunction-notes"
			
		 
			WebDriverWait wait=new WebDriverWait(driver, 5);

			WebElement currele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pc_currency")));

			

			Select currency=new Select(currele); //invoking parameterized constructor of select class

			//currency.selectByVisibleText("Denmark (krone)");
			currency.selectByIndex(i);

			

			String text=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sp_sell_rate"))).getText();

			

			double sellrate=Double.parseDouble(text.split(" ")[4]);

			double amount=100;

			double expected=sellrate*amount;
			
			DecimalFormat df = new DecimalFormat("####.##");
			expected=Double.parseDouble(df.format(expected));
			

			driver.findElement(By.id("pc_amount")).sendKeys(""+amount);

			WebElement selected_currency_checkbox=driver.findElement(By.id("pc_inDollars_false"));

			if(selected_currency_checkbox.isSelected()==false)

			{

				selected_currency_checkbox.click();

			}

			driver.findElement(By.id("pc_calculate_costs")).click();

			text=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pc_conversion_amount"))).getText();

			

			double converted_amount=Double.parseDouble(text.split(" ")[4]);

			verifyDouble(expected,converted_amount,"Incorrect converted amount"); //calling verify double method
			
	    	}//end for loop

		} //end try block

		catch(Exception e)

		{

			System.out.println(e);

		}

		finally

		{

			//driver.quit();

		}
		
	  

	}//end main

	
	public static void verifyDouble(double expected,double actual,String message)

	{

		if(expected!=actual)

		{

			System.out.println(message+"\nVerfication Error- Expected: "+expected+" Actual: "+actual);

		}

	}



}
