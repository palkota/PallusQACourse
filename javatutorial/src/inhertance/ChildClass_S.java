package inhertance;

import methods.NonParaFunc;

// EXAMPLE FOR SINGLE INHERITANCE ,WITH ACCESS MODIFIERS

class BaseClass_S

{

	public BaseClass_S()

	{

		System.out.println("Constructor");

	}

	public void display1()

	{

		System.out.println("BaseClass");

	}

	private void display2()

	{

		System.out.println("BaseClass_private");

	}

	protected void display3()

	{

		System.out.println("BaseClass_protected");

	}

	void display4()

	{

		System.out.println("BaseClass");

	}

}



public class ChildClass_S extends BaseClass_S //NonParaFunc //

{

	 void display4()

	 {

			System.out.println("ChildClass");		 

	 }

	public static void main(String[] args) 
	{

		ChildClass_S obj=new ChildClass_S();

		obj.display1(); //public method
		//obj.display2(); //private method, not accessible outside that class
		obj.display3(); //protected method,accessible
		obj.display4(); // child class method
		

		

	}



}