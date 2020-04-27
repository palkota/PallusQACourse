package looping_statements;

public class While_loop_example
{
	
	public static void main(String[] args) {
		/*

		 * 1. Initialization 

		 * 2. Condition 

		 * 3. Increment/Decrement 

		 */

	/*	//PROGRAM TO PRINT HELLO 10 TIMES

		int i=10;

		while(i<10)

		{

			System.out.println("Hello");

			i++;

		}

	*/

	/*	//ABOVE SAME PROGRAM IN AN ALTERNATE WAY
	 * int i=10;

		while(i>0)

		{

			System.out.println("Hello");

			i--;

		}

	*/

	/*	// PROGRAM TO PRINT ALL EVEN  NUMBERS FROM 97 TO 156

		int i=97;

		while(i<=156)

		{

			if(i%2==0)

			{

				System.out.println(i);

			}

			i++;

		}

	*/

	/* //PROGRAM TO PRINT SUM OF 'N' numbers, example from 0-10

		int x=10,i=0;

		int sum=0;

		while(i<=x)

		{

			sum=sum+i;

			i++;

		}

		System.out.println("Sum of x= "+sum);
		
    */

	
		/*

		// PROGRAM FOR Sum of Odd and Even n numbers

		int i=0;

		int sumeven=0;

		int sumodd=0;

		while(i<10)

		{

			if(i%2==0)

			{

				sumeven=sumeven+i;

			}

			else

			{

				sumodd=sumodd+i;	

			}

			i++;

		}

		System.out.println("Ans for sum of even: "+sumeven);

		System.out.println("Ans for sum of odd: "+sumodd);

*/		

	/*	//Infinite Loop

		while(true)

		{

			System.out.println("Hello");

		}

		*/
		

		//Palindrome Program

		int num=1331;

		int copy=num;

		int rev=0;

		

		while(num!=0)

		{

			int temp=num%10;

			rev=rev*10;

			rev=rev+temp;

			num=num/10;

		}

		System.out.println(rev);

		if(copy==rev)

		{

			System.out.println("Its a Palindrome");

		}

		else

		{

			System.out.println("Its not a Palindrome");

		}

	}//end main


}

