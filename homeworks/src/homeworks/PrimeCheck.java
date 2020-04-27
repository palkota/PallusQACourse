package homeworks;
import java.util.Scanner;
//PROGRAM TO CHECK WHETHER INPUT NUMBER IS PRIME NUMBER OR NOT

public class PrimeCheck
{
	void checkPrime(int n)
	{
		int i; int flag=0;
		int m=0;
		
		m=n/2;
		
		if(n==0||n==1)
		{
			System.out.println(n+ "  is not a prime number");
			
		}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.print(n+ " is not a prime number");
					flag=1;
					break;
				}
			}//close for loop
			
				if(flag==0)
				{
					System.out.print(n+ " is a prime number");
					//break;
				}
		
		}//else
		
	}
	
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		
		PrimeCheck obj=new PrimeCheck(); //creating object for class
		
		System.out.print("Enter a number to check whether it is prime number or not : ");
		int num=in.nextInt();// taking input into variable
		
		obj.checkPrime(num);//calling class method and passing variable to the method

	}

}
