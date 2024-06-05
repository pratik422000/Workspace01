
public class Without3rdVariable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a=10, b=20;
		
		System.out.println("Before swapping values are.. "+a+"  "+b);

		// Logic3 -use * and / operator
		// here a & b values should not be zero then only this logic will work
		
		a=a*b; //10*20= 200 latest value of a=200
		b=a/b; //200/20= 10 latest value of b=10
		a=a/b; //200/10= 20 latest value of a=20
		
		System.out.println("After swapping values are.. "+a+"  "+b);
	}

}
