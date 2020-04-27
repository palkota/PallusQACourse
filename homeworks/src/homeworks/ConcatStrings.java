package homeworks;

import java.util.Scanner;

public class ConcatStrings 
{
	//PROGRAM TO CONCATENATE 2 STRINGS

		public static void main(String[] args)
		{
			String text1,text2,result;
			
			Scanner in=new Scanner(System.in);
			
			System.out.println("enter the first string: ");
			text1=in.nextLine();
			
			System.out.println("enter the second string: ");
			text2=in.nextLine();
			
			result=text1.concat(text2);
			System.out.print("concatenated strings: "+result);
			
			}

}
