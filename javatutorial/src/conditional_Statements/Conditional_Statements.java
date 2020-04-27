package conditional_Statements;
import java.util.Scanner;

//*********** EXAMPLE for IF & ELSE IF Condition

public class Conditional_Statements
{

	public static void main(String[] args)
	{
		/* When should we go to else if?

		 *  When you get multiple statements to be handled

		 *  When should we use logical operator? 

		 *  When you get multiple cond. should be taken care in conditional statements

		 */
		int a,b,c;
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the value for A: ");
		a=in.nextInt();
		System.out.print("Enter the value for B: ");
		b=in.nextInt();
		System.out.print("Enter the value for C: ");
		c=in.nextInt();
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("C is greater");
		}

	}

}
