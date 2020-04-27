package testng_examples;

import org.testng.annotations.Test;
import org.testng.Assert;

public class TestWithoutDataProvider 
{
	
  @Test
  public void f() 
  {
	  int actual[]=new int[] {34,56,12,46};
	  
	  for(int i=0;i<actual.length;i++)
	  {
		  System.out.println(actual[i]);
		  Assert.assertTrue(actual[i]<50);
	  
	  }//end for
  }//end method
  
}
