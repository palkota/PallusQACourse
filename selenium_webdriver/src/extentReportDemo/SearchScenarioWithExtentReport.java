package extentReportDemo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

//import testng_examples.ReadExcelData;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class SearchScenarioWithExtentReport {
	
	public ExtentReports report;
	public ExtentHtmlReporter htmlReporter;
	public ExtentTest test;

	@BeforeTest
	public void beforeTest() {
		//Configure the location to save the report
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/TestReport.html");
		//Provide report properties like title, report name and theme
		htmlReporter.config().setDocumentTitle("Test Report"); 
		htmlReporter.config().setReportName("Zero Bank- Search Scenraio Test"); 
		htmlReporter.config().setTheme(Theme.STANDARD);	
		// Create an object of Extent Reports
		report = new ExtentReports();
		//Attach the ExtentHtmlReporter object to ExtentReports class and provide dashboard details
		report.attachReporter(htmlReporter);
		//report.setSystemInfo("User Name", "Naveen S");
		report.setSystemInfo("User Name", "Pallavi");
        report.setSystemInfo("Environment", "Production");
		report.setSystemInfo("OS", "Windows 10");	
	}
	
	static WebDriver driver;
  @Test(dataProvider="dp")
  public void test_01(String st, String c) {
	  	test = report.createTest("Search with search term: "+st);
	  	driver.findElement(By.id("searchTerm")).clear();
	  	driver.findElement(By.id("searchTerm")).sendKeys(st);
		driver.findElement(By.id("searchTerm")).sendKeys(Keys.ENTER);
		test.log(Status.PASS, "Successfully navigated to search result page");
		List<WebElement> elements = driver.findElements(By.xpath("//a[starts-with(text(),'Zero -')]"));
		Assert.assertEquals(Integer.parseInt(c), elements.size());
		for(WebElement element:elements)
		{
			Assert.assertEquals(true, element.getText().contains(st));
		}
  }
  
  @DataProvider
  public Object[][] dp() throws IOException
  {
	  ReadExcelData2 obj=new ReadExcelData2();

	  return obj.getdata();
  }
  
	public static String takeScreenShot(WebDriver driver, String screenshotName) throws IOException {
		//Capture the screenshot and return the path of the screenshot.
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\test-output\\Screenshots\\" + screenshotName + dateName + ".png";
		//String destination = System.getProperty("user.dir") + "/test-output/Screenshots/" + screenshotName + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}
	
  @AfterMethod
  public void afterMethod(ITestResult result) throws IOException
  {
	  if(result.getStatus() == ITestResult.FAILURE){
			//MarkupHelper is used to display the output in different colors
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
			//To capture screenshot path and store the path of the screenshot in the string "screenshotpath"
			//Calling takeScreenShot method to take screenshot
			String screenshotpath = takeScreenShot(driver, result.getName());
			//Add it in report using fail method and add screenshot using addScreenCaptureFromPath method
			test.addScreenCaptureFromPath(screenshotpath);
		}
		else if(result.getStatus() == ITestResult.SKIP){
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE)); 
		} 
		else if(result.getStatus() == ITestResult.SUCCESS)
		{
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
		}
	  //driver.navigate().back();
  }
  
  @BeforeClass
  public void beforeClass() {
	  	System.setProperty("webdriver.chrome.driver","D:\\PALLU-QA-SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://zero.webappsecurity.com/");
		
  }

  @AfterClass
  public void afterClass() {
	  //driver.quit();
  }

	@AfterTest
	public void endReport() {
		report.flush();
	}
}

