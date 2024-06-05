package interface1;

public class ImplementaitonClass implements Example1{
	
	// "extends" not works to fetch properties interface into class.
	// to fetch properties from interface into class we have to use "implements"
		

	@Override
	public void test() {
		System.out.println(a+10);
		
	}

	@Override
	public void start() {
		System.out.println(a+20);
		
	}

	@Override
	public void stop() {
		System.out.println(a+30);
		
	}

	
	

}