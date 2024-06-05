package InterviewCodes_2024;

import java.util.HashSet;
import java.util.Set;

public class FindduplicateElements {

	public static void main(String[]args) 
	{
		int[] arr= {3,5,4,3,2,2,1,2,2,2};
		
		Set<Integer> s = new HashSet<>();
		for(int no:arr) 
		{
			if(s.add(no)==false) 
			{
				
				System.out.print(no+"");
			}
		}
	}
}
