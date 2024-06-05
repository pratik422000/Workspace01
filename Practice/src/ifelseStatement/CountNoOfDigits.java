package ifelseStatement;

public class CountNoOfDigits {

	public static void main(String[] args) {
		
		
		int num=13823478;
		
		int count=0;
		
		while (num>0)
		{
			
	    num = num/10;
			count++;
		}
			System.out.println("Count of numbers"+ count);
		
	}

}
