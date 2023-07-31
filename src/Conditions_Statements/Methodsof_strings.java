package Conditions_Statements;

import java.util.Arrays;

public class Methodsof_strings {
	public static void main(String[] args) {
		String browser ="Chrome ";
		
		System.out.println(browser.repeat(2));
		System.out.println(browser.contains("me"));
		
		//split 
		String lang = "_Java_Python_Dotnet_Ruby";
		String l [] = lang.split("_");
		
		System.out.println(Arrays.toString(l));
		System.out.println(l[1].length());
		
		// Question
		String pop= "xXSeleniumxXXtestingXX";
		
		System.out.println(pop);
		
		
		
		
		
		
	}

}
