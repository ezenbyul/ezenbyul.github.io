package com.ezen.student.test;

import com.ezen.student.A;

public class C {

	public static void main(String[] args) {
//		A a0 = new A();			// ������ �Լ��� Default�̱⿡ ����
		A a1 = new A(true);
//		A a2 = new A(1);		// ������ �Լ��� Default�̱⿡ ����
//		A a3 = new A("���ڿ�");	// ������ �Լ��� private�̱⿡ ����

		a1.field1 = 100;// public
//		a1.field2 = 200;// default(package)
//		a1.field3 = 300;// private
		
		a1.method1();	// public
//		a1.method2();	// default(package)
//		a1.method3();	// private
	}

}
