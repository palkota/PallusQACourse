package arrays;

import java.util.Scanner;

public class Arrays_Example
{

	public static void main(String[] args)
	{
		/*
		// PROGRAM TO TAKE INPUT VALUES(DOUBLE) FROM USER AND CREATE AN ARRAY
		double[] a=new double[3];

		Scanner in=new Scanner(System.in);

		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter a value in double for a("+i+"): ");
			a[i]=in.nextDouble();
		}

		for(int i=0;i<a.length;i++)
		{
			System.out.println("value in ("+i+"): "+a[i]);
		}
	*/
	
		
	 
		// PROGRAM TO TAKE INPUT MARKS FOR EACH SUBJECT FROM USER AND PRINT TOTAL MARKS

		int[] marks=new int[5];

		int total=0;

		Scanner in=new Scanner(System.in);

		for(int i=0;i<5;i++)

		{

			System.out.print("Enter the Subject-"+(i+1)+" Mark: ");

			marks[i]=in.nextInt();
			total=total+marks[i];

		}

	  	//for(int i=0;i<5;i++)

		//	{
		//		total=total+marks[i];
		//	} 

		System.out.println("Total ="+total);

	 
		
		
	/*
		 //PROGRAM TO TAKE STRING INPUTS FROM USER AND STORE THEM & PRINT IN UPPERCASE

		String[] name= new String[3];

		Scanner in=new Scanner(System.in);

		for(int i=0;i<name.length;i++)
		{
			System.out.print("Enter the Name:");
			name[i]=in.nextLine();
		}

		for(int i=0;i<name.length;i++)
		{
			System.out.println("Converting words to uppercase: "+name[i].toUpperCase());
		}
	
		*/
		

	}

}
