package ex6;

public class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
	//������ �Լ� �����ε� : ���� �̸��� ���� �Լ��� �޼��带 ������ ������ Ÿ���� �ٸ��� ������ ����Ͽ�
	//��� �Է°��� ��� ������ ó���� �����ؾ� �ϹǷ� �̷��� ������ �Լ��� ���Ͽ� �����ϴ� ����
	//������ �Լ� �����ε��̶� �Ѵ�.
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
