
public class WithoutThirdVariable {

	public static void main(String[] args) {
		
int a=10, b=20;
		
		System.out.println("Before swapping values are.. "+a+"  "+b);

		// Logic2 -use + and - operator
		
		a=a+b; //10+20=30 latest value of a=30
		b=a-b; //30-20=10 latest value of b=10
		a=a-b; //30-10=20 latest value of a=20
		
		System.out.println("After swapping values are.. "+a+"  "+b);
	}

}
