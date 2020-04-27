package charsequence;

public class Example5 
{

	public static void main(String[] args) {

		// Palindrome using StringBuilder

		

		StringBuilder name=new StringBuilder("madam1");

		StringBuilder copy=new StringBuilder(name);

		name.reverse();

		/*

		 * Convert to String before equals

		 */

		if(name.toString().equals(copy.toString()))

		{

			System.out.println("is palindrome");

		}

		else

		{

			System.out.println("is not palindrome");

		}

	}	
	
}
