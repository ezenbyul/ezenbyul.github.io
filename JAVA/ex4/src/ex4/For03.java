package ex4;

public class For03 {

	public static void main(String[] args) {
		int[] su = { 60,75,85,90,80,70,65 };
		for(int i = 0 ; i < su.length ; i++) {
			System.out.print(su[i]+" ");
		}
		System.out.println();
		for(int i = 0; i<su.length ; i++) {
			for(int y = i+1 ; y < su.length; y++) {
				if(su[i]>su[y]) {
					int tmp;
					tmp = su[i];
					su[i] = su[y];
					su[y] = tmp;					
				}
			}
		}

		for(int i = 0 ; i < su.length ; i++) {
			System.out.print(su[i]+" ");
		}
		System.out.println();
//		/*새로 향상된 foreach문*/
//		for (int arr : su) {
//			System.out.print(arr+" ");
//		}
	}

}
