package practice_2024;

public class demo24 {
	
	 int price = 0;    // static variable.
	int age=25;				// Non static // Instance variable // Global variable.

	public static void main(String[] args) {
		
	
		System.out.print("nothing");
		demo24.pratik();
		demo24 demo24 = new demo24();
		demo24.sanjana();
	}
	
	public static void pratik() {
		System.out.print("I'm pratik hare");
		System.out.println(price);
	}
	
	public void sanjana() {
		
		int price = 44;  // Local variable 
		
	}

}
