package different_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\PALLU-QA-SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://zero.webappsecurity.com");
		
	}

}
