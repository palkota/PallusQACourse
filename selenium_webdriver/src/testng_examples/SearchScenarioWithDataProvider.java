package testng_examples;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class SearchScenarioWithDataProvider 
{
	static WebDriver driver;
	
	//the same below test runs once for input search "Account"and second time it runs for input search Map"
	
  @Test(dataProvider="dp")
  public void test_01(String st,int c)
  {
	  driver.findElement(By.id("searchTerm")).clear();
	  driver.findElement(By.id("searchTerm")).sendKeys(st);
	  driver.findElement(By.id("searchTerm")).sendKeys(Keys.ENTER);
	  List<WebElement> elements=driver.findElements(By.xpath("//a[starts-with(text(),'Zero -')]"));
	  Assert.assertEquals(c,elements.size());
		
		for(WebElement element:elements)
		{
			Assert.assertEquals(true, element.getText().contains(st));
		}
	}//end @Test
  
  @DataProvider
 public Object[][] dp()
 {
	  return new Object[][] {
			  new Object[] {"Account",2},
			  new Object[] {"Map",1}
	  };

 }
  
  @AfterMethod
  public void afterMethod()
  {
	  driver.navigate().back();
  }
  
  @BeforeClass
  public void beforeClass()
  {
	  System.setProperty("webdriver.chrome.driver","D:\\PALLU-QA-SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://zero.webappsecurity.com");
		
  }

  @AfterClass
  public void afterClass()
  {
	 // driver.quit();
  }

}

  
  

