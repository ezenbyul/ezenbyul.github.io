package com.ezen.student;

public class A {
//	A a0 = new A();
//	A a1 = new A(true);
//	A a2 = new A(1);
//	A a3 = new A("문자열");
	
	//멤버 필드의 접근 제한자
	public 	int field1;
			int field2;
	private int field3;
	
	//메서드의 접근 제한자
	public 	void method1() {}
			void method2() {}
	private	void method3() {}
	
	//생성자 함수의 접근 제한자
	A(){}
	public  A(boolean b){}	// public은 모든 패키지내의 클래스
			A(int b){}		// default는 해당 패키지내 다른 클래스만
	private A(String b){}	// private는 자신의 패키지 내에서만
}
