package ch06;


//3.9 ������ ��ȯŸ�� 
/*
* 
	��ȯŸ���� '������'�̶�� ���� �޼��尡 '��ü�� �ּ�'��  ��ȯ�Ѵٴ� ���� �ǹ��Ѵ�.  
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

	static Data3 Copy(Data3 d) { //������ �Ű�����
//		static void change(int x) {
		Data3 tmp = new Data3();
		tmp.x = d.x;

		return tmp;
	}
}