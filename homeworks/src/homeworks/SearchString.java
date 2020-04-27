package homeworks;
import java.util.Scanner;

//PROGRAM TO SEARCH FOR A WORD INSIDE A STRING
public class SearchString 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String line=in.nextLine();
		
		System.out.print("Enter a word to search: ");
		String word=in.nextLine();

		/* LONG WAY TO DO THIS--NOT NEEDED. SCROLL DOWN FOR SHORT METHOD
		//String[] arr=line.split(" ");// split the sentence wherever there is space. 
		//be careful not to give empty string
		
		
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i].equals(word)==true)
			{ 
				System.out.print(word+ "found in string");
			
			}
			else
			{
			   System.out.print(word+ "NOT found in string");
			  }
			
			
		}
		
		*/
		
		// SHORT WAY TO DO THIS PROGRAM
		
		if(line.contains(word))
		{
			System.out.print(word+ " is found in string");
		}
		else
		{
			System.out.print(word+ " is NOT found in string");
		}
			
		
		//in.close();// for resolving warning/error showing at Scanner in=new sc.. statement
		
	}	

}

