package methods;

//EXAMPLE OF A METHOD/FUNCTION WITH PARAMETERS AND NO RETURN TYPE

public class ParaFunc 
{
	void add(int x, int y)

	{
		int z=x+y;
		System.out.println(z);
		
	}
	
	public static void main(String[] args)
	{
		ParaFunc obj=new ParaFunc();

		obj.add(5,6);
	}
	

}
