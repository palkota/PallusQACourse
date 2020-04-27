package methods;

//PROGRAM TO GET TOTAL OF ALL DIGITS IN A GIVEN NUMBER, INTO A SINGLE DIGIT.

public class Example1
{
	public static void main(String[] args) {

		int number=6988;

		Example1 obj=new Example1();

		while(obj.length(number)!=1)

		{

			number=obj.sumOfDigit(number);

		}

		System.out.println(number);

	}



	private int sumOfDigit(int number) {

		int sum=0;

		while(number!=0)

		{

			int temp=number%10;

			sum=sum+temp;

			number=number/10;

		}

		return sum;

	}



	private int length(int number)
	{

		int len=0;

		while(number!=0)

		{

			len++;

			number=number/10;

		}

		return len;

	}

}
	
