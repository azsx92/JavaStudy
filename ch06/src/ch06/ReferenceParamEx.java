package ch06;
// 3.8 �⺻�� �Ű������� ������ �Ű����� 
/*
 * 
	�⺻�� �Ű����� : ������ ���� �б⸸ �Ѵ�.(read only) 
	������ �Ű����� : ������ ���� �а� ������ �� �ִ�.(read $ write) 
 * 
 *
 * */
class Data2 {
	int x;
}

class ReferenceParamEx {
	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d);
		System.out.println("After change(d.x)");
		System.out.println("Main() : x = " + d.x);
	}

	static void change(Data2 d) { //������ �Ű�����
//		static void change(int x) {
		d.x = 1000;

		System.out.println("change() : x =" + d.x);
	}
}
