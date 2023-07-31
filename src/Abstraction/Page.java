package Abstraction;

public abstract class Page {
	
	public abstract void title();
	public abstract void url();
	
	public void calculatePageload()
	{
		System.out.println("page is loading ----10 sec");
	}

	public final void display()
	{
		System.out.println("disaply --- ");
	}
}
