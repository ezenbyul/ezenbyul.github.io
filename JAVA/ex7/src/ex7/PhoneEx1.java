package ex7;

public class PhoneEx1 {

	public static void main(String[] args) {
//		Phone
//		통화시간 300분에 기본요금 12000원 추가요금 분당 20원
//		HandPhone
//		기본 음성통화(200)보다 초과분은 1분당 8원 / 기본요금 10000원
//		기본 트래픽(720)보다 초과분은 M당 50원 / 기본요금 10000원
//		기본 문자(100)보다 초과분 1건당 10원 / 기본요금 3000원
//		기본요금 총합 23000원
		Phone ph1 = new Phone("S1","네이비",300);
		HandPhone hp1 = new HandPhone("S10","실버",201,721,101);
		System.out.println(ph1);
		System.out.println(hp1);
		System.out.println(ph1.color);
		ph1.feeCalc();
		ph1.getFee();
		ph1.getter();

//		hp1.feeCalc(); // HandPhone 에 작성한 getFee2 같은 경우 안에 this.feeCalc()를 선언후 불러오는 형식으로 작성했음
		hp1.getFee2();
		hp1.getter();
	}
}
