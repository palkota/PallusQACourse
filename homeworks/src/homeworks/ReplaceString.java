package homeworks;
import java.util.Scanner;

//PROGRAM TO REPLACE A SUBSTRING INSIDE A STRING BY ANOTHER ONE

public class ReplaceString
{
	public static void main(String[] args) 
	{
		String line;
		String text;
		//int index;
		String text2;
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		line=in.nextLine();
		System.out.print("Enter the word to be replaced: ");
		text=in.next();
		System.out.print(" enter the replacing word: ");
		text2=in.next();
		String ans;
		
		if(line.contains(text)==true)
		{
			ans=line.replace(text,text2);// replacing  all occurences ofgiven character with empty string
			System.out.print(ans);
		}
		else 
		{
		System.out.print(text+"is not present in the given string");
		}
		
		
		/*
		 
		StringBuffer sb=new StringBuffer(line);
		int index=sb.indexOf(text);
		sb.replace(index,,text2);---------??????????
		System.out.print(sb);
		
		*/
		
		
		
		
		
  }
	
}
