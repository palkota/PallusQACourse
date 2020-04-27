package inhertance;

class ParentClass_S3
{

	void display1()

	{

		System.out.println("ParentClass_S1");

	}

}

class ParentClass_S4

{

	void display1()

	{

		System.out.println("ParentClass_S2");

	}

}



public class ChildClass_MP extends ParentClass_S3//,extends ParentClass_S4

{


	public static void main(String[] args) 
	{

		ChildClass_MP obj=new ChildClass_MP();

		obj.display1();// 

		//obj.display2();

	}


}

