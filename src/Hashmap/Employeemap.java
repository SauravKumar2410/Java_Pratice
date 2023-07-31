package Hashmap;

import java.util.HashMap;

public class Employeemap {
	
	public static void main(String[] args) {
		HashMap<String,String> map =new HashMap<String,String>();
		map.put("Tom","SDET1");
		map.put("peter","SDET2");
		
		System.out.println(map.get("Tom"));
		
		
	}
	
	
	

}
