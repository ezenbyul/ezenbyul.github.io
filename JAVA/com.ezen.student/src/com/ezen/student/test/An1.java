package com.ezen.student.test;
// ������̼��� ���Ǵ� @interface �̹Ƿ� ���Ǻθ� �ְ�, �� ���Ժδ� ����.
// @interface �� �ڿ� ����� ������̼� �̸��� �´�.
public @interface An1 {
	String eleName();
	int eleNum();
	
	String eleName1() default "�ƹ���";
	int eleNum1() default 40;
	
}
