package examples;

import org.openqa.selenium.By;    
import org.openqa.selenium.WebDriver;    
import org.openqa.selenium.chrome.ChromeDriver;   
 

public class NavigationCommands 
{
	 public static void main(String[] args)
	 {    
		 System.setProperty("webdriver.chrome.driver","D:\\PALLU-QA-SOFTWARE\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver(); //creating instance of chrome driver class
			
			driver.manage().window().maximize();
			
			 // Launch Website    
            driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");     
  
            //Click on the Link Text using click() command    
           // driver.findElement(By.linkText("This is a Link")).click();  
             driver.findElement(By.xpath("//a[text='This is a link']")).click();
  
            //Go back to Home Page  
            driver.navigate().back();   
  
            //Go forward to Registration page  
            driver.navigate().forward();  
  
            // Go back to Home page  
            driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");  
  
            //Refresh browser  
            driver.navigate().refresh();  
        
            //Closing browser  
           // driver.close();   
		 
	 }
	
}
