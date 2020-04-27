package conditional_Statements;

import java.util.Scanner;

public class Conditional_Statements1 
{

	public static void main(String[] args) {

		//If conditional statement
		/*	

		int age;

		Scanner in =new Scanner(System.in);

		System.out.print("Enter your Age: ");

		age=in.nextInt();

		//System.out.println(age>=18);

		if(age>=18)

		{

			System.out.println("Your Eligible for Vote");

		}

	*/

		//If else conditional statement

	/*
		int age;

		Scanner in =new Scanner(System.in);

		System.out.print("Enter your Age: ");

		age=in.nextInt();

		if(age>=18)

		{

			System.out.println("Your Eligible for Vote");

		}

		else

		{

			System.out.println("Your Not Eligible for Vote");

		}

	*/

		//else If conditional statement

		int options;

		Scanner in =new Scanner(System.in);

		System.out.print("Enter the option: (1)File Load (2)File Delete (3)File Edit ");

		options=in.nextInt();

		if(options==1)

		{

			System.out.println("You opted for File load");

		}

		else if(options==2)

		{

			System.out.println("You opted for File delete");			

		}

		else if(options==3)

		{

			System.out.println("You opted for File edit");

		}

		else

		{

			System.out.println("Wrong Option");	

		}

	

		//nested if conditional statement 

		/*
		 
		 int age;
		Scanner in =new Scanner(System.in);

		System.out.print("Enter your Age: ");

		age=in.nextInt();

		if(age>=18)

		{

			System.out.print("Enter the Pan Status: (Yes/No)");

			String panstatus;

			panstatus=in.next();

			if(panstatus.equals("Yes"))

			{

				System.out.println("Eligible to open Bank Account");

			}

			else

			{

				System.out.println("Please apply for pan");

			}

		}

		else

		{

			System.out.println("Your Not Eligible to open Bank account");

		}

		*/

		

		//Logical operator in conditional statement 

		/*int a,b,c;

		Scanner in =new Scanner(System.in);

		System.out.print("Enter the 1st number: ");

		a=in.nextInt();

		System.out.print("Enter the 2nd number: ");

		b=in.nextInt();

		System.out.print("Enter the 3rd number: ");

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

		 */

	}



}

