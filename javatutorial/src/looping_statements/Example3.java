package looping_statements;

import java.util.ArrayList;

import java.util.Collection;

import java.util.Collections;

import java.util.List;


public class Example3 
{
	public static void main(String[] args) 
	{

		int t=1;

		int N=2;

		List<String> name= new ArrayList<String>();

		name.add("hackerrank");

		name.add("google");

		Collections.sort(name);

		System.out.println(name.get(0));

	}
	
	
}
