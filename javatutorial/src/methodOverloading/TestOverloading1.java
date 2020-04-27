package methodOverloading;

// If a class has multiple methods having same name but different in parameters, 
//it is known as Method Overloading. 

//METHOD OVERLOADING: BY CHANGING NUMBER OF INPUT PARAMETERS

class Adder
{  
	//we are creating static methods so that we don't need to create instance
	//for calling methods.
	
	static int add(int a,int b)
	{
		return a+b;
	}  
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}  
}  

public class TestOverloading1
{
	public static void main(String[] args)
	{  
		System.out.println(Adder.add(11,11));  
		System.out.println(Adder.add(11,11,11));  
	}
}  
	

