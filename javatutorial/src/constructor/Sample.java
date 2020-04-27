package constructor;

public class Sample
{
  
  private String name;
private int rollno;

Sample(String name,int rollno) //constructor
  {
	  this.name=name;
	  this.rollno=rollno;
  }
	
  void displayDetails()
  {
	  System.out.println(name+" "+rollno);
  
  }
  
  public static void main(String[] args)
	{
	  Sample s1=new Sample("Prem",34);
	  Sample s2=new Sample("Somi",67);
	  s1.displayDetails();
	  s2.displayDetails();
		
	}

}
