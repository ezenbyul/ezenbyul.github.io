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
		
		Car car2 = new Car("현대자동차");
		System.out.print(car2.company+ " ");
		System.out.print(car2.model+ " ");
		System.out.print(car2.color+ " ");
		System.out.print(car2.maxSpeed+ " ");
		System.out.println(car2.speed+ " ");
		
		Car car3 = new Car("현대자동차","산타페");
		System.out.print(car3.company+ " ");
		System.out.print(car3.model+ " ");
		System.out.print(car3.color+ " ");
		System.out.print(car3.maxSpeed+ " ");
		System.out.println(car3.speed+ " ");
		
		Car car4 = new Car("현대자동차","산타페","검정");
		System.out.print(car4.company+ " ");
		System.out.print(car4.model+ " ");
		System.out.print(car4.color+ " ");
		System.out.print(car4.maxSpeed+ " ");
		System.out.println(car4.speed+ " ");
		
		Car car5 = new Car("현대자동차","산타페","검정",260);
		System.out.print(car5.company+ " ");
		System.out.print(car5.model+ " ");
		System.out.print(car5.color+ " ");
		System.out.print(car5.maxSpeed+ " ");
		System.out.println(car5.speed+ " ");
		
		Car car6 = new Car("현대자동차","산타페","검정",260,120);
		System.out.print(car6.company+ " ");
		System.out.print(car6.model+ " ");
		System.out.print(car6.color+ " ");
		System.out.print(car6.maxSpeed+ " ");
		System.out.println(car6.speed+ " ");
		
		Car2 hcar1 = new Car2();
		hcar1.setCompany("페라리");
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
		
		
		//정적 클래스는 인스턴스 만들수가 없으며, 클래스를 자연 그대로 불러와야 한다.
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
		
		Car4 obj1 = Car4.getInstance(); // 싱글톤 클래스는 하나만 객체를 생성
		Car4 obj2 = Car4.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
		if(obj1==obj2) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른객체");
		}
		
		
		Car5 hcar5 = new Car5("모델명","black");
		System.out.println(hcar5.company);
		System.out.println(hcar5.model);
		System.out.println(hcar5.color);
		Car5 Hcar5 = new Car5("null","null");
		System.out.println(Hcar5.company);
		System.out.println(Hcar5.model);
		System.out.println(Hcar5.color);
//		Hcar5.model = "all";	// final 문구이기 때문에 변경이 불가능
		Hcar5.color = "white";
		
		
		System.out.println(Car6.TIRE_PI);
		System.out.println(Car6.TIRE_COUNT);
		System.out.println(Car6.TIRE_AREA);
	}
}
