package thisKeyword;

//EXAMPLE OF THIS KEYWORD-to pass as an argument in the method. this is mainly used in Event Handling

public class S2
{
	void m(S2 obj)
	{  
		  System.out.println("method is invoked");  
	}
	
	void p()
	{  
		  m(this);  
	} 
	
	public static void main(String args[])
	{  
		  S2 s1 = new S2();  
		  s1.p();  
	}  

}
