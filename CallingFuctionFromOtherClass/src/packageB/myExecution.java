package packageB;

import packageA.myFunction;

public class myExecution {

	public static void main(String[] args) {
		myFunction obj = new myFunction( );
		int x = obj.addNum(45, 56);
		
		System.out.println(x);
		obj.printname("Mahfiz");
	}

}
