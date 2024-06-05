package NestedForLoop;

public class WeeksAndDays {
	
	// Program to display 3 weeks and 7 days of each week.

	public static void main (String []args) {
		

	  int weeks = 3;
	    int days = 7;

	    // outer loop prints weeks
	    
	 for (int i = 1; i <= weeks; ++i) 
	 { 		
		 System.out.println("Week: " + i);
		 
	      for (int j = 1; j <= days; ++j)    // inner loop prints days
	      {              
	    	  System.out.println("  Day: " + j);
	        
		  } // End of inner loop
	
	      
	  } // End of outer loop
	 
		
	
	 
	 
	}
}
