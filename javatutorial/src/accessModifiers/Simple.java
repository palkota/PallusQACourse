package accessModifiers;

// EXAMPLE OF PRIVATE ACCESS MODIFIER

//A class contains private data member and private method. We are 
//accessing these private members from outside the class, so there is a compile-time error.

class A
{  
	//private int data=40;  
	//private void msg()
	{
		System.out.println("Hello java");
	}  
} 

public class Simple
{
	public static void main(String args[])
	{  
		  // A obj=new A();  
		  // System.out.println(obj.data);//Compile Time Error  
		  // obj.msg();//Compile Time Error  
		   
	}  

}
