package practice_2024;

import java.util.HashMap;


public class LongestSubstringANDlength {

	public static void main(String[] args) {
//		Sliding("awdeuwkabe");
		Sliding("hwwkew");
	}
	
    private static void Sliding(String str) {
    	int start = 0, end = 0;
    	HashMap<Character, Integer> seen = new HashMap<Character, Integer>();
    	int winLow = 0;
    	for(int i=0; i<str.length(); i++) {
    		char ch = str.charAt(i);
    		if(seen.containsKey(ch)) {
    			if((end - start) < (i -1 - winLow)) {
    				end = i-1;
    				start = winLow;
    			}
    			winLow = Math.max(seen.get(ch)+1, winLow);
    			System.out.println("WinLo: "+winLow);
    		}
    		seen.put(ch, i);
    	}
    	System.out.println(str.substring(start, end+1));
    }
}