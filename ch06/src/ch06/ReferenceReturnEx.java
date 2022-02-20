package ch06;


//3.9 참조형 반환타입 
/*
* 
	반환타입이 '참조형'이라는 것은 메서드가 '객체의 주소'를  반환한다는 것을 의미한다.  
* 
*
* */
class Data3 {
	int x;
}

class ReferenceReturnEx {
	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		Data3 d2 = Copy(d);
		System.out.println("After change(d.x)");
		System.out.println("Main() : x = " + d2.x);
	}

	static Data3 Copy(Data3 d) { //참조형 매개변수
//		static void change(int x) {
		Data3 tmp = new Data3();
		tmp.x = d.x;

		return tmp;
	}
}