package com.ezen.student.test;
// 어노테이션의 정의는 @interface 이므로 정의부만 있고, 값 대입부는 없다.
// @interface 그 뒤에 사용할 어노테이션 이름이 온다.
public @interface An1 {
	String eleName();
	int eleNum();
	
	String eleName1() default "아무개";
	int eleNum1() default 40;
	
}
