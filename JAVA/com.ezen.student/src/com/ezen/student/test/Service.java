package com.ezen.student.test;

public class Service {
	@PrintAnnotation
	public void method1() {
		System.out.println("ù��° �޼ҵ� ����");
	}
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("�ι�° �޼ҵ� ����");
	}
	@PrintAnnotation(value = "*" , number = 20)
	public void method3() {
		System.out.println("����° �޼ҵ� ����");
	}
		
}
