package homeworks;
import java.util.Scanner;

//PROGRAM TO REVERSE EACH WORD IN A S
public class ReverseEachWord 
{
  public static void main(String[] args)
  {
	  
    
	System.out.print("Enter a string: ");
	Scanner in=new Scanner(System.in);
	String line=in.nextLine();

	String rev=" ";
	String finalrev=" ";
	
	String[] arr=line.split(" ");
	
		
	for(int i=0;i<arr.length;i++)
	{
		String text=arr[i];
		
		for(int j=0;j<text.length();j++)
		{
		   rev=rev+ text.charAt(text.length()-j-1);//
		}
		
		
		finalrev=" "+rev + " ";
		
	}//end outer For loop
	
   System.out.print(finalrev); // spaces between words are not displayed
	

	}

	
}
