package arrays;

public class SplitFunction
{
	//PROGRAM TO SPLIT A STRING INTO ARRAY OF WORDS & DISPLAY THE ARRAY

	public static void main(String[] args)
	{
		String address="#219, Neeladri Nagar, Electronic City, Bengaluru, Karnataka 560100";

		String[] arr=address.split(" ");

		for(int i=0;i<arr.length;i++)

		{

			System.out.println("index: "+i+" Value: "+arr[i]);

		}

	}

}
