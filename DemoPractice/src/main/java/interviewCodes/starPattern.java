package interviewCodes;

public class starPattern {
	int i;
	int j;
	int k;
	
	
	public static void main(String args[]) {
		
		
		
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 3; j++)
			{
				System.out.print("-");
			}	
			for (int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		
	}
}
