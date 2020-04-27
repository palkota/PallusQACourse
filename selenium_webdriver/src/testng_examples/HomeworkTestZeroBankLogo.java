package testng_examples;

//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class HomeworkTestZeroBankLogo 
{
	WebDriver driver;
	
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("webdriver.chrome.driver","D:\\PALLU-QA-SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://zero.webappsecurity.com/");
		driver.findElement(By.id("signin_button")).click();

		driver.findElement(By.id("user_login")).sendKeys("username");
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
		
				
  }
  
  @Test
  public void f() 
  {
	  Assert.assertEquals(driver.getTitle(),"Zero - Account Summary");
		
		//clicking on zero bank logo in account summary page
		driver.findElement(By.xpath("//a[text()='Zero Bank']")).click(); 
		
		//clicking on "Online Banking" tab on Home page
		driver.findElement(By.xpath("//*[@id='onlineBankingMenu']")).click();
		
		//clicking on Transfer Funds" link in Online Banking page
		driver.findElement(By.xpath("//*[@id='transfer_funds_link']")).click();
		
		Assert.assertEquals(driver.getTitle(),"Zero - Transfer Funds");
		
	  
  }

  @AfterMethod
  public void afterMethod()
  {
  }

}
