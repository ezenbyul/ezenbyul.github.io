package ex4;

import java.io.IOException;

public class While01 {
//	다음 줄로 넘기는 것이 Line Feed 아스키코드 13 이고
//
//	옮기 다음 줄에서 제일 처음으로 지이익 당기는 것이 CR 아스키코드 10
//	printf 같은 곳에서 \n 의 개행문자로 위와 같은 동작을 하는데
//
//	문자는 \n 이지만 이에 대응되는 아스키코드는 CR+LF 라고 보아야 합니다.

	public static void main(String[] args) throws IOException {
		// 키보드 1을 누르면 속도가 가속하고, 2를 누르면 속도를 감속하며, 3을 누르면 중지
//		boolean run = true;
		int speed = 0 ;
		int keyCode = 0;
		System.out.println("문제-00");
		while(true) {
			//메뉴출력
			if(keyCode!=10 && keyCode!=13) { // line feed,newline && carriage return 
			System.out.println("1 - 속도 가속");
			System.out.println("2 - 속도 감속");
			System.out.print("입력 : ");
			}
			keyCode = System.in.read(); // 키보드로 입련된 데이터 읽어옴
			if(keyCode==49) {
				speed++;
				System.out.println("speed : "+speed);								
			}else if (keyCode==50) {
				speed--;
				System.out.println("speed : "+speed);							
			}else if (keyCode==51) {
				System.out.println("종료 합니다.");
//				run = false;
				break;
			}else if(keyCode!=10 && keyCode!=13){
				System.out.println("다시 입력해주세요...");
			}
		}
	}
}
