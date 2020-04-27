package charsequence;

public class Exmaple6 
{
	public static void main(String[] args) {

		// Palindrom with String

		String city="Delhi",rev="";

		char[] arr=city.toCharArray();

		

		for(int i=0;i<arr.length;i++)

		{

			rev+=arr[arr.length-i-1];

		}

		System.out.println(rev);

		if(city.equals(rev))

		{

			System.out.println("Palindrome");	

		}

		else

		{

			System.out.println("Not Palindrome");

		}

	}
	
	
}
