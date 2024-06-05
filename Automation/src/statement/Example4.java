package statement;

public class Example4 {

	// If else ladder statement
	// Question is find rank(distinction= 75or above, first class(60 or above
	// 60-75). second class(45 or above 45-60), pass(35 or above 45-45), fail) of
	// the student if marks are 85.

	public static void main(String[] args) {

		int marks = 88;

		if (marks >= 75) {
			System.out.println("distinction");

		} else if ((marks >= 60) && (marks < 75)) {
			System.out.println("First class");

		} else if ((marks >= 45) && (marks < 60)) {
			System.out.println("Second class");

		} else if ((marks >= 35) && (marks < 45)) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");
		}
	}
}
