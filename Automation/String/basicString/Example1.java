package basicString;

public class Example1 {

	public static void main (String []args) {
		
		// There are two ways to create an object of string in java 
				// 1. Literal / String literal
				// 2. new keyword / String object
		//1. Literal
		String city = "Mumbai";     // Heap memory --> String Constant pool	-- It don't allow duplicates.
	
		int a =3;
		
		// 2. new keyword			// Heap memory --> Non constant pool -- Allow duplicates.
		String s =new String ("Mumbai");
		
//		System.out.println(city);
//		System.out.println(s);

		 // Why string is immutable in nature?   what is difference between literal & new keyword in java
		
		/*String Literal
		 
		1. A string literal is a sequence of characters enclosed in double quotes (e.g., "Hello, World!").
		2. When you create a string literal, Java automatically creates a String object that represents that literal.
		3. If you create multiple string literals with the same content, they will reference the same object in the string pool. 
		4. String literals are stored in a separate area of memory called the "string pool" or "string constant pool." // String pool is the special memory region where Strings are stored by the JVM
		5. String literals are immutable, meaning their values cannot be changed once they are created.*/
		
		/* String Object
		1. A string object is created using the new keyword followed by the String class  (e.g., new String("Hello, World!")).
		2. When you create a string object, Java creates a new instance of the String class, even if the content is the same as an existing string literal.
		3. String objects are stored in the heap memory, and each object has its own memory space. // heap memory is created when JVM starts-up. An automatic storage management system reclaims heap. It may be of fixed and variable size.
		4. Unlike string literals, string objects created with the new keyword are not automatically interned or stored in the string pool.
		5. String objects are mutable, meaning you can change their values using methods such as concat(), substring(), or replace().*/
		
		String p =new String ("Pune");
		p.concat("is a historical place.");
		System.out.println(p);
		
		
		
	}
}