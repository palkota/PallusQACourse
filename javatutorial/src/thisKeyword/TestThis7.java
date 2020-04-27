package thisKeyword;

//EXAMPLE OF THIS KEYWORD- REAL USAGE FOR CONSTRUCTOR CHAINING & CONSTRUCTOR CALL

class Student3
{  
	int rollno;  
	String name,course;  
	float fee;  
	
	Student3(int rollno,String name,String course)
	{  
		this.rollno=rollno;  
		this.name=name;  
		this.course=course;  
	}  
	
	Student3(int rollno,String name,String course,float fee)
	{  
		this(rollno,name,course);//reusing constructor. this should come before the code in next line  
		this.fee=fee;  
		//this(rollno,name,course);// writing this line after above line gives compile time error
	}  
	
	void display()
	{
		System.out.println(rollno+" "+name+" "+course+" "+fee);
	} 
	
}  

public class TestThis7 
{
	public static void main(String args[])
	{  
		Student3 s1=new Student3(111,"ankit","java");  
		Student3 s2=new Student3(112,"sumit","java",6000f);  
		s1.display();  
		s2.display(); 
	}
	
}
