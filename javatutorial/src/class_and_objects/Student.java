package class_and_objects;

public class Student
{
	//Properties

		int rollno;

		String name;

		String fees_status="Not Paid";

		

		Student(int rollno, String name)

		{

			this.rollno=rollno;

			this.name=name;

		}

		Student(int rollno, String name,String fees_status)

		{

			this.rollno=rollno;

			this.name=name;

			this.fees_status=fees_status;

		}

		
		//Behaviors

		void printDetails()

		{

			System.out.println(rollno+" "+name+" "+fees_status);

		}

		

		public static void main(String[] args)
		{

			Student s1=new Student(34,"Prem");

			Student s2=new Student(56, "somi");

			Student s3=new Student(1, "anish","Paid");

			s1.printDetails();

			s2.printDetails();

			s3.printDetails();

		}

	}
