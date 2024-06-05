package loopStatement;

public class CheckPrimenumber {

	public static void main (String args[])
	{
		
	int number= 9    ;
	 int count=0;
	 
	 // logic-1 
	 
	for (int i = 1; i<=number; i++) {
		
		 if(number%i == 0) 
		 {
			count++;
		 }
	 } 
	 
		 if(count==2)
		 {
			 System.out.println("Is a prime");
		 }
		 else {
			  System.out.println("Not a prime");
		 }
	 
	   /*
	   
	 //Logic-2
	 
	 for (int i = 2; i<=number-1; i++) {
			
		 if(number%i == 0)
		 {
			count++;//count= 1,
		 }
	 } 
	 
		 if(count>0) // count 1>0
		 {
			 System.out.println("Not a prime"); 
		 }
		 else {
			 System.out.println("Is a prime");
		  
		 }
	*/
		
		
	}
}
