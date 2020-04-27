package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountSummaryLinkScenario 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\PALLU-QA-SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://zero.webappsecurity.com/");
		
		WebElement signin=driver.findElement(By.id("signin_button"));
		signin.click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.linkText("Brokerage")).click();
		//System.out.println(driver.getTitle()); //title of tab/page is "Zero - Account Activity"
		assert_("Zero - Account Activity",driver.getTitle()); //calling assert method to check for correct tab/page & throw error
		
		WebDriverWait wait=new WebDriverWait(driver,5);
		WebElement accountele=wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("aa_accountId"))));// for dropdown box
		Select account=new Select(accountele);
		assert_("Brokerage",account.getFirstSelectedOption().getText()); //calling assert method to check whether 
		//its displaying selected link(brokerage) in the dropdown menu or not
		

	}//end main
	
	static void assert_(String expected,String actual)
	{
		if(expected.equals(actual)==false)
		{
			throw(new AssertionError("Assertion Failed, Expected: "+expected+", Actual: "+actual));
		}
	}

}
