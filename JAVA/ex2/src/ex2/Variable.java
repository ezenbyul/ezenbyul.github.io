package ex2;
 /*������ ��� ����
�������� (Global scope) : Ŭ���� ������ ��ü���� ����ϴ� ����
�������� (Local scope) : ��ϳ������� ����ϴ� ����
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