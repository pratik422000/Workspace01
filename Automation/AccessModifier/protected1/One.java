package protected1;

// here we are calling properties from class Two

public class One {

	 
	// We can call protected access modifier outside the class but in the same package only.
	// We can say access of "protected access modifier" is possible with different class of same package.
	//Calling properties in the different package are possible by using inheritance>> look into package "protected2"
	
	public static void main (String []args) {
		
		Two obj = new Two();
		obj.test();
		System.out.println(obj.a);
		
	}
	
}
