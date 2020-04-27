package homeworks;
import java.util.Scanner;
public class ChangeCase
{
	//PROGRAM TO CHANGE ENTERED STRING TO UPPERCASE

	public static void main(String[] args)
	{
		String lower,upper;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter a string in lower case: ");
		lower=in.nextLine();
		
		upper=lower.toUpperCase();
		System.out.print(upper);
		
		}

}
