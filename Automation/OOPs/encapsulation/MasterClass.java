package encapsulation;

public class MasterClass {

public static void main(String[] args) {
		
		Bank b = new Bank();
		b.verifyBalance();   //20,000
		b.depositeMoney(10000);  
//		b.verifyBalance();   //30,000
		b.withDrawMoney(5000);  
//		b.verifyBalance();  //25,000
		
	}

}