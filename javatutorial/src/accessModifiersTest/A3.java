package accessModifiersTest;

//EXAMPLE OF PUBLIC ACCESS MODIFIER. OTHER CLASS FILE IS B3.JAVA
//the class and the member method in this class are declared as public.
//so the method can be easily accessible from other class that belongs to other package also.
//no need to inherit this class also.

public class A3 
{
	public void msg()
	{
		System.out.println("Hello from other class of other package");
	}
	
}
