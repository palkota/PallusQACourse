package accessModifiersTest;

//EXAMPLE FOR PROTECTED ACCESS MODIFIER.
//The A2 class of this package is public, so can be accessed from outside the package. 
//But msg method of this package is declared as protected, 
//so it CAN be accessed from outside the class only through inheritance.

public class A2 
{
	protected void msg()
	{
		System.out.println("Hello");
	}
}
