package collections;
import java.util.HashMap;
import java.util.Map;

public class MapExamples
{
	public static void main(String[] args) {



		Map obj=new HashMap();

		obj.put("First Name","Prem");
		obj.put("Second Name","Kumar");
		obj.put("School","Don Bosco");

		obj.remove("Second Name");
		System.out.println(obj);

		
		for (Object x : obj.keySet())
		{
			System.out.println(obj.get(x));
		}
	
	}
}
