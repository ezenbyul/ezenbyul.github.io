package ex5;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		int max = 0;
//		int min = 0 ;
//		int[] arr = {2,5,3,8,1};
//		
//		for ( int i = 0 ; i < arr.length ; i++) {
//			if (max<arr[i]) {
//				max = arr[i];				
//			}
//			System.out.println(max);
//		}
		
//		int arr[][]= {
//				{95,86},
//				{83,92,96},
//				{78,83,93,87,88}				
//		};
//		int sum=0;
//		int cnt=0;
//		double avg=0.0;
//		
//		for ( int i = 0 ; i<arr.length;i++) {
//			for(int y= 0 ; y<arr[i].length;y++) {
//				sum += arr[i][y];
//			}
//			cnt += arr[i].length;
//			avg = (double)sum / (double)cnt;
//		}		
//		System.out.println(sum);
//		System.out.println(cnt);
//		System.out.println(avg);
		
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			
			System.out.println("=================================================");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("=================================================");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			case 1:
				System.out.print("입력> ");
				studentNum = scanner.nextInt();
				System.out.println("총 학생수 :"+studentNum);
				scores = new int[studentNum];
				break;
			case 2:
				if(studentNum!=0) {
					for(int i=0; i<scores.length;i++) {
						System.out.print((i+1)+"번째 학생 점수 입력> ");
						scores[i]=scanner.nextInt();
					}
				}else {
					System.out.println("학생수를 입력해주세요.");
				}
				break;
			case 3:
				if(studentNum!=0) {
					for(int i = 0 ; i <scores.length;i++) {
						System.out.println((i+1)+"번째 학생 점수> "+scores[i]);
					}
				}else{System.out.println("데이터가 없습니다.");}
				break;
			case 4:
				if(studentNum!=0) {
					int sum=0;
					double avg=0.0;
					int max=0;
					
					for(int i = 0 ; i < scores.length;i++) {
						if (max<scores[i]) max=scores[i];
						sum =+ scores[i];
					}
					avg = (double)sum/studentNum;
					System.out.println("최고 >"+max);
					System.out.println("합산 >"+sum);
					System.out.println("평균 >"+avg);
				}else {System.out.println("데이터가 없습니다.");}
				break;
			case 5:
				run = false;
				break;			
			}
		}
		
	}
}
