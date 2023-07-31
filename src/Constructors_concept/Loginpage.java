package Constructors_concept;

public class Loginpage {

	String password;
	String username;
	
	public Loginpage(String username) {
		this.username = username;
	}
	
	public Loginpage(String password, String username) {
		this.password = password;
		this.username = username;
	}
	
}
