package examples;

import java.awt.Rectangle;

import java.awt.Robot;

import java.awt.Toolkit;

import java.awt.image.BufferedImage;

import java.io.File;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;

//FOR THIS ALERT BOX AND SCREEN CAPTURE WE NEED TO DOWNLOAD SOME LIBRARIES AND ADD IT TO OUR PROJECT
//UNDER REFERENCED LIBRARIES. OTHERWISE PROGRAM SHOWS ERRORS.


public class AlertBoxAndScreenCapture 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\PALLU-QA-SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	 try
	 {
		driver.get("http://zero.webappsecurity.com");
		WebElement signin1=driver.findElement(By.id("signin_button"));

		signin1.click();

		driver.findElement(By.id("user_login")).sendKeys("username");

		driver.findElement(By.id("user_password")).sendKeys("password");

		driver.findElement(By.name("submit")).click();

		

		driver.findElement(By.xpath("//a[text()='Pay Bills']")).click();

		driver.findElement(By.xpath("//a[text()='Purchase Foreign Currency']")).click();

		
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		WebDriverWait wait=new WebDriverWait(driver, 3);

		WebElement calculate_button=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pc_calculate_costs")));
		calculate_button.click();
		
		//we DONT enter any values in purchase foreign currency page & just click calculate button.
		//then application throws an alert box
		
		Alert alertbox=driver.switchTo().alert();
		String alertmessage=alertbox.getText();
		Thread.sleep(3000);
		//calling verifyText method
		verifyText("Please, ensure that you have filled all the required fields with valid values.",alertmessage);
		alertbox.accept();
		
		//Take Screenshot with Robot class

		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

		 ImageIO.write(image, "png", new File("d:\\bla.png"));

		// alertbox.accept();

		/* //Take Screenshot with getScreenshotAs method

		TakesScreenshot scrShot=((TakesScreenshot)driver);

		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        File DestFile=new File("D:\\screenshotjava.png");

        FileUtils.copyFile(SrcFile, DestFile);
        
        */
		

	 }//end try
	 
	 catch(Exception e)

		{
		 System.out.println(e);
		}

		//driver.quit();
	 
	 
	 
	} //end main
	
	private static void verifyText(String expectedmessage, String actualmessage) 
	{

		if(expectedmessage.equals(actualmessage)==false) 
		{

			System.err.println("Message is wrong");

		}
	}// end method
	
	

}
