package com.ezen.student.test;

import java.lang.reflect.Method;

public class PrintAnnotationEx01 {
	public static void main(String[] args) {
		//Service Ŭ������ ����� �޼ҵ带 ��� ���÷��� �κ�
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		for(Method method : declaredMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation1 = method.getAnnotation(PrintAnnotation.class);
				
				// �޼ҵ� �̸� ���
				System.out.println("["+method.getName()+"]");
				
				// ���м� ��� (Value) Value�� number �� ��ŭ �ݺ� ���
				for(int i = 0; i<printAnnotation1.number(); i++) {
					System.out.print(printAnnotation1.value());
				}
				System.out.println();
					
				try {
					//�޼ҵ� ȣ��
					method.invoke(new Service());
				}catch( Exception e)  {
					System.out.println();
				}
			}
		}
	}
}
