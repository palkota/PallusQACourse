package testng_examples;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class TestWithDataProvider
{
  @Test(dataProvider = "dp")
  public void f(Integer i)
  {
	  System.out.println(i);
	  Assert.assertTrue(i<50);
  }

  @DataProvider
  public Object[] dp()
  {
    return new Object[]{34,56,12,46};
    
  }
  
}
