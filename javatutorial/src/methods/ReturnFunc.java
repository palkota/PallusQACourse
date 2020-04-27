package methods;

//EXAMPLE OF A METHOD/FUNCTION WITH PARAMETERS AND RETURN TYPE

public class ReturnFunc 
{
	int add(int x, int y)

	{

		int z=x+y;

		return(z);

	}

	public static void main(String[] args)
	{
		ReturnFunc obj=new ReturnFunc();

		int c=obj.add(5,6);

		System.out.println(c);

	}

}
