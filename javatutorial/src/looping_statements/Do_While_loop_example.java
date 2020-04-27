package looping_statements;

// EXAMPLE OF DO WHILE LOOP

public class Do_While_loop_example 
{

   public static void main(String[] args)
   {
   
	   /* * 1. Initialization 
	    	* 2. Increment/Decrement  
	    	* 3. Condition
       */


	/*	PROGRAM TO PRINT HELLO 10 TIMES
       int i=10;
        do
        {
           System.out.println("Hello");
			i++;


		}while(i<10);
*/


	/*PROGRAM TO PRINT PRODUCT OF FIRST 10 NUMBERS
		int i=1;
		int prod=1;
		do
        {
			prod=prod*i;
			i++;

		}while(i<=10);

		System.out.println(prod);

	 */


	//PROGRAM TO PRINT PATTERN OF STARS (*****)

		int i=1;
		
		do
		{
			int j=1;

			do
			{
				System.out.print("*");

				j++;

			}while(j<=i);

			System.out.println();
			
			i++;

		}while(i<=5);

	 

 // PROGRAM FOR Infinite Loop
	  /*
	   	do
	   	{
	   		System.out.println("Hello");

	   	}while(true);
	   	
	   	*/

   }
   

}