package OOPS_CONCEPT;

public class TestCar {
	public static void main(String[] args) {
		
		
		// Run time polymorphism 
		//Method overriding
		
		
		BMW b = new BMW();
		
		b.start();  //Start method is in both parent class and child class , Overridden 
		b.stop(); //Stop method is in only in parent class , at runtime java will decide 
		b.refuel(); // refuel method is only in parent class.
		b.engine();

		
		System.out.println("---------");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		
		
		
		
		
		
	}
	

}
