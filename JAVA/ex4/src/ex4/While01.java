package ex4;

import java.io.IOException;

public class While01 {
//	���� �ٷ� �ѱ�� ���� Line Feed �ƽ�Ű�ڵ� 13 �̰�
//
//	�ű� ���� �ٿ��� ���� ó������ ������ ���� ���� CR �ƽ�Ű�ڵ� 10
//	printf ���� ������ \n �� ���๮�ڷ� ���� ���� ������ �ϴµ�
//
//	���ڴ� \n ������ �̿� �����Ǵ� �ƽ�Ű�ڵ�� CR+LF ��� ���ƾ� �մϴ�.

	public static void main(String[] args) throws IOException {
		// Ű���� 1�� ������ �ӵ��� �����ϰ�, 2�� ������ �ӵ��� �����ϸ�, 3�� ������ ����
//		boolean run = true;
		int speed = 0 ;
		int keyCode = 0;
		System.out.println("����-00");
		while(true) {
			//�޴����
			if(keyCode!=10 && keyCode!=13) { // line feed,newline && carriage return 
			System.out.println("1 - �ӵ� ����");
			System.out.println("2 - �ӵ� ����");
			System.out.print("�Է� : ");
			}
			keyCode = System.in.read(); // Ű����� �Էõ� ������ �о��
			if(keyCode==49) {
				speed++;
				System.out.println("speed : "+speed);								
			}else if (keyCode==50) {
				speed--;
				System.out.println("speed : "+speed);							
			}else if (keyCode==51) {
				System.out.println("���� �մϴ�.");
//				run = false;
				break;
			}else if(keyCode!=10 && keyCode!=13){
				System.out.println("�ٽ� �Է����ּ���...");
			}
		}
	}
}
