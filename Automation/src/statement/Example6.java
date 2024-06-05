package statement;

public class Example6 {
	
	// find leaf year using if else statement.

	public static void main (String []args) {
		
		
		int year = 2021;
		
		
		// leap year are divisible by 4 
		
		// leap years are either divisible by 400 or not divisible by 100
		
		if ((year % 100 != 0 && year % 400 == 0))
		{
			System.out.println("is a leap ");
		}
		else {
			System.out.println("not a leap year");
		}
		
	}
	
	
	
	
	
	
	
}
