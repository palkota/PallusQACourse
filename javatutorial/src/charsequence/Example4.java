package charsequence;

public class Example4 
{

	public static void main(String[] args)
	{

		String str="tests";

		char[] ch=str.toCharArray();

		for(int i=0;i<ch.length;i++)

		{

			for(int j=i+1;j<ch.length;j++)

			{

				if(ch[i]==ch[j])

				{

					ch[i]='0';

					ch[j]='0';

					break;

				}

			}

		}

		int count=0;

		for(int i=0;i<ch.length;i++)

		{

			if(ch[i]!='0')

			{

				count++;

			}

		}

		if(count>1)

		{

			System.out.println("Its can not become Palindrome");

		}

		else

		{

			System.out.println("Its can become Palindrome");

		}

	}



}

