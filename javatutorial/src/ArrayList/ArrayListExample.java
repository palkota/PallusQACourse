package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//PROGRAM FOR ARRAYLIST AND HASHMAP
public class ArrayListExample
{
	public static void main(String[] args) 
	{

		/*

				String name;

				

				System.out.print("Enter the name: ");

				Scanner in=new Scanner(System.in);

				name=in.nextLine();

				

				int len=name.length();

				

				for(int i=0;i<len;i++)

				{

					System.out.println(name.charAt(i));

				}

				

				

				for(char c : name.toCharArray())

				{

					System.out.println(c);

				}

		*/

			/*	List<Integer> li=new ArrayList<Integer>();

				li.add(1);

				li.add(2);

				li.add(3);

				li.add(3);

				li.add(3);

				li.add(3);

				li.add(4);

				li.add(5);

				

				for(int x : li)

				{

					System.out.println(x);

				}

				*/

			/*	String name="prem";

				

				for(char c : name.toCharArray())

				{

					System.out.println(c);

				}

			*/

				Map obj=new HashMap();

				obj.put("First Name", "Prem");

				obj.put("Second Name", "Kumar");

				obj.put("School", "Don Bosco");

			

				for (Object key:obj.keySet())

				{

					System.out.println(key+"-"+obj.get(key));

				}

			}

	}
	
