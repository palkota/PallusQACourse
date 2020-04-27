package methodOverloading;

//If a class has multiple methods having same name but different in parameters, 
//it is known as Method Overloading. 

//METHOD OVERLOADING: BY CHANGING DATA TYPE OF ARGUMENTS

class Adder2
{  
	//we are creating static methods so that we don't need to create instance
	//for calling methods.
	
	static int add(int a, int b)
	{
		return a+b;
	}  
	static double add(double a, double b)
	{
		return a+b;
	}  
}  

class TestOverloading2 
{
	public static void main(String[] args)
	{  
		System.out.println(Adder2.add(11,11));  
		System.out.println(Adder2.add(12.3,12.6));  
	}
	 
	
}
