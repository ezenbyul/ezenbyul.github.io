package ex6;

public class Car3 {
	static String Company = "����";
	static int speed = 0;
	static int speedUp(int x) {
		System.out.println("�ӵ��� ���� �Ǿ����ϴ�.");
		return speed = speed+x;
	}
	static int speedDown(int x) {
		System.out.println("�ӵ��� ���� �Ͽ����ϴ�.");
		return speed = speed+x;
	}
}