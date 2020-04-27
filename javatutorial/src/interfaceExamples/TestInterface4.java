package interfaceExamples;

// ONE INTERFACE EXTENDING ANOTHER INTERFACE

interface Printable4
{  
	void print4();  
} 

interface Showable4 extends Printable4
{  
	void show4();  
}  

public class TestInterface4 implements Showable4
{
	public void print4() //implementation of interface method by class
	{
		System.out.println("Hello");
	}  
	public void show4()  //implementation of interface method by class
	{
		System.out.println("Welcome");
	}  
	
	public static void main(String args[])
	{  
		TestInterface4 obj = new TestInterface4();  
		obj.print4();  
		obj.show4(); 
		
	 }  
	
}
