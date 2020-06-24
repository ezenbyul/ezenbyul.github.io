package Class;

public class ShopServiceExample {
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getIntstace();
		ShopService obj2 = ShopService.getIntstace();
		
		if(obj1 == obj2) {
			System.out.println("같은 주소를 가진 개체 입니다.");
			System.out.println("obj1> "+obj1);
			System.out.println("obj2> "+obj2);
		} else {
			System.out.println("다른 주소를 가진 개체 입니다.");
		}
	}
}
