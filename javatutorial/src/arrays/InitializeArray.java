package arrays;

//PROGRAM TO INITIALIZE A 2-DIMENSIONAL ARRAY

public class InitializeArray
{


   public static void main(String[] args)
   {

	// SYNTAX 1 FOR INITIALIZING 2-DIMENSIONAL ARRAY
	   
	   int[][] a=new int[][] {{12,43,64},{65,34,23},{98,65,34}}; 
	   
	     	for(int i=0;i<a.length;i++)	
	   	{
	   		for(int j=0;j<a[i].length;j++)
	   		{
	   			System.out.print(a[i][j]+ " ");
	   		}
	   		
	   		System.out.println();
	   	}
	   
	   /*  SYNTAX 2 OR ANOTHER WAY FOR 2-D ARRAY INITIALIZATION
	  
	   		
	   	int a[][] =new int[][]

	   				{

	   				new int[] {12,43,64},

	   				new int[] {65,34,23},

	   				new int[] {98,65,34}

	   				};
	   	for(int i=0;i<a.length;i++)	
	   	{
	   		for(int j=0;j<a[i].length;j++)
	   		{
	   			System.out.print(a[i][j]+ " ");
	   		}
	   		
	   		System.out.println();
	   	}
	*/	
	   
	   
			
   }
			

}