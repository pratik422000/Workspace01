package ifelseStatement;

import java.util.Scanner;

public class Example1 {

//	public static void main(String[] args) {
//		
//	        
//	        String Account_Username = "Jyoti";
//	        String Account_holdername = "Jyoti";
//
//	        
//	        if (Account_Username.equals(Account_holdername)) {
//	        	
//	            System.out.println("Account_Username and Account_holdername are equal.");
//	        } 
//	         else {
//	            System.out.println("Account_Username and Account_holdername are not equal.");
//	        }
		
		
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Account_Username: ");
        String Account_Username = scanner.nextLine();

        System.out.print("Enter the Account_holdername: ");
        String Account_holdername = scanner.nextLine();

       
        if (Account_Username.equals(Account_holdername)) {
        	
            System.out.println("Account_Username and Account_holdername are correct.");
        }  
         else {
            System.out.println("Account_Username and Account_holdername are not equal. INCORRECTpratik");
        }
			
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
