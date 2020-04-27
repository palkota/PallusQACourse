package homeworks;
import java.util.Scanner;

public class TypeCastString
{
//PROGRAM TO CONVERT STRING TO INTEGER & INTERGER TO STRING
	
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		 
		int a=10;
		
		//converting integer to string
		System.out.println("String value of integer is: "+ a);
		
		
		//converting string to integer

		String x="36";
		//int y=5+x;
		int y=Integer.parseInt(x);
		System.out.println(y);
		
	}

}
