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
		System.out.print("�Է� �� [OFF = 0,1][2-9] : ");
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		if(x==0 || x==1){
			num = false;
			System.out.println("���α׷��� �����մϴ�.");
		}else if (x<10) {
			for(int i = 1; i<10;i++) {
				System.out.print(x+"X"+i+"="+x*i+"  ");
			}
			System.out.println();
		}else {
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		}
		}		
	}

}
