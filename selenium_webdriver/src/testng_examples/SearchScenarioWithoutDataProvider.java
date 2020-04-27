package testng_examples;

//USING SEARCH FIELD IN HOME PAGE TO SEARCH FOR "ACCOUNT" AND "MAP" KEYWORDS
// REFER CODE IN SearchScenario.java file to copy-paste

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class SearchScenarioWithoutDataProvider 
{
	static WebDriver driver;
	
  @Test
  public void test_Account()
  {
	  driver.findElement(By.id("searchTerm")).clear();
	  driver.findElement(By.id("searchTerm")).sendKeys("Account");
	  driver.findElement(By.id("searchTerm")).sendKeys(Keys.ENTER);
	  List<WebElement> elements=driver.findElements(By.xpath("//a[starts-with(text(),'Zero -')]"));
	  Assert.assertEquals(2,elements.size());
		
		for(WebElement element:elements)
		{
			Assert.assertEquals(true, element.getText().contains("Account"));
		}
	}//end @Test
  
  @Test
  public void test_Map()
  {
	  driver.findElement(By.id("searchTerm")).clear();
	  driver.findElement(By.id("searchTerm")).sendKeys("Map");
	  driver.findElement(By.id("searchTerm")).sendKeys(Keys.ENTER);
	  List<WebElement> elements=driver.findElements(By.xpath("//a[starts-with(text(),'Zero -')]"));
	  Assert.assertEquals(1,elements.size());
		
		for(WebElement element:elements)
		{
			Assert.assertEquals(true, element.getText().contains("Map"));
		}
	}//end @Test
  
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
