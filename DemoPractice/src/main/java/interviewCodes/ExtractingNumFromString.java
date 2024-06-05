package interviewCodes;

public class ExtractingNumFromString {

	// Write a java program extract only numbers from String input = "Abcde1111111" and count the repeated Numbers in the output.
	
	public static void main(String[] args) {
		
		String input = "Abcde112255";
		StringBuilder extractedNumbers = new StringBuilder();
		
		for (int i=0; i<=input.length()-1; i++)
		{
			char temp = input.charAt(i);
			if(Character.isDigit(temp)) 
			{
				extractedNumbers.append(temp);
			}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		}
		String result = extractedNumbers.toString();
		System.out.println("ExtractedNumbers" + result);
		
		int count = 0;

        for (int i = 0; i < result.length()-1 ; i++) {
            char digit = result.charAt(i);
            char nextDigit = result.charAt(i + 1);

            if (digit == nextDigit) {
                count++;
            }
        }

        System.out.println("The Number of repeated Numbers in the string is " + count);
    }
		
}
