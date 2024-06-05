package AbstractClass;

public abstract class ExampleAbstract {
	
//	int a=10;
//	
//	public abstract void start();  //Abstract Method
//	
//	void stop() {}	//Non- Abstract method  // Concrete Method.	
//	
//	ExampleAbstract() {}		// Constructor are allowed.
//	
//	public static void Return() { }		// static methods are allowed.
	
	int a=20;
	public abstract void wheels (); // abstract method   // % of abstraction achieved in java are depend on abstract method.
	
	public void test()   // non abstract method
	{
		System.out.println("This is non abstract");
	}
	
	ExampleAbstract()
	{
		System.out.println("This is Constructor"); // Constructors are allowed in abstract class
	}
	
	public static void test2 ()				// Static methods are allowed in abstract class.
	{
		System.out.println("This is a static method");
		
	}
}
