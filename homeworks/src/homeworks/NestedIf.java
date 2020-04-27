package homeworks;
import java.util.Scanner;
public class NestedIf
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
   
      int year;
      //boolean s;
      do
      {
    	       System.out.print("Enter any year to check OR enter '0' to exit: ");
    	       //System.out.print("Press 0 to exit");
    	       Scanner in=new Scanner(System.in);
    	       year=in.nextInt();
    	  
    	  
       
        if(year%4==0)
        { 
    	   if(year%100==0) 
    	   {
    		   if (year%400==0)
    		   {System.out.println("It is a Leap Year");
    		    
    		   }
    		   else
    		   {System.out.println("It is NOT a Leap Year");
    		   
    		   }
    	   }
    	   else
    	   {
    		   System.out.println(" It is Leap Year");
    		   
    		   
    	   }
       }
       else
       {System.out.println(" It is NOT a Leap Year");
      
       }
       
       // System.out.println("Do you want to continue?(true/false)");
        //s=in.nextBoolean(); 
        
      }while(year!=0);
      //while(s==true);
        
         	   
	}

}
