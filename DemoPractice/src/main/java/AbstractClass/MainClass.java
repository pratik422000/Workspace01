package AbstractClass;

public class MainClass {

	public static void main(String[] args) {
		
		ImplementClass obj = new ImplementClass();
		obj.wheels();  // abstract m
		obj.test();    // Non-ab M
		ImplementClass.test2();    // STATIC m 
	
	}

}
