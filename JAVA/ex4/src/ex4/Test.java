package ex4;

import java.util.Scanner;

import javax.naming.CommunicationException;

public class Test {
	public static void main(String[] args) {
//		int data=0;		
//		for(int i = 0 ; i <= 100; i+=3) {
//			data = data+i;
//		}
//		System.out.println("3�� ����� �� : "+data);
		
		
		
//		int x,y;
//		boolean run = true;		
//		while(run) {
//			x=(int)(Math.random()*6)+1;
//			y=(int)(Math.random()*6)+1;
//		
//			if(x+y==5) {
//				run = false;
//				System.out.println(x+", "+y);
//				System.out.println("5�� �ƾ�� �����ҰԿ�.");
//			} else {
//				System.out.println(x+", "+y);
//			}			
//		}
		
//		for(int i = 0 ; i<100;i++) {
//			double num = (Math.random()*30);
//			System.out.println(num);
//		}
		
		
//		for(int x=0;x<=10;x++) {
//			for(int y=0;y<=10;y++) {
//				if((4*x)+(5*y)==60) {
//					System.out.println(x+","+y);
//				}
//			}
//		}
		
		
		
//		for(int i =1; i<6;i++) {
//			for(int y = 0 ; y<i;y++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
//		boolean run = true;
//		int balance = 0;
//		Scanner scanner =  new Scanner(System.in);
//		
//		while(run) {
//			System.out.println("-------------------------------");
//			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
//			System.out.println("-------------------------------");
//			System.out.print("���� : ");
//			int num;
//			int tmp;
//			num = scanner.nextInt();
//			if(num == 1) {
//				System.out.print("���ݾ�>");
//				tmp = scanner.nextInt();
//				balance += tmp;
//			}else if (num == 2) {
//				System.out.print("��ݾ�>");
//				tmp = scanner.nextInt();
//				balance -= tmp;
//			}else if (num == 3) {
//				System.out.println("�ܾױݾ�>"+balance);
//			}else if (num == 4) {
//				run = false;
//			}else {
//				System.out.println("[1-4] ���ڸ� �Է����ּ���.");
//			}
//			
//		}
//		System.out.println("���α׷� ����");
		
		int x=200,y=100,tmp;
		System.out.println(x+", "+y);
		tmp=x;
		x=y;
		y=tmp;
		System.out.println(x+", "+y);
		
//		int sum=0;
//		for(int i = 1; i<=100;i++) {
//			sum+=i;
//		}
//		System.out.println(sum);
		
//		double sum=0;
//		for(double i = 1; i<=100 ; i++) {
//			sum += 1/i;
//		}
//		System.out.println(sum);
		
//		int sum=0;
//		boolean sw=true;
//		for(int i = 0 ; i <=100 ; i++) {
////			if (i%2==0) {
////				sum+=i;
////			}else {
////				sum-=i;
////			}
//			if (sw==true) {
//				sum+=i;
//				sw=false;
//			}else if(sw==false){
//				sum-=i;
//				sw=true;
//			}
//		}
//		System.out.println(sum);

		
		
//		int sum=0;
//		int cnt;
//		for(int x=0; x<=100; x++) {
//			cnt=0;
//			for(int y=2; y<x; y++) {
//				if(x%y==0)cnt++;
//			}
//			if(cnt==0)sum+=x;
//		}
//		System.out.println(sum);
		
		
//		int cnt;
//		for(int num=0;num<=100;num++) {
//			cnt=0;
//			for(int i=2;i<num;i++) {
//				if(num%i == 0) {
//					cnt++;
//				}
//			}
//			if(cnt==0) {
//				System.out.println(num);
//			}
//		}
	}
}