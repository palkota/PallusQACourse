package different_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class IEBrowser
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.ie.driver","D:\\PALLU-QA-SOFTWARE\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		
		//System.setProperty("webdriver.ie.driver","C:\\Users\\Dell\\Downloads\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://zero.webappsecurity.com");
		
	}

}
