package com.ezen.student.test;

public class Service {
	@PrintAnnotation
	public void method1() {
		System.out.println("첫번째 메소드 실행");
	}
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("두번째 메소드 실행");
	}
	@PrintAnnotation(value = "*" , number = 20)
	public void method3() {
		System.out.println("세번째 메소드 실행");
	}
		
}
