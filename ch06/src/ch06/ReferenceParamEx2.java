package ch06;
// 3.8 �⺻�� �Ű������� ������ �Ű����� 
/*
 * 
	�⺻�� �Ű����� : ������ ���� �б⸸ �Ѵ�.(read only) 
	������ �Ű����� : ������ ���� �а� ������ �� �ִ�.(read $ write) 
 * 
 *
 * */
class ReferenceParamEx2 {
	public static void main(String[] args) {
		int[] x =  {10}; // ũ�Ⱑ 1�� �迭. x[0] = 10;
		System.out.println("main() : x = " + x[0]);
		
		change(x);
		System.out.println("After change(x)");
		System.out.println("Main() : x = " + x[0]);
	}

	static void change(int[] x) { //������ �Ű�����
//		static void change(int x) {
		x[0] = 1000;

		System.out.println("change() : x =" + x[0]);
	}
}
