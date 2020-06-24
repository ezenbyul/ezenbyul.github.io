package ex2;
 /*변수의 사용 범위
전역변수 (Global scope) : 클래스 내부의 전체에서 사용하는 변수
지역변수 (Local scope) : 블록내에서만 사용하는 변수
*/

public class Variable {
	int a=300;
	public static void main(String[] args) {
		int a = 100;
		if(a>=90) {
			int b = 200;
			System.out.println("b="+b);
		}
	
		System.out.println("a="+a);
				
	}
}