package practice_2024;

import java.util.HashSet;

		// here we are finding length of the longest substring

public class findlengthoflongestSubstring {
	
	public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int max = 0;
        String S = "jhvckfyyuu";
        HashSet<Character> hashSet = new HashSet<>();

        while (j < S.length()) {
            if (!hashSet.contains(S.charAt(j))) {
                hashSet.add(S.charAt(j));
                j++;
                max = Math.max(hashSet.size(), max);
            } else {
                hashSet.remove(S.charAt(i));
                i++;
            }
        }
        System.out.println("Length of longest substring without repeating characters: " + max);
    }

}
