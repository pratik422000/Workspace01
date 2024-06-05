package package2;

import package1.Example11;

public class AccessOutSideOfPackage {

	public static void main(String[] args) {
		
		Example11 e = new Example11();
		e.test();                      // we can access the public method, within different package
		System.out.println(e.a);a
	}

}
