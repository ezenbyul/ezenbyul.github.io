package ex2;

public class Literal1 {
	public static void main(String[] args) {
		// ���� ���ͷ�
		// 0 , 75 , -101 :: �Ҽ����� ���� ����
		// 28 (10����)
		// 034(8����) 8���� ���� ��� �տ� 0�� ���δ�.
		// 0x1c (16����)
		// 0b11100 (2����)
		
		// �Ǽ� ���ͷ�
		// 0.25 , -3.14 , 5E7(5*10�� 7��) , 4.36E-03(4.36*10�� 3��)
		
		// ���� ���ͷ�
		// ' ' 
		// �̽������� ����(�����)tab or enter ���
		// \t \n \r \' \" \\
		
		// ���ڿ� ���ͷ�
		// " "
		// �̽������� ���� ����
		
		// �� ���ͷ�
		// true , false
		// boolean
		
		int a = 75, b = -101;
		int c = 034, d = 0x1c, e = 0b11100, f = 28;
		System.out.println("a="+a+", b="+b);
		System.out.printf("c=%d, d=%d, e=%d, f=%d", c,d,e,f);
		System.out.println();
				
		float fa=0.25f , fb=-3.14f;
		// �Ҽ����� �ڿ� f�� �����Ͽ� �Ǽ����� �����Ѵ�.
		double da=5e7 , db=4.36e-03; 
		System.out.printf("da=%f, db=%f\n",da,db);
		System.out.println("da="+da+", db="+db);
		
	}
}
