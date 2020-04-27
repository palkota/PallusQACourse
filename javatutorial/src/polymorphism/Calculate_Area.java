package polymorphism;

//POLYMORPHISM EXAMPLE WITH "METHOD OVERLOADING"

public class Calculate_Area 
{
	
	void area(int r)
	{
		int ans=(int) (3.14*r*r);

		System.out.println("method1 : "+ans);
	}

	void area(int l,int b)
	{
		int ans=l*b;

		System.out.println("method2: "+ans);
	}

	void area(double l,double b)
	{
		int ans=(int)(l*b);

		System.out.println("Double: "+ans);
	}

/*	void area(String x,String y)
	{
		System.out.println(x+y);
	}
*/	

	public static void main(String[] args)
	{

		Calculate_Area obj=new Calculate_Area();

		obj.area(5, 6);

		obj.area(5);

		obj.area(5.6, 6);

		//obj.area("prem", 6);

	}
	

}
