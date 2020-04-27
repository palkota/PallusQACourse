package inheritanceBetterExamples;

//EXAMPLE OF SINGLE INHERITANCE

class Animal
{  
	void eat()
	{
	System.out.println("eating...");
	}  
}  

class Dog extends Animal
{  
	void bark()
	{
		System.out.println("barking...");
	}  
} 

class SingleInheritance
{  
	public static void main(String args[])
	{  
		Dog d=new Dog();  // creating object for child class
		d.bark();  //calling child class method
		d.eat();  //calling parent class method with child class object
	}
	
}  
