package Array_list_concept;

import java.util.ArrayList;

public class Java_06_ArraylistCocnept {

	public static void main(String[] args) {
		
	ArrayList ar=new ArrayList();
	//System.out.println(ar);
	ar.add(100);
	ar.add(200);
	ar.add("testing");
	
	//System.out.println(ar.size());
	//System.out.println(ar.get(1));
	//System.out.println(ar.get(3));	
	
	// to print all the values from the for loop
	for(int i=0;i<ar.size();i++)
	{
		System.out.println(ar.get(i));
	}
	System.out.println("------");
	
	// for each loop iteration method 
	for(Object e:ar)
	{
		System.out.println(e);
	}
	
	System.out.println("------");
	ArrayList<String> snames = new ArrayList<String>();
	
	snames.add("TOM");
	snames.add("Ravi");
	snames.add("Chitra");
	
	System.out.println(snames);
	
	for(String s : snames)
	{
		if(s.equals("TOM"))
		{
			System.out.println("Hi tom");
           break;
		}
	}
	System.out.println(snames);
	System.out.println("--------");
	for(int s=snames.size()-1; s>=0;s--)
	{
		System.out.println(snames.get(s));
	}
	
	
	System.out.println("----using for each loop print the string in reverse order-----");
	
	
	for(String s:snames)
	{
		

		
	}
	
	
	
	
	
	
		
	}

}
