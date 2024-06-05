package loopStatement;

public class WhileloopPalindrome {

	// Java program to check Palindrome
	public static void main(String[] args) {
			
			 int number = 8448;
			 
		     int temp=number;            
			 
			 int reverse=0;
			
			 while(number> 0) 
			 {
				 int mod= number%10;
				   
				 reverse= reverse*10+mod;  
				      
				      number= number/10;
			 }
			 	 
			 if(reverse==temp)
		     {
		    	 System.out.println("Is A Palindrom Number");
		     }
		        
			 else
		  {
			  System.out.println("Not A Palindrom Number");
		  }
		
		}
}
