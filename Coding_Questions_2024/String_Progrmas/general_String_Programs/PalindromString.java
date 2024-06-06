package general_String_Programs;

public class PalindromString {

	public static void main(String[] args) {
		String s = "NAYANA";
		String rev="";
		
		for(int i=s.length()-1; i>-1; i--) {
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		if(rev.equals(s)) {
			System.out.println("Is A Palindrom String");
		}else {
			System.out.println("Not A Palindrom String");
		}
	}
}
