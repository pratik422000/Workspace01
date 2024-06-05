package protected1;

// Access modifier - protected 

public class Two {
//protected class Two { 		// Declaration is not possible with class

	protected int a=20; 		// Declaration possible with variable
	
	protected Two()				// Declaration possible with constructor
	{
		System.out.println("Default constructor");
	}
	
	protected void test()		// Declaration possible with method.
	{ 
		System.out.println("Non static method");
		
	}
	
	public static void main (String []args) {
		
		// Access possible within class 
		
	Two obj = new Two();
	obj.test();
	System.out.println(obj.a);
		
	
	}
}
