package constructor;

public class ConstructorOverloadingExample
{

	ConstructorOverloadingExample()
	{
		System.out.println("This is Empty Constructor");
	}	

	ConstructorOverloadingExample(int x)
	{
		System.out.println(x);
	}

	ConstructorOverloadingExample(String x)
	{
		System.out.println(x);
	}

	ConstructorOverloadingExample(String x,int y)
	{
		System.out.println(x+" "+y);
	}

	public static void main(String[] args)
	{

		ConstructorOverloadingExample obj1=new ConstructorOverloadingExample();

		ConstructorOverloadingExample obj2=new ConstructorOverloadingExample(5);

		ConstructorOverloadingExample obj3=new ConstructorOverloadingExample("Prem");

		ConstructorOverloadingExample obj4=new ConstructorOverloadingExample("Prem",7);

	}
	
}
