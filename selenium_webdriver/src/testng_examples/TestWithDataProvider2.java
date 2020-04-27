package testng_examples;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TestWithDataProvider2 
{
  @Test(dataProvider = "dp")
  public void f(String st,Integer c)
  {
	System.out.println(st+" "+c);  
  }

  @DataProvider
  public Object[][] dp()
  {
    return new Object[][] {
      new Object[] {"Account",2 },
      new Object[] {"Map",1},
    };
  }
}
