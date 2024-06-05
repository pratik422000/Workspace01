package variables;

public class Question2 {

		
		int x=20;
		int y=40;
		
		public void test() 
		{
			x=30;
			y=50;
			System.out.println(x);
			System.out.println(y);
		}
		
		public static void main(String[] args) {	
			Question2 obj = new Question2();
			obj.test();
	}

}
