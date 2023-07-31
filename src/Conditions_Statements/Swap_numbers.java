package Conditions_Statements;

public class Swap_numbers {

	public static void main(String[] args) {
		int x= 5;
		int y= 4;
		
		x = x + y;  //x = 9
		y = x - y;  //y = 5
		x = x - y;	// x= 4
		
		System.out.println(x);
		System.out.println(y);
	}
	
}
