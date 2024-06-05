package loopStatement;

public class New {


	// Java program to check Palindrome
	public static void main(String[] args) {
		
		 int number = 84788;
		 
	     int temp=number;             //??
		 
		 int result=0;
		
		 while(number> 0) 
		 {
			 int mod= number%10;
			   
			      number/= 10;
			  
			      result= result*10+mod;  
		 }
		 	 
		 if(result==temp)
	     {
	    	 System.out.println(""
	    	 		+ "Is A Palindrom Number");
	     }
	        
		 else
	  {
		  System.out.println("Not A Palindrom Number");
	  }
	}
}
	
	
	

