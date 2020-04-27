package abstractClass;

//Rule: If you are extending an abstract class that has an abstract method,
//you must either provide the implementation of the method or make this class abstract.

//The abstract class can also be used to provide some implementation of the interface.
//In such case, the end user may not be forced to override all the methods of the interface.

interface A
{  
void a();  
void b();  
void c();  
void d();  
}  
  
abstract class B implements A
{  
	//this class is declared abstract because its implementing only 1 method of interface, not implementing
	// the other 3 methods of the interface
	
	public void c() 
	{
		System.out.println("I am c");
	}  
}  
  
class M extends B
{  
	public void a(){System.out.println("I am a");}  
	public void b(){System.out.println("I am b");}  
	public void d(){System.out.println("I am d");}  
}  
  
class Test5
{  
	public static void main(String args[])
	{  
		A a=new M();  
		a.a();  
		a.b();  
		a.c();  
		a.d();  
	}
}  
