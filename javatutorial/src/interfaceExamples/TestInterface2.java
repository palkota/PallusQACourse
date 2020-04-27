package interfaceExamples;

//example of java interface which provides the implementation of Bank interface.

interface Bank
{  
	float rateOfInterest();  
}  
class SBI implements Bank
{  
	public float rateOfInterest()
	{
		return 9.15f;
	}  
}  
class PNB implements Bank
{  
	public float rateOfInterest()
	{
		return 9.7f;
	}  
}  

public class TestInterface2
{
	public static void main(String[] args)
	{  
		Bank b=new SBI();  // syntax for connecting interface object to any particular class
		System.out.println("Rate of Interest : "+b.rateOfInterest());  
	}
	
}
