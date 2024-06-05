package variables;

public class StaticVariable {
 
	// The variables which are declared inside the class body but outside the method body with static keyword before it. EX-static int a=80
	// Accessible anywhere in the class.
	// Accessible to any method.
	
	static int a=20;
	static int b=40;
	
	public static void test1() {          // Static method - Accessible to any method.
		
		System.out.println(a+b);	
	}
	
	public void test2() 				// Non-static method-Accessible to any method.
	{
		System.out.println(a+b);
	}
	
	public static void main (String []args) {			//All methods should call within main method only
	
		StaticVariable.test1();			// Called Static method.
		
		StaticVariable x = new StaticVariable(); // called non static method by creating an object
		x.test2();
	}
}
