package homeworks;
import java.util.Scanner;

public class WhiteSpaces 
{// PROGRAM TO REMOVE ALL WHITE SPACES FROM A STRING

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String line=in.nextLine();
		
		String mod=line.trim();// removing leading & trailing white spaces
		
		String fin=mod.replace(" ","");// removing spaces within sentence
		System.out.println(fin);
		
		
	}
}


