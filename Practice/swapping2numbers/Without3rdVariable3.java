
public class Without3rdVariable3 {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		System.out.println("Before swapping values are.. "+a+"  "+b);
		
		// Logic5- single statement
		
		  b=a+b -(a=b); // execution will start from right 
		// 10+20=30     // as a=b then a=20
		//b=  30 - 20 = 10   Now latest value of b=10
		
		  System.out.println("After swapping values are.. "+a+"  "+b);
		  
		  
		  
	}

}
