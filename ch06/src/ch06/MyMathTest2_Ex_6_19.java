package ch06;


class MyMath3 {
	long a, b;
	
	//�ν��Ͻ����� a,b�������� �̿��ؼ� �۾��ϹǷ� �Ű������� �ʿ����.
	long add()      { return a + b;} //a , b�� �ν��Ͻ�����
	long subtract() { return a - b;} //a , b�� �ν��Ͻ�����
	long multply()  { return a * b;} //a , b�� �ν��Ͻ�����
	double duvide() { return a / b;} //a , b�� �ν��Ͻ�����

	//�ν��Ͻ����� a,b�������� �̿��ؼ� �۾��ϹǷ� �Ű������� �ʿ����.
	static long   add(long a, long b)       		{ return a + b;} //a , b�� �ν��Ͻ�����
	static long   subtract(long a, long b)  		{ return a - b;} //a , b�� �ν��Ͻ�����
	static long   multply(long a, long b)   		{ return a * b;} //a , b�� �ν��Ͻ�����
	static double duvide(double a, double b) 		{ return a / b;} //a , b�� �ν��Ͻ�����
}
public class MyMathTest2_Ex_6_19 {
	public static void main(String[] args) {
		//Ŭ�����޼��� ȣ�� , �ν��Ͻ� �������� ȣ�Ⱑ��
		System.out.println(MyMath3.add(200L, 100L));
		System.out.println(MyMath3.subtract(200L, 100L));
		System.out.println(MyMath3.multply(200L, 100L));
		System.out.println(MyMath3.duvide(200.0, 100.0));
		
		
		MyMath3 mm = new MyMath3(); //�ν��Ͻ� ����
		mm.a = 200L;
		mm.b = 100L;
		// �ν��Ͻ��޼���� ��ü���� �Ŀ��� ȣ���� ������.
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multply());
		System.out.println(mm.duvide());
		
	}
}
