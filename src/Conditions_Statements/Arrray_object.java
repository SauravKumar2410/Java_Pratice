package Conditions_Statements;

import java.util.Arrays;

public class Arrray_object {
	
	public static void main(String[] args) {
		
		int a[] = new int[4];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		
		//System.out.println(a[0]);
		
	//	System.out.println(a[-1]);
		
		int len = a.length;
	//	System.out.println(len);
		int hi=len-1;
	//	System.out.println(hi);
		
		for(int i=0;i<a.length;i++) {    
			System.out.println(a[i]);
		
		}
		
		System.out.println(Arrays.toString(a));
		
		
		
	}

}
