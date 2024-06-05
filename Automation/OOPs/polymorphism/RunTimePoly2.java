package polymorphism;

public class RunTimePoly2 extends RunTimePoly1 { // inheritance relationship between classes.

	// Considering as a child class
	
	public void bike()
	{
		System.out.println("Son's bike");
	}
	public void flat() 		// If the sub class have the same method, 
							//as declared in the parent class, it is known as method overriding.
	{
		System.out.println("Son's flat"); 
	}
	
	public static void main (String [] args) {
		
		RunTimePoly2 obj =new RunTimePoly2();
		obj.bike();
		obj.farm();
		obj.home();
		obj.flat(); 	// now here which "flat" method will get call? is it from parent class or child class?
						// So here we are not sure which method will get call 
						// So in the compile time we are not able to decide which method will get call and for that we have to run our program
						// as we run our program we will get to know which method is being called and that's why we are calling it as a run time Polymorphism.
		
		// Run the program
		// here we got t know that child class method got called "Son's flat"
		// and we can say now method from parent class get overridden.
		// if we want to execute the overridden method for that we need to create an object of parent class
		
		RunTimePoly1 obj2= new RunTimePoly1();
		obj2.flat(); 
		
		
	}
}
