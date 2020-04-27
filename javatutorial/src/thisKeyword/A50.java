package thisKeyword;

//EXAMPLE OF THIS KEYWORD- to print the reference id

public class A50 
{
	void m()
	{  
		System.out.println(this);//prints same reference ID  
	}  
		
	public static void main(String args[])
	{  
		A50 obj=new A50();  
		System.out.println(obj);//prints the reference ID  
		obj.m();  
	}  

}
