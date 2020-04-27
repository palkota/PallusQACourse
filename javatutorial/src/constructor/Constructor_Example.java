package constructor;

public class Constructor_Example 
{
	//CONSTRUCTOR HAS SAME NAME AS CLASS NAME. IT HAS NO RETURN TYPE. 
	//CONSTRUCTOR OVERLOADING IS MULTIPLE CONSTRUCTORS WITH DIFFERENT TYPE OF
	// INPUT PARAMETERS
	//CONSTRUCTOR IS CALLED WHEN OBJECT FOR THE CLASS IS CREATED
	
	Constructor_Example() //constructor1
	{
		System.out.println("This is Construtor");
	}
	
	Constructor_Example(int x) //constructor2
	{
		System.out.println(x);
	}

	Constructor_Example(double x) //constructor3
	{
		System.out.println(x);
	}

	Constructor_Example(int x, double y) //constructor 4
	{
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args)
	{

		Constructor_Example obj=new Constructor_Example();

		Constructor_Example obj1=new Constructor_Example(3);

		Constructor_Example obj2=new Constructor_Example(3,6.5);

		Constructor_Example obj3=new Constructor_Example(3.6);



	}
	
	
}
