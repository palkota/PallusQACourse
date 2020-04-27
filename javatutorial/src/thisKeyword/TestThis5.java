package thisKeyword;

//EXAMPLE OF THIS KEYWORD-CALLING CURRENT CLASS CONSTRUCTOR
//Calling default constructor from parameterized constructor:

class A5
{  
	A5() //default constructor of this class
	{
		System.out.println("hello a");
	} 
	
	A5(int x) //parameterized constructor
	{  
		this(); // means calling the default constructor of this class 
		System.out.println(x);  
	}  
	
}  

public class TestThis5 
{
	public static void main(String args[])
	{  
		A5 a=new A5(10);  // invoking the parameterized constructor
	}
	
}
