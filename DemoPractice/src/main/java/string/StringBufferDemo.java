package string;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Pratik");
		System.out.println(sb.capacity());   // capacity() method returns the number of characters of object can store. 
		sb.append("hello");
		System.out.println(sb.capacity());
	}
}
