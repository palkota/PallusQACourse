package homeworks;
import java.util.Scanner;

public class Occurances 
{ 
	// PROGRAM TO COUNT TOTAL NUMBER OF OCCURANCES OF A GIVEN CHARACTER
	//IN A STRING WITHOUT USING ANY LOOP
	
	public static void main(String[] args)
	{
	  String text;
	 
	  int count=0;
	  String ch;
	  
	  
	 Scanner in=new Scanner(System.in);
	 System.out.println("Enter an string: ");
	 text=in.nextLine();
	 
	 System.out.println("Enter a character to search in above string: ");
	 ch=in.next();
	 
	System.out.println(text.replace(ch,"")); //replacing the searched character with empty string
	 String outp=text.replace(ch,""); //replacing with empty string means removing the character from the string
	 
	 int total=text.length()-outp.length();// difference of length of input and output strings,
	 //gives the total number of occurances of the given character in the string
	 
	 System.out.println("number of occurances is :" +total);
	 
	
	}
	
}
