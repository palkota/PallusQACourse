package homeworks;
import java.util.Scanner;

//PROGRAM TO REVERSE A GIVEN STRING
public class ReverseString 
{

	public static void main(String[] args)
	{
		//PROGRAM TO REVERSE A STRING-WORD (WORKING)
		
		/*
		System.out.print("Enter a string: ");
		Scanner in=new Scanner(System.in);
		String word=in.next();

		String reverse="";

		for(int i=0;i<word.length();i++)

		{

			reverse=reverse+word.charAt(word.length()-i-1);

		}

		System.out.println(reverse);
		
		*/
		
		
		// PROGRAM TO REVERSE A STRING-WORKS FOR BOTH- WORD & SENTENCE (WORKING)
		
		
		System.out.print("Enter a string: ");
		Scanner in=new Scanner(System.in);
		String line=in.nextLine();

		String reverse="";
		String[] arr=line.split("");
		
		for(int i=0;i<arr.length;i++)
		{
			int x=arr.length-i-1;
			reverse=reverse+arr[x];
			
		}
		
		System.out.print(reverse);
		
		
		
	}

}
