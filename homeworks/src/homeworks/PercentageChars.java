package homeworks;
import java.util.Scanner;

public class PercentageChars 
{
//PROGRAM TO FIND PERCENTAGES OF UPPERCASE,LOWERCASE LETTERS,
	//DIGITS AND SPECIAL CHARCTERS IN A GIVEN STRING
	
	public static void main(String[] args)
	{
		String line;
		int ucount=0; //uppercase letters
		int lcount=0;//lowercase letters
		int dcount=0;//digits
		int scount=0;//special characters
		
		Scanner in=new Scanner(System.in);
		System.out.print("enter a string: ");
		line=in.next();
		
		for(int i=0;i<line.length();i++)
		{
			char ch = line.charAt(i);
			if(ch >=65 && ch<=90)
			{
				ucount++;
			}
			else if(ch >=97 && ch<=122)
			{
				lcount++;
			}
			else if(ch >=48 && ch<=57)
			{
				dcount++;
			}
			else
			{
				scount++;
			}
		}
		System.out.println(ucount);
		System.out.println(((double)ucount/line.length())*100);
		
}

}
