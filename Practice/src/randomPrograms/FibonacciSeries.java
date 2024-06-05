package randomPrograms;

// Fabonacci series is a series of digits which are addition of last digits.

public class FibonacciSeries {

	public static void main(String[] args) {
		 int a=0, b=1;
		 int c;
		 for (int i=1; i<=10; i++) 
		 {
			 c=a+b;
			 System.out.print(""+c);
			 a=b;
			 b=c;
			 
		 }

	}

}
