package interfaceExamples;

// In a real scenario, an interface is defined by someone else, 
//but its implementation is provided by different implementation providers.
//Moreover, it is used by someone else. The implementation part is hidden by
//the user who uses the interface.


//Interface declaration: by first user  
interface Drawable
{  
	void draw();  
}  

//Implementation: by second user  
class Rectangle implements Drawable 
{  
	public void draw()
	{
		System.out.println("drawing rectangle");
	}  
}  

class Circle implements Drawable  //multiple classes implementing the interface draw() method with their own implentation
{  
	public void draw()
	{
		System.out.println("drawing circle");
	}  
}  

//Using interface: by third user 
public class TestInterface1
{
	public static void main(String args[])
	{  
		Drawable d=new Circle();// syntax connecting interface object to particular class 
		d.draw();  // so this calls the draw() method of circle class only
	}

}
