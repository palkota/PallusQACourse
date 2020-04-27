package homeworks;
import java.util.Scanner;

//PROGRAM TO COMPARE 2 STRINGS
public class CompareStrings
{

	public static void main(String[] args)
	{
		String text1,text2;
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter string1: ");
		text1=in.nextLine();
		
		System.out.print("Enter string2: ");
		text2=in.nextLine();
		
		//if(text1.equals(text2))
		if(text1.equalsIgnoreCase(text2))
		{System.out.print("Both the strings are same ");}
		else
		{System.out.print("Both the strings are NOT same ");}
		
	}

}
