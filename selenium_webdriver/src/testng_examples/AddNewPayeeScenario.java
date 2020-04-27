package testng_examples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

//import java.util.ArrayList;
//import java.util.List;

//import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddNewPayeeScenario 
{
	 WebDriver driver;
	
	 @BeforeClass
	  public void beforeClass()
	  {
		 System.setProperty("webdriver.chrome.driver","D:\\PALLU-QA-SOFTWARE\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("http://zero.webappsecurity.com/");
			driver.findElement(By.id("signin_button")).click();

			driver.findElement(By.id("user_login")).sendKeys("username");
			driver.findElement(By.id("user_password")).sendKeys("password");
			driver.findElement(By.name("submit")).click();
			
			driver.findElement(By.xpath("//a[text()='Pay Bills']")).click();
			driver.findElement(By.xpath("//a[text()='Add New Payee']")).click();
			
	  }
	
	  @BeforeMethod
	  public void beforeMethod() 
	  {
	  }
	 
  @Test
  public void test1() 
  {
	  //ADD NEW PAYEE TAB INFO
	  WebDriverWait wait=new WebDriverWait(driver,3);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("np_new_payee_name"))).sendKeys("Gnaneswari");
	  driver.findElement(By.id("np_new_payee_address")).sendKeys("Bangalore");
	  driver.findElement(By.id("np_new_payee_account")).sendKeys("56464894564");
	  driver.findElement(By.id("np_new_payee_details")).sendKeys("mummy");
	  driver.findElement(By.id("add_new_payee")).click();
	  
	  String confirmationmsg= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("alert_content"))).getText();
	  Assert.assertTrue(confirmationmsg.contains("Gnaneswari"),"Validating confirmation msessage");
	  //Assert.assertEquals(confirmationmsg, "The new payee sdfjg was successfully created.", "Validating confirmation msessage");
	  
  }
 
  @AfterMethod
  public void afterMethod()
  {
  }

  @AfterClass
  public void afterClass()
  {
  }

  @BeforeTest
  public void beforeTest()
  {
  }

  @AfterTest
  public void afterTest() 
  {
  }

}
