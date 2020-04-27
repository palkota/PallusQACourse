package arrays;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args)
	{
		//int a[]=new int[] {12,43,65,19};

		

				/*int a[][]=new int[][] {

					{12,43,54},

					{65,34,78,56},

					{12,32}

				};

				

				for(int i=0;i<a.length;i++)

				{

					for(int j=0;j<a[i].length;j++)

					{

						System.out.print(a[i][j]+"   ");

					}

					System.out.println();

				}*/

				

				int a[][]=new int[2][];

				Scanner in =new Scanner(System.in);

				for(int i=0;i<a.length;i++)

				{

					System.out.println("Enter the boundary: ");

					int index= in.nextInt();

					a[i] =new int[index];

					for(int j=0;j<a[i].length;j++)

					{

						System.out.println("Enter the value for "+i+" "+j+" :");

						a[i][j]=in.nextInt();

					}

				}

				

				for(int i=0;i<a.length;i++)

				{

					for(int j=0;j<a[i].length;j++)

					{

						System.out.print(a[i][j]+"   ");

					}

					System.out.println();

				}

	}

}
