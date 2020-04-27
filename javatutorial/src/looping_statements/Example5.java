package looping_statements;

public class Example5 
{
	// WRONG CODE- PROGRAM GIVES WRONG OUTPUT
	
	public static void main(String[] args) {

		// Prime number or not

		int num =18,count=0;

		for(int i=2;i<num/2;i++)
		{
			if(num/i==0)
			{
				count+=0;
			}
		}

		if(count==0)

		{

			System.out.println("Prime");

		}

		else

		{

			System.out.println("Not Prime");

		}

	}
	

}
