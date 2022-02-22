package ch06;


class MyMath3 {
	long a, b;
	
	//인스턴스변수 a,b인을만들 이용해서 작업하므로 매개변수가 필요없다.
	long add()      { return a + b;} //a , b는 인스턴스변수
	long subtract() { return a - b;} //a , b는 인스턴스변수
	long multply()  { return a * b;} //a , b는 인스턴스변수
	double duvide() { return a / b;} //a , b는 인스턴스변수

	//인스턴스변수 a,b인을만들 이용해서 작업하므로 매개변수가 필요없다.
	static long   add(long a, long b)       		{ return a + b;} //a , b는 인스턴스변수
	static long   subtract(long a, long b)  		{ return a - b;} //a , b는 인스턴스변수
	static long   multply(long a, long b)   		{ return a * b;} //a , b는 인스턴스변수
	static double duvide(double a, double b) 		{ return a / b;} //a , b는 인스턴스변수
}
public class MyMathTest2_Ex_6_19 {
	public static void main(String[] args) {
		//클래스메서드 호출 , 인스턴스 생성없이 호출가능
		System.out.println(MyMath3.add(200L, 100L));
		System.out.println(MyMath3.subtract(200L, 100L));
		System.out.println(MyMath3.multply(200L, 100L));
		System.out.println(MyMath3.duvide(200.0, 100.0));
		
		
		MyMath3 mm = new MyMath3(); //인스턴스 생성
		mm.a = 200L;
		mm.b = 100L;
		// 인스턴스메서드는 객체생성 후에만 호출이 가능함.
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multply());
		System.out.println(mm.duvide());
		
	}
}
