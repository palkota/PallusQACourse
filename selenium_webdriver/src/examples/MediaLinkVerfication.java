package examples;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;


public class MediaLinkVerfication
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\PALLU-QA-SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://zero.webappsecurity.com");
		
		String parentwindow=driver.getWindowHandle();
		//System.out.println(parentwindow);
		driver.findElement(By.xpath("(//a[contains(text(),'http')])[1]")).click();
		
		Set<String> handles=driver.getWindowHandles();
		//System.out.println(handles);
		System.out.println(driver.getTitle()); // this is giving only parent window title
		
		for(String handle:handles)
		{
			driver.switchTo().window(handle); 
			System.out.println(driver.getTitle());// after above line of
			//switching window handle only it is showing second window title
			
			if (driver.getTitle().equals("Legal Information | Micro Focus"))
			{ 
				break ;
			}
			
		}//end for
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement freetrial=driver.findElement(By.xpath("(//a[contains(text(),'Free Trials')])[2]"));
		//js.executeScript("arguments[0].scrollIntoView();", freetrial);
		freetrial.click();  
		driver.close();
		driver.switchTo().window(parentwindow); 
		driver.findElement(By.id("signin_button")).click();
		
		
		} 

	}


