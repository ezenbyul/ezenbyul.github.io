package ex6;

public class Car6 {	//상수 클래스
	//final static : final은 값이 변경되지 않고, static은 정적인 곳으로
	//별도의 인스턴스를 생성할 필요가 없는 것으로 주로 final과 static을 동시에 ㅅ용하여 상수를 선언
	static final double TIRE_PI=3.141592;
	static final int TIRE_COUNT=4;
	static final int TIRE_RADIUS=250;
	static final double TIRE_AREA;
	static {
		TIRE_AREA = TIRE_PI * TIRE_RADIUS;
	}
}

