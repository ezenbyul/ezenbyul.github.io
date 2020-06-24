package ex6;

public class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
	//생성자 함수 오버로딩 : 같은 이름을 가진 함수나 메서드를 변수의 개수나 타입을 다르게 여러개 기술하여
	//어떠한 입력값이 들어 오더라도 처리가 가능해야 하므로 이렇게 생성자 함수에 대하여 적용하는 것을
	//생성자 함수 오버로딩이라 한다.
	Car() {
		this.company = "none";
		this.model = "none";
		this.color = "none";
		this.maxSpeed = 0;
		this.speed = 0;	
	}
	Car(String company) {
		this.company = company;
		this.model = "none";
		this.color = "none";
		this.maxSpeed = 0;
		this.speed = 0;	
	}
	Car(String company , String model) {
		this.company = company;
		this.model = model;
		this.color = "none";
		this.maxSpeed = 0;
		this.speed = 0;	
	}
	Car(String company , String model , String color) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = 0;
		this.speed = 0;	
	}
	Car(String company , String model , String color , int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = 0;	
	}
	Car(String company , String model , String color , int maxSpeed , int speed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;	
	}
}
