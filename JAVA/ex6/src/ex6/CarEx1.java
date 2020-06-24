package ex6;

public class CarEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.company = "BMW";
		car1.model = "BMW";
		car1.color = "White";
		car1.maxSpeed = 400;
		car1.speed = 200;
		System.out.print(car1.company+ " ");
		System.out.print(car1.model+ " ");
		System.out.print(car1.color+ " ");
		System.out.print(car1.maxSpeed+ " ");
		System.out.println(car1.speed+ " ");
		
		Car car2 = new Car("�����ڵ���");
		System.out.print(car2.company+ " ");
		System.out.print(car2.model+ " ");
		System.out.print(car2.color+ " ");
		System.out.print(car2.maxSpeed+ " ");
		System.out.println(car2.speed+ " ");
		
		Car car3 = new Car("�����ڵ���","��Ÿ��");
		System.out.print(car3.company+ " ");
		System.out.print(car3.model+ " ");
		System.out.print(car3.color+ " ");
		System.out.print(car3.maxSpeed+ " ");
		System.out.println(car3.speed+ " ");
		
		Car car4 = new Car("�����ڵ���","��Ÿ��","����");
		System.out.print(car4.company+ " ");
		System.out.print(car4.model+ " ");
		System.out.print(car4.color+ " ");
		System.out.print(car4.maxSpeed+ " ");
		System.out.println(car4.speed+ " ");
		
		Car car5 = new Car("�����ڵ���","��Ÿ��","����",260);
		System.out.print(car5.company+ " ");
		System.out.print(car5.model+ " ");
		System.out.print(car5.color+ " ");
		System.out.print(car5.maxSpeed+ " ");
		System.out.println(car5.speed+ " ");
		
		Car car6 = new Car("�����ڵ���","��Ÿ��","����",260,120);
		System.out.print(car6.company+ " ");
		System.out.print(car6.model+ " ");
		System.out.print(car6.color+ " ");
		System.out.print(car6.maxSpeed+ " ");
		System.out.println(car6.speed+ " ");
		
		Car2 hcar1 = new Car2();
		hcar1.setCompany("���");
		hcar1.getCompany();
		hcar1.setPowerOn();
//		System.out.println(hcar1.speed);
		hcar1.setPowerDown();
//		System.out.println(hcar1.maxSpeed);
		hcar1.setSpeedUp();
		System.out.println(hcar1.speed);
		hcar1.setSpeedUp(50);
		System.out.println(hcar1.speed);
		hcar1.setSpeedDown();
		System.out.println(hcar1.speed);
		hcar1.setSpeedDown(50);
		System.out.println(hcar1.speed);
		
		
		//���� Ŭ������ �ν��Ͻ� ������� ������, Ŭ������ �ڿ� �״�� �ҷ��;� �Ѵ�.
		Car2 kcar2 = new Car2();
		kcar2.speed=100;
		kcar2.speed = kcar2.speed+Car3.speedUp(50);
		System.out.println(kcar2.speed);
		kcar2.speed = kcar2.speed-Car3.speedDown(50);
		System.out.println(kcar2.speed);
		
		// singleton
		/*
		Car4 scar4 = new Car4();
		Car4 scar5 = new Car4();
		*/
		
		Car4 obj1 = Car4.getInstance(); // �̱��� Ŭ������ �ϳ��� ��ü�� ����
		Car4 obj2 = Car4.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
		if(obj1==obj2) {
			System.out.println("���� ��ü");
		}else {
			System.out.println("�ٸ���ü");
		}
		
		
		Car5 hcar5 = new Car5("�𵨸�","black");
		System.out.println(hcar5.company);
		System.out.println(hcar5.model);
		System.out.println(hcar5.color);
		Car5 Hcar5 = new Car5("null","null");
		System.out.println(Hcar5.company);
		System.out.println(Hcar5.model);
		System.out.println(Hcar5.color);
//		Hcar5.model = "all";	// final �����̱� ������ ������ �Ұ���
		Hcar5.color = "white";
		
		
		System.out.println(Car6.TIRE_PI);
		System.out.println(Car6.TIRE_COUNT);
		System.out.println(Car6.TIRE_AREA);
	}
}