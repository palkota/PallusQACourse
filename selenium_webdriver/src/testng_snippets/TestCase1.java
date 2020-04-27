package testng_snippets;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase1 
{
  @Parameters({"searchterm","count"})
  @Test
  //public void test1(String searchterm,String count)
  public void test1(String searchterm,String count)
  {
	 System.out.println("-Test1") ;
	 System.out.println(searchterm) ;
	 System.out.println(count) ;
	 
  }
  
  @Test
  public void test2()
  {
	 System.out.println("test2") ;
  }
 
  @Test
  public void sample()
  {
	 System.out.println("Sample") ;
  }
  
}
