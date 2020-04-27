package homeworks;
import java.util.Scanner;

public class Occurances2 
{
 //PROGRAM TO COUNT NUMBER OF OCCURANCES OF EACH CHARACTER IN A STRING	

	public static void main(String[] args)
	{
	  String text;
	   String mod=" ";
	  char ch;
	  String fin;
	  
	 Scanner in=new Scanner(System.in);
	 System.out.println("Enter a string: ");
	 text=in.nextLine();
	 
	 int len=text.length();
	 
	for(int i=0;i<len;i++)
	{
		
	ch=text.charAt(i);
	fin=""+ch;
	
	mod=text.replaceAll(fin,"");
	System.out.print(mod+ " : ");
	
	int total=text.length()-mod.length();
	System.out.println("number of occurances of " +fin+ " is " +total);
	}
	 
	/*
	  System.out.print(mod);
	  int total=text.length()-mod.length();// difference of length of input and output strings,
	  gives the total number of occurances of the given character in the string
	  System.out.println("number of occurances is :" +total);
	 
	 */
	 
	
	}
}
