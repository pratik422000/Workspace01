package general_Pattern_Programs;

public class Left_StarPattern {

	// Nested For loop

//	public static void main(String args[]) {
//
//		for (int i = 1; i <= 5; i++){
//			
//			for (int j = 1; j <= i; j++){
//				
//				System.out.print("*");
//			}
//			System.out.println(); // To move to the next line 
//		}
//	}
	
	int i;
	int j;
	int k;
	
	
	public static void main(String args[]) {
		
		
		
		for (int i = 1; i <= 5; i++){
			
			for (int j = 1; j <= 5; j++){
				
				System.out.print("-");
			}
			for (int k=1; k<=i; k++) {
				System.out.print("#");
			}
		}
	
		System.out.println();
	}
	
	
}
