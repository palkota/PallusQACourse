package class_and_objects;

public class CalculateTotalAverage
{
	int mark1;

	int mark2;

	

	int calculate_total()

	{

		int total=mark1+mark2;

		return(total);

	}

	

	void calculate_average(int t,int noofsub)

	{

		int avg=t/noofsub;

		System.out.println("Average: "+avg);

	}

	

	public static void main(String[] args) {

		CalculateTotalAverage obj=new CalculateTotalAverage();

		obj.mark1=56;

		obj.mark2=64;

		int c=obj.calculate_total();

		System.out.println("Total: "+c);

		obj.calculate_average(c,2);

	}


}
	
