package ex7;

public class Phone {
	public static final int VOICE_CALL = 300; // static 상수는 상속되지않음
	String model;
	String color;
	int useTime;	
	long fee;	
	
	Phone(){
		this("S2","블랙",0);
	}	
	Phone(String model) {
		this(model,"블랙",0);
	}
	Phone(String model, String color) {
	this(model,color,0);
	}
	Phone(String model, String color, int useTime) {
		this.model = model;
		this.color = color;
		this.useTime = useTime;
	}
	final void getFee() { // final 은 상속을 하지 않는다.
		System.out.println("요금은 "+this.fee+"원 입니다.");
	}
	protected void getter() {
		System.out.println("현재 사용이 가능한 상태입니다.");
	}
	
	
	public void feeCalc() {
		// 기본시간 300분 외의 초과된 시간의 분당 요금은 20원
		if(this.useTime>VOICE_CALL) {
			this.fee = 12000+(this.useTime-VOICE_CALL)*20;
		}else {
			this.fee = 12000;
		}
	}
}
