package com.ezen.student.test;

import java.lang.reflect.Method;

public class PrintAnnotationEx01 {
	public static void main(String[] args) {
		//Service 클래스에 선언된 메소드를 얻는 리플렉션 부분
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		for(Method method : declaredMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation1 = method.getAnnotation(PrintAnnotation.class);
				
				// 메소드 이름 출력
				System.out.println("["+method.getName()+"]");
				
				// 구분선 출력 (Value) Value를 number 값 만큼 반복 출력
				for(int i = 0; i<printAnnotation1.number(); i++) {
					System.out.print(printAnnotation1.value());
				}
				System.out.println();
					
				try {
					//메소드 호출
					method.invoke(new Service());
				}catch( Exception e)  {
					System.out.println();
				}
			}
		}
	}
}
