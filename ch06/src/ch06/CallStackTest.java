package ch06;
//6-7  262P
public class CallStackTest {
	public static void main(String[] args) {
		firstMethod(); //static�޼���� ��ü �������� ȣ���� �����ϴ�.
	}
	
	static void firstMethod() {
		secondMethod();
	}

	static void secondMethod() {
		System.out.println("secondMethod()");
		
	}
}
