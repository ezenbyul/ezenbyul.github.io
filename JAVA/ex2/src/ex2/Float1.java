package ex2;

public class Float1 {
	public static void main(String[] args) {
		
		float f1 = 3.14f;
		float f2 = 3.14E-8f;
		float r = 100;
		float area = r*r*f1;	// 원의 넓이
		float length = r*2*f1;	// 원의 둘레
		
		System.out.println("반지름이 "+r+"인 원의 넓이는 "+area+"이며,둘레는 "+length);		
	}
}
