package loopStatement;

public class WhileloopReverseNo {

	// Java program to reverse a number

	public static void main(String[] args) {

		int n = 1234;

		int reverseno = 0;

		while (n > 0) {
			int mod = n % 10;

			reverseno = reverseno * 10 + mod;

			n /= 10;
		}

		System.out.println("Reversed number: " + reverseno);

	}

}
