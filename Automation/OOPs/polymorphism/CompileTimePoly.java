package polymorphism;

public class CompileTimePoly {
	
	//At compile time, java knows which method to call by object is known as compile time polymorphism.

	// In a class
	// multiple methods having same name
	// but different argument
	
	public void test() 		// multiple methods having same name
	{
		System.out.println("Test method without argument");
	}
	
	public void test(int a)  // multiple methods having same name, but different argument
	{
		System.out.println("Test method int with argument");
	}
	
	
	//In a class we have multiple methods having same name, but different arguments is known as method overloading.
	
	
	public static void main (String [] args) 
	{
	
		CompileTimePoly obj = new CompileTimePoly();
		obj.test();         // Here is no any error within compile time. So we are sure that the method will definitely get call after run the program
		obj.test(20);		// Here is no any error within compile time. So we are sure that the method will definitely get call after run the program
							// So before running the program within compile time itself we got to know that this methods definitely will get call and that's what compile time polymorphism is!
							//At compile time, java knows which method to call by object is known as compile time polymorphism.
	}
	
	
}
