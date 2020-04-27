package homeworks;
import java.util.Scanner;

public class AnagramStrings 
{

	public static void main(String[] args)
	{
		String text1,text2;
		char ch;
		int i;
		Scanner in=new Scanner(System.in);
		
		System.out.print("enter first word: ");
		text1=in.next();
		System.out.print("enter second word: ");
		text2=in.next();
		
		for(i=0;i<text1.length();i++)
		{
			ch=text1.charAt(i);
			String temp=""+ch;
			
			if(text2.contains(temp)==true)
			{ 
				
				System.out.println(text1+ "  and  " + text2+ "  are anagrams ");
				continue;
			}
			else
				
			{
				System.out.print(text1+ " and "+ text2+ " are NOT anagrams");
				break;
			}
			
					
		}// end For
		
		
		
	}

}
