package loopStatement;
	
public class Example1Forloop {
	
	// Syntax- for(initialization; condition; increment/decrement)
	//			{ statements;
	//				}
	
//// Printing 1 to 100 even numbers using for loop.
	
	public static void main(String []args) 
	{
		
		for (int a= 1; a<=100; a++)   // for loop
		{
			if ((a%2)==0)   // To find even numbers
			System.out.println(a);
		}
		
		
	}
	
}
