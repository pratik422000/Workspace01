package basicString;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
//For palindrome we have to reverse the string first and then just compare it using if statement whether the reversed string is same as original string.
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String rev = "";
	
		
		for (int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(str.equals(rev))
			
		//if(str==rev) // ?? not able to use this ??
		 {
//			 System.out.println("Is a palindrome string");
		 }
		 else
		 {
			 System.out.println("Not a palindrome string");
		 }
	}

}
