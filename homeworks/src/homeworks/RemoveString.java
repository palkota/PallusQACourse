package homeworks;
import java.util.Scanner;


public class RemoveString 
{
	//PROGRAM TO REMOVE A PARTICULAR CHARACTER FROM A STRING

	public static void main(String[] args) 
	{
		String line;
		String text;
		//int index;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		line=in.next();
		System.out.println("Enter the character to remove from string:  ");
		text=in.next();
	
		/* 
		if(line.contains(text)==true)
		{
			line.replaceAll(text,"");// replacing  all occurences ofgiven character with empty string
			System.out.print(line);
		}
		else {
		System.out.print(text+ "not present in the given string");
		}
		 */
		
		
		StringBuffer sb=new StringBuffer(line);
		int index=sb.indexOf(text);
		sb.deleteCharAt(index);
		System.out.print(sb);
		
		
  }

}

