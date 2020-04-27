package thisKeyword;

//EXAMPLE FOR "THIS" KEYWORD-1) TO REFER TO CURRENT CLASS INSTANCE VARIABLE

class Student
{  
int rollno;  //instance variables
String name;  
float fee; 

	Student(int rollno,String name,float fee)//constructor with arguments/local variables
	{  
		this.rollno=rollno;  //assigning arguments with same names to instance variables of class with same names
		this.name=name;    // without this keyword we dont get correct output
		this.fee=fee;  
	}  
	
	void display()
	{
	System.out.println(rollno+" "+name+" "+fee);
	} 
	
}  //class  student ends


class TestThis2 
{
	public static void main(String args[])
	{  
		Student s1=new Student(111,"ankit",5000f);  
		Student s2=new Student(112,"sumit",6000f);  
		s1.display();  
		s2.display(); 
	}

}
