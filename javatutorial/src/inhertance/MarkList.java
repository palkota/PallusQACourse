package inhertance;

public class MarkList extends FindTotal
{
	double mark1;

	double mark2;

	double mark3;

	

	MarkList(double p1,double p2,double p3)

	{

		mark1=p1;

		mark2=p2;

		mark3=p3;

	}

	

	void print()

	{

		double t=total(mark1, mark2, mark3);

		FindAverage fa=new FindAverage();

		double avg=fa.average(t, 3);

		

		System.out.println("Total: "+t);

		System.out.println("Average: "+avg);

	}

	public static void main(String[] args) {

		MarkList s1=new MarkList(54,65,89);

		s1.print();

	}
	
}
