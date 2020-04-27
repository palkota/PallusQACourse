package looping_statements;

import java.util.Scanner;

public class BreakStatement_Example 
{
 public static void main(String[] args) 
	{
	  int x;

	  Scanner in=new Scanner(System.in);

	  while(true)

	  { 
		  System.out.println("Shall I execute(0/1): ");

		x=in.nextInt();

		if(x==0)
		{

			break;

		}

		System.out.println("Hello");

	}

	System.out.println("Thanks for using my code");	
	
}

}