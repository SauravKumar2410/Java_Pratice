package Abstraction;

public class Login extends Page{

	@Override
	public void title() {
		System.out.println("login page ");
		
	}

	@Override
	public void url() {
		
		System.out.println("login page url ");
	}
	@Override
	public void calculatePageload()
	{
		System.out.println("calculate page url ");
	}
}
