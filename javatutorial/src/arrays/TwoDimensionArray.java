package arrays;

import java.util.Scanner;

//PROGRAM TO TAKE VALUES FROM USER TO CREATE 2-DIMENSIONAL ARRAY
public class TwoDimensionArray 
{

	public static void main(String[] args) 
	{
		int a[][]=new int[2][3];// declaring array with 2 rows & 3 columns
		/* a.length returns num of rows of array
		 * a[0].length returns num of columns or elements in 2-D Array
		 */
		Scanner in=new Scanner(System.in);
		
		// For getting input values for the array from user
		for(int i=0;i<a.length;i++) //for each row of array
		{
			for(int j=0;j<a[i].length;j++) //for each column in one row
			{
				System.out.print("Enter value for the index "+i+" "+j+": ");
				a[i][j]=in.nextInt(); //assign input values from user to array
				
			}
		}
		
		// For displaying the array values
				for(int i=0;i<a.length;i++) //for each row of array
				{
					for(int j=0;j<a[i].length;j++) //for each column in one row
					{
						System.out.print(a[i][j]+" "); //displaying the array columns in each row
						
					}
					
					System.out.println();
				}
		

	}

}
