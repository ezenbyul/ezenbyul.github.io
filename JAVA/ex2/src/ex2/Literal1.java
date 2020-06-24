package ex2;

public class Literal1 {
	public static void main(String[] args) {
		// 정수 리터럴
		// 0 , 75 , -101 :: 소수점이 없는 정수
		// 28 (10진수)
		// 034(8진수) 8진수 같은 경우 앞에 0을 붙인다.
		// 0x1c (16진수)
		// 0b11100 (2진수)
		
		// 실수 리터럴
		// 0.25 , -3.14 , 5E7(5*10의 7승) , 4.36E-03(4.36*10의 3승)
		
		// 문자 리터럴
		// ' ' 
		// 이스케이프 문자(제어문자)tab or enter 등등
		// \t \n \r \' \" \\
		
		// 문자열 리터럴
		// " "
		// 이스케이프 문자 포함
		
		// 논리 리터럴
		// true , false
		// boolean
		
		int a = 75, b = -101;
		int c = 034, d = 0x1c, e = 0b11100, f = 28;
		System.out.println("a="+a+", b="+b);
		System.out.printf("c=%d, d=%d, e=%d, f=%d", c,d,e,f);
		System.out.println();
				
		float fa=0.25f , fb=-3.14f;
		// 소수점은 뒤에 f를 기입하여 실수임을 선언한다.
		double da=5e7 , db=4.36e-03; 
		System.out.printf("da=%f, db=%f\n",da,db);
		System.out.println("da="+da+", db="+db);
		
	}
}
