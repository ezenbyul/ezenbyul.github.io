package ex3;

public class Op1 {
	/*
		�ǿ����� : Operand		������ : Operator
	a + b => a �� b�� Operand	+�� Operator
	*/
	public static void main(String[] args) {
		int x=0,y=0,z;
		x++;	// ����
		//x+y;	// ����
		//(x>0 ? "A" : "B";	����
		
		z=x+y;
		System.out.println("y=0�� �� x+y="+z);
		y=3;
		z=x-y;
		System.out.println("y=3�� �� x-y="+z);
		x=2;
		z=x/y;
		System.out.println("x=2, y=3 �϶� x/y="+z);
		z=x*y;
		System.out.println("x=2, y=3 �϶� x*y="+z);
		z=x%y;
		System.out.println("x=2, y=3 �϶� x%y="+z);
	}
}
