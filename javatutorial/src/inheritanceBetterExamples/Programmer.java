package inheritanceBetterExamples;
//SIMPLE INHERITANCE EXAMPLE

class Employee
{  
	 float salary=40000;  
}  

public class Programmer extends Employee
{
	int bonus=10000;
	
	 public static void main(String args[])
	 {  
	   Programmer p=new Programmer();  // creating child class object
	   System.out.println("Programmer salary is:"+p.salary);  //accessing parent class variable with child class object
	   System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  

}
