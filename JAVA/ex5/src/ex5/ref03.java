package ex5;

public class ref03 {
	public static void main(String[] args) {
		//Array �� �̿��� for��
		int[] arr1 = {10,20,30};
		int[] arr2 = new int[5];
		int[] arr3 = new int[]{5,50}; // lenght(2) , 5,50
		for(int i = 0 ; i <arr3.length;i++) {
		System.out.println(arr3[i]);
		}
//		System.arraycopy(src, srcPos, dest, destPos, length);
//		System.arraycopy(������ü��, ������ü�����ε���, ���纻��ü��, ���纻��ü�����ε���, ����);
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		for(int i = 0 ; i <arr2.length ; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		for (int su : arr2) {
			System.out.print(su+" ");
		}
	}
}
