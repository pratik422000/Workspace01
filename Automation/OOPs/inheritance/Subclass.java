package inheritance;

public class Subclass extends SuperClass{

	/* Inheritance in java is a mechanism in which one class acquires all the properties and behaviors of another class with the help of extends keyword.
	 * Also we can say subclass can acquires the properties of superclass with the help of extends keyword.
	 * 
	 * 
	 */
	
	public void bike() 
	{
		System.out.println("Son's bike");
	}

	public void gold() 
	{
		System.out.println("Son's gold");
	}

	public static void main (String [] args) {
		
	Subclass sub = new Subclass();
	sub.bike();
	sub.gold();
	sub.home();
	sub.car();
	}
}
