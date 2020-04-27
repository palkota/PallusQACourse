package interfaceExamples;

//Since Java 8, we can have static method in interface.

interface Drawable6
{  
	void draw();  // one abstract method of interface
	
	static int cube(int x) //one method with body/implementation declared static
	{
		return x*x*x;
	}  
}  

class Rectangle6 implements Drawable6
{  
	public void draw() // class implements abstract method of interface
	{
		System.out.println("drawing rectangle");
	}  
}  

public class InterfaceWithStatic 
{
	public static void main(String args[])
	{  
		Drawable6 d=new Rectangle6();  // syntax to connect interface to a particular class
		d.draw();  
		System.out.println(Drawable6.cube(3)); 
		
	}
	
}
