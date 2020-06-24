package ex7;

public class HandPhone extends Phone{
	public static final int VOICE_CALL = 200; // 상속되지 않으므로 재선언
	public static final int TRAFFIC = 720;
	public static final int SMS = 100;
	// 멤버변수와 멤버메서드는 상속되지만 
	// 생성자는 상속되지 않음
	// 상수는 상속되지 않음
	int useTraffic;
	int useSMS;
	HandPhone(){
//		super();	// super: 부모 클래스에서 Phone()의 생성자를 호출
//		this("S10", "블랙", 200); // 자기자신의 생성자를 호출
		this("s10","블랙",0,0,0);
	}	
	HandPhone(String model) {
		this(model,"블랙",0,0,0);
	}
	HandPhone(String model, String color ) {
		this(model,color,0,0,0);
	}
	HandPhone(String model, String color , int useTime) {
		this(model,color,useTime,0,0);
	}
	HandPhone(String model, String color, int useTime , int useTraffic ) {
		this(model,color,useTime,useTraffic,0);
		
	}
	HandPhone(String model, String color, int useTime , int useTraffic , int useSMS) {
		this.model = model;
		this.color = color;
		this.useTime = useTime;
		this.useTraffic = useTraffic;
		this.useSMS = useSMS;
//		super.model;	//부모 클래스에서 멤버 변수(필드)를 호출
//		super.color;
//		super.useTime;
	}
	final void getFee2() { // final + 메소드 는 상속이 가능하나 override가 불가능하다.
		this.feeCalc();
		System.out.println("요금은 "+this.fee+"원 입니다.");
	}
	@Override
	public void feeCalc() { // 오버라이딩 : 자식 클래스에서 부모클래스의 메서드를 변형해서 정의 
		if(this.useTime>VOICE_CALL) { // 기본 음성통화보다 초과분은 1분당 100원 / 기본요금 10000원
			this.fee+=(10000+(this.useTime-VOICE_CALL)*100);
		} else {
			this.fee+=10000;
		}
		if(this.useTraffic>TRAFFIC) {// 기본 트래픽보다 초과분은 M당 10원 / 기본요금 10000원
			this.fee+=(10000+(this.useTraffic-TRAFFIC)*10);
		}else {
			this.fee+=10000;
		}
		if(this.useSMS>SMS) { // 기본 문자보다 초과분 1건당 1원 / 기본요금 3000원
			this.fee+=(3000+(this.useSMS-SMS)*1);
		}else {
			this.fee+=3000;
		}
	}
}





//
//	HandPhone(){
//		this("S10", "블랙", 200);
//	}	
//	public HandPhone(String model) {
//		this(model,"블랙",200);
//	}
//	public HandPhone(String model, String color) {
//		this(model,color,200);
//	}
//	public HandPhone(String model, String color, int useTime) {
//		this(model,color,useTime);
//		super.model;	
//		super.color;
//		super.useTime;
//	}

