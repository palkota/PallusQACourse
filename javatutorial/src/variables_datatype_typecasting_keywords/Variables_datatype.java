package variables_datatype_typecasting_keywords;
import java.util.Scanner;

public class Variables_datatype 
{
	public static void main(String[] args)
	{

		int a,b,c;

		Scanner obj=new Scanner(System.in);

		System.out.print("Enter the value for a: ");

		a=obj.nextInt();

		System.out.print("Enter the value for b: ");

		b=obj.nextInt();

		c=a*b;

		System.out.println("Product of "+a+" and "+b+": "+c);

		

	/*	

		double a,b,c;

		Scanner obj=new Scanner(System.in);

		System.out.print("Enter the value for a: ");

		a=obj.nextDouble();

		System.out.print("Enter the value for b: ");

		b=obj.nextDouble();

		c=a*b;

		System.out.println("Product of "+a+" and "+b+": "+c);

		*/

		/*

		String name;

		Scanner obj=new Scanner(System.in);

		System.out.print("Enter the name: ");

		//name=obj.next();

		name=obj.nextLine();

		System.out.println("Student Name: "+name);

	*/

	}
	
}
