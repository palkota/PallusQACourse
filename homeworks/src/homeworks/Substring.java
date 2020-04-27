package homeworks;

import java.util.Scanner;
//PROGRAM TO SEARCH FOR LAST OCCURANCE OF SUBSTRING INSIDE THE STRING ,VALUES TO BE ENTERED BY USER

public class Substring
{
	public static void main(String[] args)
	{
		String line;
		String text;
		int index;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		line=in.nextLine();
		System.out.println("Enter a substring to search for: ");
		text=in.next();
		
		if( line.contains(text)==true)
		{
			// getting the index of last occurance of the substring
			index=line.lastIndexOf(text);
			
			System.out.print(text+" is present in the given string at index "+index );
		}
		else
		{System.out.print(text+" is NOT present in the given string" );}
		
	}

	
}
