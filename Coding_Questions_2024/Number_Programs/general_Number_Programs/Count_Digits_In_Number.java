package general_Number_Programs;

public class Count_Digits_In_Number {

	public static void main(String[] args) {
	
		int n= 4444;
		int count=0;
		
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println("Count of numnber is: "+count);

	}

}
