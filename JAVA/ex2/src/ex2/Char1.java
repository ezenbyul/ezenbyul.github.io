package ex2;

public class Char1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1 = 'A';
		char ch2 = 65;			//10진수 ASCII
		char ch3 = '\u0041';	//16진수 UNICODE
		
		char ch4 = '가';
		char ch5 = 44032;		//10진수 UNICODE
		char ch6 = '\uac00';	//16진수 UNICODE
		
		System.out.println("ch1 = "+ch1);
		System.out.println("ch2 = "+ch2);
		System.out.println("ch3 = "+ch3);
		System.out.println("ch4 = "+ch4);
		System.out.println("ch5 = "+ch5);
		System.out.println("ch6 = "+ch6);
	}

}
