package accessModifiers;

import accessModifiersTest.*;

//EXAMPLE OF PUBLIC ACCESS MODIFIER

class B3 
{
	public static void main(String args[])
	{  
		   A3 obj = new A3();  
		   obj.msg();  // method of public class from other package is accessible 
		   				// from this package class, even without using inheritance
	}  
	
}
