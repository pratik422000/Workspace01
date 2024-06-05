package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		String s = "abcccc";
		HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
		char[] c = s.toCharArray();
		for(char ch: c) {
			if(hm.containsKey(ch)) {
				
				hm.put(ch, hm.get(ch) + 1);
			}	
			else {
				hm.put(ch, 1); 
			} 
		}
		int maxCount=0;
		char maxChar=0;
		
		for(Map.Entry<Character, Integer> me: hm.entrySet()) {
			if(maxCount < me.getValue()) {
				maxCount=me.getValue();
				maxChar = me.getKey();
		}
//			System.out.println(me.getKey());   // Just for understanding
			System.out.println(me.getValue());		// Just for understanding
		}
		System.out.println("Maximun Repeated Character is "+maxChar+" at " +maxCount +" Times");
		System.out.println(hm.entrySet());		// Just for understanding
	}

}
