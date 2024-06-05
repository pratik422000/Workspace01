package string;

public class Methods {

	public static void main(String[] args) {
		
		String p =new String ("Pune");
		p.concat(" is my city");   // This will not change the value of p because string objects are immutable(unchangeable)
		System.out.println(p);    // This will not print "Pune is my city". Because p is still pointing Pune.
		
		p=p.concat(" is a historical place.");
		System.out.println(p);   // Now this will print Pune is a historical place.
	}
	

}
