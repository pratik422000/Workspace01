
public class Without3rdVariable4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a=10, b=20;
		
		System.out.println("Before swapping values are.. "+a+"  "+b);

		// Logic4 -use Bitwise XOR operator
		
		
		a=a^b; //10^20= 30 latest value of a=30
		b=a^b; //30^20= 10 latest value of b=10
		a=a^b; //30^10= 20 latest value of a=20
		
		
		/*    		Binary form
		 * a=10		1010        Comparing binary values of a&b let's see at the next line how to calculate
		 * b=20		10100		If the compared values are same value should be 1 and if the compared values are different value should be 0
		 * a^b=     11110  Convert this binary to decimal which is 30. So value of a^b is 30
		 */
		
		System.out.println("After swapping values are.. "+a+"  "+b);
	}
}
