package ex5;

public class ref02 {

	public static void main(String[] args) {
		//�迭 ����
		int[] num1;
		int num2[];
//		num2[0]=100;
//		for(int i = 0 ; i <num2.length;i++) {
//		System.out.println(num2[i]);
//		}
		int[] num3 = null;	//���� ������ null������ �ʱ�ȭ ����
		int[] ex1 = { 80,90,'a','b',100}; // print = 80 , 90 , 97 , 98 , 100 ASCII CODE
		ex1[0] = 85;
		ex1[1] = 500;
		for(int i = 0 ; i < ex1.length;i++) {
			System.out.println(ex1[i]);
		}
		
		int[] jum;
		jum = new int[] {80,70,100,50};
		for(int i = 0 ; i < jum.length;i++) {
			System.out.println(jum[i]);
		}	
		
	}

}