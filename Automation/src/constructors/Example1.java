package constructors;

public class Example1 {

		double x;
		double y;
		
		public Example1()
		{
			
		System.out.println("Initlize the value");
		x = 10.20;
		y = 20.30;
	
		}
		
		public void test()
		{
			
		System.out.println("The addition of two numbers is = ");
		System.out.println(x+y);
		
		}
		
		public static void main(String args[])
	 {
		Example1 a = new Example1();
	    a.test();
		}
	
	
}
