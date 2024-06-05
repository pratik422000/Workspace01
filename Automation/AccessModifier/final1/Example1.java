package final1;

public final class Example1 { // if final keyowrd used with the class >> impact> inheritance is not possible

	final int a=10;  		// final keyword is possible to declare with variable
	// impact of final keyword if using it with variable -  not able to change value further.
	
	// final Example1()  	//  final keyword is not possible to define with constructor
	
	Example1()
	{
		System.out.println("constructor");
	}
	
	public final void test() 		// final keyword is possible to declare with method.
	{								// If final keyword declared with the method we will not able to override the method >> look into class Example2.
		a=30; 	// 
		
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		
		Example1 obj = new Example1();
		obj.test();
		
	}

}
