package com.ezen.student;

public class A {
//	A a0 = new A();
//	A a1 = new A(true);
//	A a2 = new A(1);
//	A a3 = new A("���ڿ�");
	
	//��� �ʵ��� ���� ������
	public 	int field1;
			int field2;
	private int field3;
	
	//�޼����� ���� ������
	public 	void method1() {}
			void method2() {}
	private	void method3() {}
	
	//������ �Լ��� ���� ������
	A(){}
	public  A(boolean b){}	// public�� ��� ��Ű������ Ŭ����
			A(int b){}		// default�� �ش� ��Ű���� �ٸ� Ŭ������
	private A(String b){}	// private�� �ڽ��� ��Ű�� ��������
}