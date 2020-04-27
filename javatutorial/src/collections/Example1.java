package collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Example1 
{
	public static void main(String[] args)
	{
		/*
         * new list with unique elements
         * Sample List : [1,2,3,3,3,3,4,5]
         * Unique List : [1, 2, 3, 4, 5]
        */
		
		List<Integer> li=new ArrayList<Integer>();
		List<Integer>ans=new ArrayList<Integer>();
		
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(3);
		li.add(3);
		li.add(3);
		li.add(4);
		li.add(5);
		
		for(int i=0;i<li.size();i++)
		{
			if(ans.contains(li.get(i))==false)
			{
				ans.add(li.get(i)); // adding contents of List-li to List-ans
			}
		}//end for
		
		System.out.println(ans);
		
	}
}
