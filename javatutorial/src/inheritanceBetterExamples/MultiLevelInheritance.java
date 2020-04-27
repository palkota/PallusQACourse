package inheritanceBetterExamples;

//MULTI-LEVEL INHERITANCE EXAMPLE

class Animal2
{  
	void eat()
	{
		System.out.println("eating...");
	}  
} 

class Dog2 extends Animal2
{  
	void bark()
	{
		System.out.println("barking...");
	}  
} 

class BabyDog extends Dog2
{  
	void weep()
	{
		System.out.println("weeping...");
	}  
}

class MultiLevelInheritance
{  
	public static void main(String args[])
	{  
		BabyDog d=new BabyDog();  //creating object for current class
		d.weep();  //calling current class method with current class object
		d.bark();  // calling parent "      "     "      "      "     "
		d.eat();   // calling super-parent class  "    "    "   "     "
	}
	
} 
