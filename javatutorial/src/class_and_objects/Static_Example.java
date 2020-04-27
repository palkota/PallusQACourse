package class_and_objects;

public class Static_Example 
{
	/**

	 * @param args

	 */

	//DataMembers

	String name;

	int rollno;

	static int count;

	

	//Member functions

	void addStudent(String n,int r)

	{

		name=n;

		rollno=r;

		count++;

	}

	void displayDetails()

	{

		System.out.println(count+" "+name+" "+rollno);

	}

	/*

	 * Static member can have only the static member

	 */

	static void totalStudent()

	{

		System.out.println(count);

	}

	

	public static void main(String[] args) {

		Static_Example s1=new Static_Example();

		Static_Example s2=new Static_Example();

		s1.addStudent("Prem", 34);

		s1.displayDetails();

		s2.addStudent("Somi", 39);

		s2.displayDetails();

		totalStudent();

	}


	
}
