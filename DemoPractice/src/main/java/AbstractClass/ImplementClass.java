package AbstractClass;

// This is called as concrete class : A class which is responsible to implement all abstract methods form abstract class.

public class ImplementClass extends ExampleAbstract {

	@Override
	public void wheels() {
		System.out.println(a + "This is an abstract method");
		
	}


	ImplementClass(){
		System.out.println("I'm constructor form ImplementClass");
	}
	
}
