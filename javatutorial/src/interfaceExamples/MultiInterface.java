package interfaceExamples;

// If a class implements multiple interfaces,
//or an interface extends multiple interfaces, it is known as multiple inheritance.

interface Printable2
{  
	void print2();  
}  

interface Showable
{  
	void show();  
}  

public class MultiInterface implements Printable2,Showable 
{
	public void print2()
	{
		System.out.println("Hello");
	}  
	public void show()
	{
		System.out.println("Welcome");
	}  
	  
	public static void main(String args[])
	{  
		MultiInterface obj = new MultiInterface();  
		obj.print2();  
		obj.show();  
	   
	}  
	
}
