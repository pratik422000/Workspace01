package general_Number_Programs;

public class Find_Table {
	
	// Nested For loop

	// java program for table of 3
	
	public static void main(String[] args) {
    
	for(int number=1; number<=10; number++)
	{
		System.out.println("Multiples of "+number);
		
		for(int multiplier=1; multiplier<=10; multiplier++)
		{
			int product = number*multiplier;	
			
			System.out.println(product);	
		}
		System.out.println("");
	}
	}
	}

