package string;

public class StringSearching {

	public static void main(String[] args) {
		//			0123456	
		String s = "Neetima";
		System.out.println(s.indexOf("a")); //This will give an index of given char
		System.out.println(s.indexOf("x")); // if the given char is not present in the string it will give output as -1.
		System.out.println(s.lastIndexOf("e")); // This will give the index of last occurence of the char within the string.
		System.out.println(s.charAt(4)); // CharAt takes int value as an argument and provides char value for the given index.
		System.out.println(s.contains("m")); // This will take char as an argument and check whether given char seq is present in the string and provides the boolean value.
		System.out.println(s.startsWith("Nee"));  	// True
		System.out.println(s.startsWith("nee"));	//False
		System.out.println(s.endsWith("ma"));		//True
		System.out.println(s.endsWith("Ma"));		//False
	
	}

}
