package Class;

public class ShopServiceExample {
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getIntstace();
		ShopService obj2 = ShopService.getIntstace();
		
		if(obj1 == obj2) {
			System.out.println("���� �ּҸ� ���� ��ü �Դϴ�.");
			System.out.println("obj1> "+obj1);
			System.out.println("obj2> "+obj2);
		} else {
			System.out.println("�ٸ� �ּҸ� ���� ��ü �Դϴ�.");
		}
	}
}
