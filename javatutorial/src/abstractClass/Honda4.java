package abstractClass;

//BASIC EXAMPLE OF ABSTRACT CLASS. 
//Abstract class can contain abstract or non-abstract(with body) methods

abstract class Bike
{  
	  abstract void run();  //abstract method
}  

public class Honda4 extends Bike
{
	void run() //class implementing the abstract method
	{
		System.out.println("running safely");
	}  
	
	public static void main(String args[])
	{  
		Bike obj = new Honda4();  //syntax to connect abstract class to child class
		obj.run();  
	}  
	
}
