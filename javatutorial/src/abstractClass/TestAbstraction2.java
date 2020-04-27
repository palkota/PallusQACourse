package abstractClass;

//An abstract class can have a data member,
//abstract method, method body (non-abstract method), constructor, and even main() method.

abstract class Bike2
{  
	 Bike2() // constructor of abstract class
	 {
		 System.out.println("bike is created");
	 }  
	 
	 abstract void run(); //abstract method
	 
	 void changeGear()    //non-abstract method
	 {
		 System.out.println("gear changed");
	 }  
	 
}  
	//Creating a Child class which inherits Abstract class  
	 class Honda extends Bike2
	 {  
		 void run() // implementing the abstract method of other abstract class
		 {
			 System.out.println("running safely..");
		 }  
	 } 
	 
	//Creating a Test class which calls abstract and non-abstract methods  
	 class TestAbstraction2
	 {  
		 public static void main(String args[])
		 {  
			 Bike2 obj = new Honda();  //syntax to link abstract class to  child class
			 obj.run();  
			 obj.changeGear();  
		 }  
	}  

