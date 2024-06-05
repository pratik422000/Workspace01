package practice_2024;

import java.util.HashSet;

public class LoggestSubstring {

	public static void main (String [] args) {
		
		String str = "awdeuwkabe";
		Longest(str);
	}

	private static void Longest(String str) {
		
		HashSet<Character> set = new HashSet<Character> ();
		
		String longestTillNow="";
		String longestOverall="";
		int longestSubstringLength=0;
		
		for (int i=0; i<str.length();i++) {
			 char c =str.charAt(i);
			 if(set.contains(c))
			 {
			 longestTillNow="";
				 set.clear();
			 }
			 set.add(c);
			 longestTillNow+=c;
			 
			 if(longestTillNow.length()>longestOverall.length()) {
				 longestOverall=longestTillNow;
			 }
			 
			 if(set.size()>longestSubstringLength) {
				 longestSubstringLength=set.size();
			 }
			 
		}
		System.out.println(longestOverall);
		System.out.println(longestSubstringLength);
	}
	
}
