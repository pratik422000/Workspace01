package encapsulation;

// Encapsulation is a process of wrapping code together into single unit (class)

public class Bank {
	
	
	//
	
	private double balance= 20000;  // In the encapsulation all the data members in the class should be private
	
	public void depositeMoney (double cash)  // setter method //if we are changing the value ( +, -, *, /) in the method is called as setter method // Here we are setting the value in the method that's why it is called as setter method.
	{
		balance = balance + cash;
		System.out.println(balance); 
		
	}
	public void withDrawMoney(double cash) // setter method
	{
		balance = balance - cash;
		System.out.println(balance); 
	}
	
	public  void verifyBalance() {  
		
		System.out.println(balance); 	// getter method // if we are not changing the value ( +, -, *, /) in the method is called as getter method.
	}

	
	
	
	
	
	
	
	
	

}
