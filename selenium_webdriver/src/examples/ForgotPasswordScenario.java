package examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ForgotPasswordScenario 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\PALLU-QA-SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://zero.webappsecurity.com");
		
		WebElement signin1=driver.findElement(By.id("signin_button"));
		signin1.click();
		
		driver.findElement(By.xpath("//a[text()='Forgot your password ?']")).click();
		
		String title=driver.getTitle();
		verifyText("Zero - Forgotten Password",title);//verifying whether going to right page
		
		driver.findElement(By.id("user_email")).sendKeys("palkota@gmail.com");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		String user_display=driver.findElement(By.xpath("//div[@class='offset3 span6']")).getText();
		//String user_display=driver.findElement(By.cssSelector("offset3 span6")).getText();
		System.out.println(user_display);

	}
	private static void verifyText(String expectedmessage, String actualmessage) 
	{

		if(actualmessage.contains(expectedmessage)==false) 
		{

			System.err.println("Application going to wrong page on Fogor Password click");

		}
	}// end method


}
