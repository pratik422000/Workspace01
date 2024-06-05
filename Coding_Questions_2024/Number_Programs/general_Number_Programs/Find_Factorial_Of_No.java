package general_Number_Programs;

public class Find_Factorial_Of_No {

	//// Java program to find factorial of 5. 1*2*3*4*5
	
	public static void main(String[] args) {
		
		int n=8;
		int factorial=1;
		
		for(int i=1; i<=n; i++) {
			factorial=factorial*i;
		}
		
		System.out.println(factorial);
	}

}
