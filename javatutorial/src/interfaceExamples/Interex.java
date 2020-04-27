package interfaceExamples;

// The class implementing an interface should implement all the methods of the interface.

interface printable
{  
	void print();  //abstract method of interface
}  

public class Interex implements printable 
{
	public void print()    //implementation of the abstract method of interface
	{
		System.out.println("Hello");
	}  
	  
	public static void main(String args[])
	{  
		Interex obj = new Interex();  
		obj.print(); 
	
	 }  

}
