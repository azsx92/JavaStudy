package ch06;
// 기본 생성자가 컴파일러에 의해서 추가되는 경우는 클래스에 정의된 생성자가 하나도 없을 때 뿐이다. 
class DataS1 {
	int value;
}

class DataS2 { //매개변수가 있는 생성자
	int value;
	
	DataS2() {};
	
	DataS2(int x) {
		value = x;
	}
}

public class ConstructorTestEx6_23 {
	public static void main(String[] args) {
		DataS1 d1 = new DataS1(); 
		DataS2 d2 = new DataS2();  //compile error발생 
//		DataS2 d2 = new DataS2(10);  //compile error발생 
	}
}
