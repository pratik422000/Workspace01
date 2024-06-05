package operators;

public class Example3 {
// Bitwise operator
	 
	public static void main (String[]args)
	{
		// AND operator &
		
		System.out.println((10>8)&(20<=20)&(50>40));  // T&T&T = True
		System.out.println((10>8)&(20<=20)&(50<40));  // T&T&F = False
		
		// Or Operator |
		System.out.println((10>8)|(20<=20)|(50<40));  // T&T&F = True
		System.out.println((10<8)|(20<20)|(50<40));  // T&T&F = False
		
		//XOR operator ^  
		
		System.out.println((20<=30)^(20>40));  // T&F = True   // If one of the condition have different value, XOR operator will write True in result.
		System.out.println((20<=30)^(20<40));  // T&T = False  // If both the conditions are same "True&True" OR "False&False", XOR operator will write False in result                                                          
		
		System.out.println((20<=30)^(20>30)^(10>8)^(30>=20)^(100==200));
		// T ^ F ^ T ^ T ^ F 
		// T ^ T ^ T ^ F 
		// F ^ T ^ F
		// T ^ F 
		// T                // in such case we will resolve by taking 2-2 conditions.
	
	
	}	
	
	
	
	
}
