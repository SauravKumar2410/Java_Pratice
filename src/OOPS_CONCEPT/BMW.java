package OOPS_CONCEPT;

public class BMW extends Car{ // in java multiple inheritance is not possible 
	
	@Override
	public void start()
	{
		System.out.println("BMW --- Start");
	}
	
	
	public void autoparking()
	{
		System.out.println("BMW --- autoparking");
	}
}
