package examples;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.remote.DesiredCapabilities;  
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait; 

public class BasicCommandsExample
{
	 public static void main(String[] args)
	 {  
		 System.setProperty("webdriver.chrome.driver","D:\\PALLU-QA-SOFTWARE\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			// Launch Website  
		     driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");  
		     
		     //driver.wait(5000);
		    // WebDriverWait wait=new WebDriverWait(driver,5000);
		      
		        // Fetch the text "This is sample text." and print it on console  
		        // Use the class name of the div to locate it and then fetch text using getText() method  
		     String sampleText = driver.findElement(By.className("col-md-12")).getText();  
		     System.out.println(sampleText);  
		          
		          // Use the linkText locator method to find the link and perform click using click() method  
		     driver.findElement(By.linkText("This is a link")).click();  
		       
		          // Click on the textbox and send value  
		     driver.findElement(By.id("fname")).sendKeys("JavaTpoint");  
		       
		        // Clear the text written in the textbox  
		     driver.findElement(By.id("fname")).clear();  
		          
		        // Click on the Submit button using click() command  
		     driver.findElement(By.id("idOfButton")).click();  
		   
		        // Locate the radio button by id and check it using click() function  
		     driver.findElement(By.id("male")).click();  
		          
		        // Locate the checkbox by cssSelector and check it using click() function  
		     driver.findElement(By.cssSelector("input.Automation")).click();  
		              
		        // Use Select class for selecting value from dropdown  
		    Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));  
		    dropdown.selectByVisibleText("Automation Testing");  
		       
		        // Close the Browser  
		           //  driver.close();  
		      
		    }  
	 
	 }


