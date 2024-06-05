package randomPrograms;

import java.util.Scanner;

public class CalculatorUsingSwitchCase {

	public static void main(String[] args) {

	
		String yn;
		do {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter first number");
		int no1=s.nextInt();
		System.out.println("Enter second number");
		int no2=s.nextInt();
		System.out.println("Select Symbol (+,-,*,/)");
		String sym =s.next();
		int res;
		switch(sym)
		{
		case"+": res=no1+no2;
		System.out.println("Addition is: "+res);
		break;
		case"-": res=no1-no2;
		System.out.println("Susbtration is: "+res);
		break;
		case"*": res=no1*no2;
		System.out.println("Multiplication is: "+res);
		break;
		case"/": res=no1/no2;
		System.out.println("Division is: "+res);
		break;
		default: System.out.println("Invalid Symbol");
		}
		
		System.out.println("Do you want to continue(Press Y for Yes & N for No)");
		yn = s.next();
		}
		while(yn.equals("y")|| yn.equals("Y"));

	}

}
