package Array_list_concept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class More_list {
	
	public static void main(String[] args) {

		// syntax of array list with data type defined
		ArrayList<String> li = new ArrayList<String>();
		//li.add("Dental");
		//li.add("Absence");
		//li.add("Disability");
		//syntax of set
		/*
		 * Set<String> se = new HashSet<String>(); se.add("saurav");
		 */
		for(String e:li)
		{
			if(e.equalsIgnoreCase("Dental") || e.equalsIgnoreCase("Absence") || e.equalsIgnoreCase("Disability")) 
			{
				System.out.println("true");
				break;
			}
			else {
				System.out.println("false");
			}	
			System.out.println("Null");
		}
		
		
	
		
		
	}

}
