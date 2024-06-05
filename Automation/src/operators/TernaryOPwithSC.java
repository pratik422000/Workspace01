package operators;

import java.util.Scanner;

public class TernaryOPwithSC {

	//To Find largest of 3 numbers
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		System.out.println("Enter third number");
		int c = sc.nextInt();
		
  // Use Ternary operator. a>b ? a:b;
		
		
		int largest1=  a>b ? a:b;
		int largest2= c>largest1 ? c:largest1 ;
		
		// Another way to write int largestnum= c> ( a>b ? a:b;) ? c:( a>b ? a:b;)
		
		System.out.println(largest2+ "is the largest number");
	}

}
