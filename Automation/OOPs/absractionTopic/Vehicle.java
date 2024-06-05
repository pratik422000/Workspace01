package absractionTopic;

public abstract class Vehicle { // Abstract class is a   class which is declared with abstract keyword 
	
	int a=20;
	public abstract void wheels (); // abstract method   // % of abstraction achieved in java are depend on abstract method. 
	
	public void test()   // non abstract method
	{
		System.out.println("This is non abstract");
	}
	
	Vehicle()
	{
		System.out.println("Constructor"); // Constructors are allowed in abstract class
	}
	
	public static void test2 ()				// Static methods are allowed in abstract class.
	{
		System.out.println("Test2 Static method");
		
	}
	
}
