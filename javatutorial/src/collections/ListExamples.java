package collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExamples 
{
	public static void main(String[] args) 
	{
		/*List

	 * 1. Array List

	 * 2. Linked List

	 * 3. Vector List

	 * 4. Stack List

	 */

/*
	List<Integer> Marks=new ArrayList<Integer>();

	Marks.add(67);

	Marks.add(45);

	Marks.add(65);

	Marks.add(624);

	Marks.add(1237);


	for(Integer item : Marks)
	{

		System.out.println(item);

	}

	*/
		

		
/*
	List<String> Name=new ArrayList<String>();

	Name.add("prem");

	Name.add("gokul");

	Name.add("Jaya");

	Name.add("prem");

	Name.add("vivek");

	for(String item : Name)

	{

		System.out.println(item);

	}

	Name.remove("Jaya");

	for(String item : Name)
	{

		System.out.println(item);

	}
*/


/*

	//System.out.println(Name.contains("tiger"));

	if(Name.contains("gokul"))

	{

		System.out.println("Gokul is there in the list");

	}

*/


/*
	List<String> Name=new ArrayList<String>();
	Name.add(0,"anish");
	//System.out.println(Name.get(0));
	System.out.print(Name);
*/
	

	//System.out.println(Name.indexOf("prem"));

	//System.out.println(Name.lastIndexOf("prem"));



	/*

	List<String> li=new ArrayList<String>();

	li.add("apple");
	li.add("banana");
	li.add("orange");
	li.add(1, "grapes");

	System.out.println(li.get(1));

	System.out.println(li);

	li.remove("grapes");

	System.out.println(li);

	li.remove(2);

	System.out.println(li);

	

	System.out.println(li.indexOf("gauva"));

	

	if(li.contains("gauva"))

	{

		System.out.println("Yes that element found ");

	}

	else

	{

		System.out.println("No that element is not found");

	}

	

	System.out.println(li.size());

*/




	
	List<String> names=new ArrayList<String>();

	Scanner in=new Scanner(System.in);

	for(;;)

	{

		System.out.println("Enter the student name: ");

		names.add(in.nextLine()); //taking input from user and adding in the list

		

		System.out.println("Yes to Continue; No to go Stop;");

		String str=in.nextLine();

		if(str.equals("No"))

		{

			break;

		}


	for(int i=0;i<names.size();i++)

	{

		System.out.println(names.get(i));

	}

	/* for each loop

	for(String s:names)

	{

		System.out.println(s);

	}
	*/
	
	

	}
	
	
	
	}
	
}




	

