package TestScenarios;

public class test {
	
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

}
}
