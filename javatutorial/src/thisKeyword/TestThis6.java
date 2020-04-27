package thisKeyword;

// EXAMPLE OF THIS KEYWORD-Calling parameterized constructor from default constructor:

class A
{  
	A() //default constructor of class A
	{  
		this(5);  //calls parameterized constructor of this class
		System.out.println("hello a");  
	}  
	
	A(int x) //parameterized constructor of class A
	{  
		System.out.println(x);  
	}  
	
}  //class A ends

public class TestThis6
{
	public static void main(String args[])
	{  
		A a=new A(); //calling default constructor of class A
	}  
}
