package randomPrograms;

public class FabonacciSeriesUsingRecursion {

	// Recursion is a process in which a function calls itself directly or indirectly.
	
	
	int a=0, b=1,c;
	public static void main(String[] args) {
		
		FabonacciSeriesUsingRecursion obj = new FabonacciSeriesUsingRecursion();
		obj.printFib(10);
	}

	void printFib(int i)
	{
		if(i>=1)
		{
			 c=a+b;
			 System.out.print(""+c);
			 a=b;
			 b=c;
			 printFib(i-1);// decrement
		}
	}
	
	
	
	
	
	
	
}
