package ex3;

public class Op2 {
	public static void main(String[] args) {
		// ������ �켱 ����
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
		 ������ �켱 ����
		 ���� , ��ȣ, ��Ʈ(~), ����(!)
		 ��� ������( *, /, %, + , - )
		 ����Ʈ ������ ( <<, >> ) 
		 �� ������ (>, <, >=, <=, ==, instanceof)
		 �������� ������ (&, ^ ,|)
		 ���� ������ (&& , ||)
		 	 1010(2) = 10(10)
		 	~1010(2) = 0101(2)	
		 ���� ������ (���� ? �� : ����)
		 ���� ������ (=, += , -=,  *=,  /=, %=, &=, ^=, |=, <<=, >>=)
		 
		 
		 	k = true;
		 	a = !k 
		 	a = false (k�� �ݴ� ���� ����) 
		 	
		 	<< ���� ���� 2��
		 		���� ����Ʈ �����ڴ� �������� �ִ� �ǿ������� ��Ʈ ���� ������ �������� ������ ����ŭ �������� �̵�
		 		1010(2)  <<2  101000(2)
		 	>> ���� ���� 1/2��
		 		1010(2)  >>2  0010(2)
		 	
		 */
	}
}