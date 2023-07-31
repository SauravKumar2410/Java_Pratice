package Conditions_Statements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String_compare {

	public static void main(String[] args) {
		
		List<String> li =new ArrayList<>(); 
		li.add("Dental");
		li.add("Absence");
	//	li.add("Disability");
		
		if(li.contains("Dental") && li.contains("Absence"))
		{
			System.out.println("true");
		}
		else if(li.contains("Disability") && li.contains("Dental"))
		{
			System.out.println("true");
		}
		
		else 
		{
			System.out.println("false");
		}
	}
}
