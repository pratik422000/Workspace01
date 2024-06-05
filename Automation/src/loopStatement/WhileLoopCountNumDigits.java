package loopStatement;

public class WhileLoopCountNumDigits {

	// To find number of digits in an integer.
		
	public static void main(String[] args) {
		
		int n=65768;
		
		int counter= 0;
				
		while (n>0)
		{
			n = n/10;
			counter++;
		}
		System.out.println("number of digits" +  counter);
		}

}
