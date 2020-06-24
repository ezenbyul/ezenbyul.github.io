package ex3;

public class Op1 {
	/*
		피연산자 : Operand		연산자 : Operator
	a + b => a 와 b는 Operand	+는 Operator
	*/
	public static void main(String[] args) {
		int x=0,y=0,z;
		x++;	// 단항
		//x+y;	// 이항
		//(x>0 ? "A" : "B";	삼항
		
		z=x+y;
		System.out.println("y=0일 때 x+y="+z);
		y=3;
		z=x-y;
		System.out.println("y=3일 때 x-y="+z);
		x=2;
		z=x/y;
		System.out.println("x=2, y=3 일때 x/y="+z);
		z=x*y;
		System.out.println("x=2, y=3 일때 x*y="+z);
		z=x%y;
		System.out.println("x=2, y=3 일때 x%y="+z);
	}
}
