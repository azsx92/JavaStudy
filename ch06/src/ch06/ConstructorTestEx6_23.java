package ch06;
// �⺻ �����ڰ� �����Ϸ��� ���ؼ� �߰��Ǵ� ���� Ŭ������ ���ǵ� �����ڰ� �ϳ��� ���� �� ���̴�. 
class DataS1 {
	int value;
}

class DataS2 { //�Ű������� �ִ� ������
	int value;
	
	DataS2() {};
	
	DataS2(int x) {
		value = x;
	}
}

public class ConstructorTestEx6_23 {
	public static void main(String[] args) {
		DataS1 d1 = new DataS1(); 
		DataS2 d2 = new DataS2();  //compile error�߻� 
//		DataS2 d2 = new DataS2(10);  //compile error�߻� 
	}
}
