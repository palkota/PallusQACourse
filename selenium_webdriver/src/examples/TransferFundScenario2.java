package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//THIS PROGRAM IS TO REPLICATE THE TRANSFERFUNDSCENARIO FOR OTHER SELECTIONS OF FROMACCOUNT
// & TOACCOUNT DROPDOWN MENU ITEMS

public class TransferFundScenario2
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\PALLU-QA-SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://zero.webappsecurity.com");
		
		//driver.close();
		//driver.quit();
		
		WebElement signin =driver.findElement(By.id("signin_button"));
		signin.click();
		
		driver.findElement(By.id("user_login")).sendKeys("username");
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
		
		//to find transfer funds tab in the account summary page and clicking it
		
		driver.findElement(By.xpath("//a[text()='Transfer Funds']")).click();
		//driver.findElement(By.xpath("//*[@id=\"transfer_funds_tab\"]/a")).click();
		 
		
		//FOR REPEATING TRANSFER FUND SCENARIO FOR DIFFERENT SELECTIONS IN
		//DROPDOWN MENUS OF FROMACCOUNT DROPBOX AND TOACCOUNT DROPBOX
		for(int i=0;i<=5;i++)
		{
			WebElement fromaccountele=driver.findElement(By.cssSelector("#tf_fromAccountId"));
			//passing this from account element to object of select class 
			Select fromaccountselect=new Select(fromaccountele);
			//fromaccountselect.selectByVisibleText("Credit Card(Avail. balance = $ -265)");
			fromaccountselect.selectByIndex(i);
		
		
		  WebElement toaccountele=driver.findElement(By.cssSelector("#tf_toAccountId"));
		  Select toaccountselect=new Select(toaccountele);
		  //toaccountselect.selectByVisibleText("Savings(Avail. balance = $ 1548)");
		  int j=i+1;
		  toaccountselect.selectByIndex(j);
		
		
		  driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("500");
		  //driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("1000");
		  driver.findElement(By.id("tf_description")).sendKeys("Loan Payment");
		  driver.findElement(By.id("btn_submit")).click();
		  
				
		//after above code we get verification page. in this page all fields must be disabled
		//for the user. if any field is enabled the system should throw an error
		
		TransferFundScenario obj=new TransferFundScenario(); //creating object for the class
		
		obj.verifyBool(false,driver.findElement(By.cssSelector("#tf_fromAccountId")).isEnabled());
		obj.verifyBool(false,driver.findElement(By.cssSelector("#tf_toAccountId")).isEnabled());

		driver.findElement(By.cssSelector("#btn_submit")).click(); //after verifying the verification page,clicking submit button
		
		//in the page we verify the success message
		String text=driver.findElement(By.xpath("//*[@id=\"transfer_funds_content\"]/div/div/div[1]")).getText();

		obj.verifyText("You successfully submitted your transaction.", text);
		
		//code add by pallu
		driver.findElement(By.xpath("//a[text()='Transfer Funds']")).click();
		
		}//end for loop
		
		
	}// end main
	
	void verifyBool(boolean expected,boolean actual)
	{
		if(expected!= actual)
		{
			System.err.println("Value Mismatch error(Bool): expected-"+expected+"\tactual-"+actual);
		}
	}
	
	void verifyText(String expected, String actual)
	{
		if(expected.equals(actual)==false)
		{
			System.err.println("Value Mismatch error(Text): expected-"+expected+"\tactual-"+actual);
		}
	}

}
