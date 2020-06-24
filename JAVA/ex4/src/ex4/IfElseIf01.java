package ex4;

public class IfElseIf01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int js = 100;
		String hak;
		if (js>=80 && js<=90) {
			System.out.println("출력");
		} else if (js>=85) {
			hak="A";
			System.out.println(hak);
		} else if(js>=95) {
			hak="A+";
			System.out.println(hak);
		} // 논리적 오류 else if로 중복을 줄 경우 상단에서 조건이 참이되어 값을 계산 할 경우 그 다음 else if 문구는 실행이 되지 않는다.
	}

}

