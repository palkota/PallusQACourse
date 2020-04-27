package thisKeyword;

// USING THIS KEYWORD-TO INVOKE CURRENT CLASS METHOD

class A2
{  
	void m()
	{
		System.out.println("hello m");
	}  
	
	void n()
	{  
		System.out.println("hello n");  
		//m();//same as this.m()  
		this.m();  //calling current class method
	}  
	
}   

public class TestThis4
{
	public static void main(String args[])
	{  
		A2 a=new A2();  
		a.n();  // first method n() is invoked and in that method m() is invoked, as seen in output
		
	} 
	
}
