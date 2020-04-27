package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoneyMapChart 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\PALLU-QA-SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://zero.webappsecurity.com");
		
		WebElement signin =driver.findElement(By.id("signin_button"));
		signin.click();
		
		driver.findElement(By.id("user_login")).sendKeys("username");
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.xpath("//a[text()='My Money Map']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,5);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Insurance'])[3]"))).click();
		
		WebElement insuranceele=driver.findElement(By.xpath("(//*[text()='Insurance'])[2]"));
		
		//when "insurance" text in 3rd section is clicked, then insurance section in the chart should disappear
		//or not be displayed. when clicked again,it has to be displayed. here we are checking for first click
		
		verify(false,insuranceele.isDisplayed()); // it is not seen after first click. so isDisplayed() returns false
		//so both expected & actual are same and method does not display error message.
		
		
	}//end main
	
	static void verify(boolean expected,boolean actual)
	{
		if (expected!=actual)
		{
			System.out.println("verification failed");
		}
	}

}
