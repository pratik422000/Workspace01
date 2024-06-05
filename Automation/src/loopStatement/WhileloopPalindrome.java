package loopStatement;

public class WhileloopPalindrome {

	// Java program to check Palindrome
	public static void main(String[] args) {
			
			 int number = 8444;
			 
		     int temp=number;            
			 
			 int reverse=0;
			
			 while(number> 0)   //  
			 {
				 int mod= number%10; 	//mod1=8448%10=8, mod2=844%10=4  mod3=4 mod4=8
				   
				 reverse= reverse*10+mod;  //8*10=80+4=84 , 844 8440+8= 8448
				      
				 number= number/10; //no1=844 , no2=84, no3=8
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
