package arrays;
import java.util.Scanner;

//PROGRAM TO CREATE SINGLE DIMESION ARRAY WITH VALUES ENTERED BY USER

public class SingleDimensionArray
{
	public static void main(String[]args)
	{
		
		int a[]=new int[5]; // for single row with 5 values or columns
		Scanner in=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter the value for the index " +i +":");//taking values from user for column elements
		    a[i]=in.nextInt();//assigning input value to particular array index/ column
		
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" "); // printing the array
		}
		
	}
	
}