package testng_examples;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;


public class AddNewPayeeScenarioWithDataProvider 
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
	  }
	
	 
	 @BeforeMethod
	  public void beforeMethod()
	  {
		 driver.findElement(By.xpath("//a[text()='Add New Payee']")).click();
			
	  }
	
  @Test(dataProvider = "dp")
  public void test1(String pname,String paddrs,String pacc,String pdetails)
  {
	  WebDriverWait wait=new WebDriverWait(driver,3);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("np_new_payee_name"))).sendKeys(pname);
	  driver.findElement(By.id("np_new_payee_address")).sendKeys(paddrs);
	  driver.findElement(By.id("np_new_payee_account")).sendKeys(pacc);
	  driver.findElement(By.id("np_new_payee_details")).sendKeys(pdetails);
	  driver.findElement(By.id("add_new_payee")).click();
	  
	  String confirmationmsg= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("alert_content"))).getText();
	  Assert.assertTrue(confirmationmsg.contains(pname),"Validating confirmation msessage");
	  //Assert.assertEquals(confirmationmsg, "The new payee sdfjg was successfully created.", "Validating confirmation msessage");
  
	  WebElement payeeele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sp_payee")));
	  Select payee=new Select(payeeele);
	  List<WebElement> options=payee.getOptions();
	  
	  List<String> optionstext=new ArrayList<String>();
	  for(WebElement option:options)
	  {
		  optionstext.add(option.getText());
	  }

		Assert.assertTrue(optionstext.contains(pname),"Payee Name not found");
	  
  }


  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() throws IOException
  {
    return new Object[][] {
     // new Object[] {"Gnaneswari","Bangalore","56464894564","mummy"  },
     // new Object[] { "Anjaneyulu","JPNagar","89789458","daddy" },
    	new Object[] {"Prem Kumar","Bangalore","234845646","Brother"},
    	new Object[] {"Somi","Mangalore","89789458","Friend"},
    };
  }
  
  

  @AfterClass
  public void afterClass() 
  {
  }

}
