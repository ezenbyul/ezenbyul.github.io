package ex6;

public class Car2 {
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
	Car2(){
		this("BMW","X6 M","Black",400,200);}
	Car2(String company){
		this(company,"X6 M","Black",400,200);}
	Car2(String company , String model){
		this(company,model,"Black",400,200);}
	Car2(String company , String model , String color){
		this(company,model,color,400,200);}
	Car2(String company , String model , String color , int maxSpeed){
		this(company,model,color,maxSpeed,200);}
	
	// ��� this�� �̿��Ͽ� ���� 
	// ��ܿ� �ִ� this�� �̿��Ͽ� �����ε� �� �͵��� ȣ���Ͽ� ����Ѵ�.
	Car2(String company , String model , String color , int maxSpeed , int speed){
		this.company=company;
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
		this.speed=speed;
		}
	public void setCompany(String company) {
		System.out.print("������ Company : "+this.company);
		this.company=company;
		System.out.println("         ������ Company : "+this.company);
	}
	public void getCompany() {
		System.out.println("����� Company : "+this.company);
	}
	public void setPowerOn() {
		this.speed=0;
		System.out.println("�õ��� �ɷȽ��ϴ�."+this.speed);
			}
	public void setPowerDown() {
		this.maxSpeed=0;
		System.out.println("�õ��� �������ϴ�."+this.maxSpeed);
	}
	public int setSpeedUp() {
		return this.speed++;
	}
	public int setSpeedUp(int speed) {
		this.speed+=speed;
		return this.speed;
	}
	public int setSpeedDown() {
		return this.speed--;
	}
	public int setSpeedDown(int speed) {
		this.speed-=speed;
		return this.speed;
	}
	
}