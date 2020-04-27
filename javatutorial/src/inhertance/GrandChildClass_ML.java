package inhertance;

// EXAMPLE OF MULTI-LEVEL INHERITANCE

class ParentClass_S1
{

	void display1()

	{

		System.out.println("ParentClass_S1");

	}

}
class ChildClass_S2 extends ParentClass_S1

{

	void display2()

	{

		System.out.println("ChildClass_S2");

	}

}
public class GrandChildClass_ML extends ChildClass_S2

{

	public static void main(String[] args)
	{

		GrandChildClass_ML obj=new GrandChildClass_ML();

		obj.display1();// able to call super-parent class method using inheritance

		obj.display2();//able to call parent class method using inheritance

	}



}