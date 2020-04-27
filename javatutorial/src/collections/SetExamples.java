package collections;

import java.util.HashSet;

public class SetExamples
{
	public static void main(String[] args)
	{
	//Creating HashSet and adding elements  

	    HashSet<String> set=new HashSet<String>();  

	           set.add("One");    
	           set.add("Two");    
	           set.add("Three");   
	           set.add("Four");  
	           set.add("Five");  

	           for(String s:set)
	           {
	        	   System.out.println(s);
	           }

	}
}
