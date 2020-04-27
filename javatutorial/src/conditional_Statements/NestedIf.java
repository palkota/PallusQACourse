package conditional_Statements;

//************** EXAMPLE FOR NESTED-IF CONDITION

import java.util.Scanner;

public class NestedIf 
{
	public static void main(String[] args) 
	{

		int age;

		Scanner in =new Scanner(System.in);

		System.out.println("Enter your age ");

		age=in.nextInt();

		if(age>=18)

		{

			System.out.println("Enter the pan status(yes/no)");

			String panstatus=in.next();

			if(panstatus.equals("yes"))

			{

				System.out.println("Eligible");

			}

			else

			{

				System.out.println("Apply for pan");

			}

		}

		else

		{

			System.out.println("Not Eligible");			

		}

	}



}
