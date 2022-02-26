package ch07;
import static java.lang.System.out;
import static java.lang.Math.*;


class Card2 {
	final int NUMBER; //������� ����� �Բ� �ʱ�ȭ �����ʰ�
	final String KIND;   //�����ڿ��� �� �ѹ��� �ʱ�ȭ �� �� �ִ�.
	Card2 (String kind, int num) {
//		�Ű������� �Ѱܹ��� ������ KIND�� NUMBER�� �ʱ�ȭ�Ѵ�.
		this.KIND = kind;
		this.NUMBER = num;
		
	}
	
	Card2() {
		this("HEART" , 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}
public class Ex7_12 {
	public static void main(String[] args) {
		Card2 c = new Card2("HEART", 10); //�����ڷ� �ʱ�ȭ ���� 
//		c.NUMBER = 5; //���� �ν��Ͻ��������� �ʱ�ȭ �Ұ��� 
		
		out.println(c.KIND);
		out.println(c.NUMBER);
		out.println(c);
	}
}
