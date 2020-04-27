package different_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;  


public class FirefoxBrowser
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","D:\\PALLU-QA-SOFTWARE\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		/*
		 // Initialize Gecko Driver using Desired Capabilities Class  
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
		capabilities.setCapability("marionette",true);  
		WebDriver driver= new FirefoxDriver(capabilities); 
		*/
		
		driver.manage().window().maximize();
		
		driver.get("http://zero.webappsecurity.com");
		
		
	}

}
