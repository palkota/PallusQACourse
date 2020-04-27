package homeworks;
import java.util.Scanner;

public class SplitString
{
  public static void main(String[] args) 
  {
	  int count=0;
	  
	Scanner in=new Scanner(System.in);
	
	System.out.println("Enter a string: ");
	String line=in.nextLine();
	
	String[] arr=line.split(" ");
	//splitting the string into elements or substrings at every space
	
	for(int i=0;i<arr.length;i++)
	{
		count++; //counting the total number of words or substrings in the string
			
		System.out.println(arr[i]);// printing all the substrings or elements of the array
		
	}
	System.out.println("Number of words in the string are "+count);
	
  }
}
