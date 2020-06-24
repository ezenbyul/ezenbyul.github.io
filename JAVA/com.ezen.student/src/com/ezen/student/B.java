package com.ezen.student;

public class B {
	public static void main(String args) {
		A a0 = new A();
		A a1 = new A(true);
		A a2 = new A(1);
//		A a3 = new A("문자열");	// 생성자 함수가 private이기에 에러

//		public
//		default(package)
//		private
		
		a0.field1 = 100;// public
		a0.field2 = 200;// default(package)
//		a0.field3 = 300;// private
		
		a1.field1 = 100;// public
		a1.field2 = 200;// default(package)
//		a1.field3 = 300;// private
		
		a2.field1 = 100;// public
		a2.field2 = 200;// default(package)
//		a2.field3 = 300;// private
		
		a1.method1();	// public
		a1.method2();	// default(package)
//		a1.method3();	// private
		
	}
}
