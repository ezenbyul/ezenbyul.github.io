package ex2;

public class Promotion1 {
	public static void main(String[] args) {
		int a = 1;
		byte b = (byte) a;

		System.out.println(a);
		System.out.println(b);

		char c1 = '°¡';
		a = c1;
		System.out.println(a);
		
		long l1 =21470000000000L;
		a =(int)l1;
		String a2= Integer.toBinaryString(a);
		System.out.println(a);
		System.out.println(a2);
	}
}
