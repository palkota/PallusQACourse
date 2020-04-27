package looping_statements;

public class For_loop_example 
{

	public static void main(String[] args)
	{
		/* 1. Initialization 
		 	* 2. Condition
		 	* 3. Increment/Decrement 
		*/

//PROGRAM TO PRINT HELLO 10 TIMES

/*	for(int i=0;i<10;i++)
	{
		System.out.println("Hello");
	
	}

*/

 
 //Infinite Loop USING FOR LOOP

	/*
		for(;;)
		{
			System.out.println("Hello");

		}

	 */


	// PROGRAM TO	

	/*
		for(int num=1;num<=10;num++)
		{
			int count=0;
			
			for(int i=1;i<=(num/2);i++)

			{

				if(num%i==0)
				{
					count++;
				}

			}

			if(count==1)

			{
				System.out.println(num);
			}

		}
	
	 */
		

// SUM OF 'X' NUMBERS USING FOR LOOP
		
		int sum=0;

		for(int x=0;x<=10;x++)
		{
			sum=sum+x;
		}

		System.out.println("Sum of x= "+sum);


	}


}
	
