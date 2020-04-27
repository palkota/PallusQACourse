package interfaceExamples;

//Since Java 8, we can have method body in interface. But we need to make it default method. 


	interface Drawable5
	{  
		void draw();  // one abstract method of interface
		
		default void msg() //one method with body/implementation
		{
			System.out.println("default method");
		}  
	}  


	class Rectangle5 implements Drawable5
	{  
		public void draw() //class implements the abstract method of interface
		{
			System.out.println("drawing rectangle");
		}  
	} 
	
	class InterfaceWithDefault
	{  
		public static void main(String args[])
		{  
			Drawable5 d=new Rectangle5();  
			d.draw();  
			d.msg();  
		}
		
	}  
	

