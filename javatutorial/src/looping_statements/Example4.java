package looping_statements;

public class Example4
{

	public static void main(String[] args)
	{
		//Palindrome or not 1331

		int num=1441;

		int rev=0;

		int copy=num;

		while(num!=0)
		{
			int temp=num%10;

			rev=(rev*10)+temp;

			num=num/10;
		}

		if(copy==rev)
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("Not a Palindrome");
		}

	}
	
}
