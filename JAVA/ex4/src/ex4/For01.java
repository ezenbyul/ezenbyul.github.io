package ex4;
import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		
//		for(int i=1;i<10;i++) {
//			for(int y=1;y<10;y++) {
//				System.out.print(i+"X"+y+"="+i*y+"  ");
//			}
//			System.out.println();
//		}
				
		int x;
		boolean num = true;
		
		while(num) {		
		System.out.print("입력 값 [OFF = 0,1][2-9] : ");
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		if(x==0 || x==1){
			num = false;
			System.out.println("프로그램을 종료합니다.");
		}else if (x<10) {
			for(int i = 1; i<10;i++) {
				System.out.print(x+"X"+i+"="+x*i+"  ");
			}
			System.out.println();
		}else {
			System.out.println("잘못 입력 하셨습니다.");
		}
		}		
	}

}
