package charsequence;

public class Example1 
{

	public static void main(String[] args) {

		/** Program to find how many vowels and consonants in the sentence*/

		String sentence="Big black bugs bleed white black blood but baby black bugs bleed white blood.";

		sentence=sentence.toLowerCase();

		int count1=0,count2=0;

		for(int i=0;i<sentence.length();i++)

		{

			if(sentence.charAt(i)=='a'||sentence.charAt(i)=='e'||sentence.charAt(i)=='i'||sentence.charAt(i)=='o'||sentence.charAt(i)=='u')

			{

				count1++;

			}

			else if (sentence.charAt(i)!=' ')

			{

				count2++;

			}

		}

		System.out.println("V: "+count1);

		System.out.println("C: "+count2);

	}

}
