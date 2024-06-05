package casting_OR_conversion;

public class Child1 extends Parent1 {

	public void wow () {
		
		System.out.println("wow");
		
	}
	
	public static void main (String [] args) {
		
		Parent1 p =new Child1(); 
		p.show();					// Up Casting // By using upcasting we can call methods of parent class by creating object of child class with the referance of parent class.
		//p.wow();					// But we can not call methods of Child class
		
		// So how to perform down casting.
		
		Child1 C =(Child1) p; // down casting. To perform down casting first we have to perform upcasting.
		C.show();
		C.wow();
	}
	
	
	
	
	
}
