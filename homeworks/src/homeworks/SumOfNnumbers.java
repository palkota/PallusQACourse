package homeworks;

import java.util.Scanner;

public class SumOfNnumbers {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
//*********Program for Sum of 'n' numbers using FOR Loop**************//
		
	int i=1;
	int n; //for input number from user
	int sum=0;
	
	System.out.print("Enter a number for sum of 'n' numbers: ");
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	
	for(i=1;i<=n;i++)
	{
		sum=sum+i;
	}
	System.out.println("sum of first "+ n + " numbers is: "+sum);

	}

}
