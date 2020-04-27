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

public class PurchaseForeignCurrencyScenario2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Naveen\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try
		{
			driver.manage().window().maximize();
			driver.get("http://zero.webappsecurity.com/");
			WebElement signin=driver.findElement(By.id("signin_button"));
			signin.click();
			driver.findElement(By.id("user_login")).sendKeys("username");
			driver.findElement(By.id("user_password")).sendKeys("password");
			driver.findElement(By.name("submit")).click();
			driver.findElement(By.xpath("//a[text()='Pay Bills']")).click();
			driver.findElement(By.xpath("//a[starts-with(text(),'Purchase')]")).click();
			
			WebDriverWait wait = new WebDriverWait(driver,10,2);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("purchase_cash"))).click();
			
			BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		    ImageIO.write(image, "png", new File("d:\\bla.png"));
		    
			Alert alert = driver.switchTo().alert();
			String alerttext=alert.getText();
			verify("Please, ensure that you have filled all the required fields with valid values.",alerttext);
			alert.accept();
			
			//Take Screenshot with getScreenshotAs method
			TakesScreenshot scrShot=((TakesScreenshot)driver);
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
            File DestFile=new File("D:\\screenshotjava.png");
            FileUtils.copyFile(SrcFile, DestFile);
            
			
            
		}
		catch(Exception err)
		{
			System.out.println(err);
		}
		finally
		{
			//driver.quit();
		}
	}
	static void verify(String expected, String actual)
	{
		if(expected.equals(actual)==false)
		{
			System.out.print("Verification Failed, Expected: "+expected+", Actual: "+actual);
		}
	}
}
