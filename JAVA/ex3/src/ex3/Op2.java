package ex3;

public class Op2 {
	public static void main(String[] args) {
		// 연산자 우선 순위
		int x = 2, y = 4, z = 6;
		int a, b, j = 100, k = 3, m = 5;
		a = z = y = x;
		System.out.println(a);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		b = a + j % y - k * m;
		System.out.println(b);
		/*
		 연산자 우선 순위
		 증감 , 부호, 비트(~), 논리(!)
		 산술 연산자( *, /, %, + , - )
		 시프트 연산자 ( <<, >> ) 
		 비교 연산자 (>, <, >=, <=, ==, instanceof)
		 이진논리 연산자 (&, ^ ,|)
		 논리 연산자 (&& , ||)
		 	 1010(2) = 10(10)
		 	~1010(2) = 0101(2)	
		 삼항 연산자 (조건 ? 참 : 거짓)
		 대입 연산자 (=, += , -=,  *=,  /=, %=, &=, ^=, |=, <<=, >>=)
		 
		 
		 	k = true;
		 	a = !k 
		 	a = false (k의 반대 값을 저장) 
		 	
		 	<< 현재 값에 2배
		 		좌측 쉬프트 연산자는 오니편에 있는 피연산자의 비트 값을 연산자 오른편에 지정한 수만큼 왼쪽으로 이동
		 		1010(2)  <<2  101000(2)
		 	>> 현재 값의 1/2값
		 		1010(2)  >>2  0010(2)
		 	
		 */
	}
}
