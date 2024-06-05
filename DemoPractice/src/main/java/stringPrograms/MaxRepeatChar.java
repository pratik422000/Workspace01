package stringPrograms;

public class MaxRepeatChar {

	// If string is in sequence.
	
	public static void main(String[] args) {
		String s = "abbcc";
		char[] charArr = s.toCharArray();
		char currChar = charArr[0];	  //a
		int currCount = 0;
		char maxRepeatChar = charArr[0];  //a
		int maxCount = 0;
		for(int i=0; i < charArr.length; i++) {
			if(currChar == charArr[i]) {
				currCount++;
			}	
			else {			
				currChar = charArr[i];
				currCount = 1;
			}
			if(currCount >= maxCount) {
				maxRepeatChar = currChar;
				maxCount = currCount;
			}
		}
		System.out.println(maxRepeatChar);
		System.out.println(maxCount);
		MaxRepeatChar.NoOfWords("This is a       sentence;");
	}
	
	public static int NoOfWords(String sentence) {
		// This is a      sentence;     // Split method
		String[] chars = sentence.split(" ");
		int count = 0;
		for(String s: chars) {
			if(s != "") {
				count++;
			}
		}
		System.out.println(count);
		return -1;
	}
}
