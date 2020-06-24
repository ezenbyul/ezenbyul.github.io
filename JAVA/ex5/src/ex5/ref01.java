package ex5;

public class ref01 {

	public static void main(String[] args) {
		
		int age1 = 32,age2 = 10,age3 = 10, age4;
		double price1 = 3000,price2,price3;
		//참조 변수 : 객체형 저장소 - null값을 허용하므로 초기화가 필요하지만 생략 가능
		String name1="김기태";
		String name2 ="김", name3 ="김", name4="기";
		
		if(age2==age3) {System.out.println("age2=age3");}
		if(name2==name3) {System.out.println("name2=name3");}
		if(name2==name4) {System.out.println("name2=name4");}
		

		//객체타입 인스턴트명 = new 객체생성자함수()
		String n1 = new String("김기태");
		String n2 = new String("김기태");
		
		if(n1==n2) {System.out.println("서로 같다.");}
		if(n1!=n2) {System.out.println("서로 같지 않다.");}
		//기본 변수는 값이 같으면 같은것으로 인식
		//참조 변수는 값이 같아도 다른것으로 인식

		// equals는 메소드이다. 객체끼리의 내용을 비교 할 수 있다. ( CBR Call By Reference )		
		boolean res = n1.equals(n2); // 참조 변수의 값 비교 = 인스턴트명1.equals(인스턴트명2)
		if(res) {System.out.println("n=n1");}
	}

}
