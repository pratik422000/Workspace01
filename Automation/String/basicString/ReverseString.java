package basicString;

public class ReverseString {

	public static void main(String[] args) {
		
		String str= "Pratik";
		String reverse ="";
		char ch;
        
        for (int i=0; i<str.length(); i++)
        	
        {
//          ch= str.charAt(i); //extracts each character
//          reverse= ch + reverse; //adds each character in front of the existing string
          
          // Or simply we can use reverse=reverse + s.charAt(i);
        
          reverse =reverse + str.charAt(i);   
          }
        
        System.out.println("Reversed word: "+ reverse);
      }

	}

