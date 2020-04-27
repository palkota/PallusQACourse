package methods;

//EXAMPLE OF A METHOD/FUNCTION WITH NO PARAMETERS AND NO RETURN TYPE

public class NonParaFunc 
{
	void display()

	{
		System.out.println("Hello World"); 
	}

	public static void main(String[] args) 
	{
		NonParaFunc obj=new NonParaFunc(); //creating class object

		obj.display(); //calling the non-para function in main
		
	}

}
