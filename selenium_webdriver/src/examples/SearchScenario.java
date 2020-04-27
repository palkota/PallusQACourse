package examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchScenario
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\PALLU-QA-SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://zero.webappsecurity.com/");
		
		driver.findElement(By.id("searchTerm")).sendKeys("Account");
		driver.findElement(By.id("searchTerm")).sendKeys(Keys.ENTER);
		
		List<WebElement> elements=driver.findElements(By.xpath("//a[starts-with(text(),'Zero -')]"));
		
		verify(2,elements.size());// calling method to verify no.of search appearances
		
		for(WebElement element:elements)
		{
			verify(true,element.getText().contains("Account")); //calling method to verify if search appearances 
			//contain the word searched for
		}

	} //end main
	
	static void verify(int expected, int actual)
	{
		if(expected!=actual)
		{
			System.out.print("Verification Failed, Expected: "+expected+", Actual: "+actual);
		}
	}
	static void verify(boolean expected, boolean actual)
	{
		if(expected!=actual)
		{
			System.out.print("Verification Failed, Expected: "+expected+", Actual: "+actual);
		}
	}
	

}
