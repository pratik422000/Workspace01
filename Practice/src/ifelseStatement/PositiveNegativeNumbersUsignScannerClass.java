package ifelseStatement;

import java.util.Scanner;

public class PositiveNegativeNumbersUsignScannerClass {

	public static void main (String []args) {
		
		int n;
		
		System.out.println("Enter any number +ve or -ve");
	
		Scanner obj =new Scanner(System.in);
		n= obj .nextInt();
		
		if (n>=0)
		{
			System.out.println("Is a positive number");
		}
		else
		{
			System.out.println("Is a negative number");
		}
		
		
	}
	
	

}
