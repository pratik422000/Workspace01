package variables;

public class GlobalVariable { // is also called as non-static variables

	// The variables which are declared inside the class but outside the method body.
	// Access within non-static method only.
	
	int x=20;   // declared inside the class body but outside the method body.
	int y=40;	// declared inside the class body but outside the method body.
	
	public void test1()
	{
		System.out.println(x*y);   // Accessed within non-static method.
	
	}
	
	public static void main (String args[])
	{
		GlobalVariable p = new GlobalVariable(); // Called non-static method by creating an object. 
		
		p.test1();
		
		
	}
	
	
}
