package 第4部分_课后练习.b;

import 第4部分_课后练习.a.A;

public class B {

	public static void main(String [] args){
		A a = new A();
		a.print_public();
		// a.print_protected();
		// a.print_default();
		// a.print_private();
		
		C c = new C();
	}
}

class C extends A{
	
	C(){
		print_public();
		print_protected();
		// print_default();
		// print_private();
	}
}