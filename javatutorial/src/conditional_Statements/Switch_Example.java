package conditional_Statements;

import java.util.Scanner;

//EXAMPLE FOR SWITCH CONDITION

public class Switch_Example
{
	public static void main(String[] args) {

		int index;

		Scanner in =new Scanner(System.in);

		System.out.print("Enter the index: ");

		index=in.nextInt();

		switch(index)

		{

		case 1:

			System.out.println("Sunday");

			break;

		case 2:

			System.out.println("Monday");

			break;

		case 3:

			System.out.println("Tuesday");

			break;

		case 4:

			System.out.println("Wednessday");

			break;

		case 5:

			System.out.println("Thursday");

			break;

		case 6:

			System.out.println("Friday");

			break;

		case 7:

			System.out.println("Saturday");

			break;

		default:

			System.out.println("Wrong Option");

			break;

		}

	}
}