package ch06;
//�ν��Ͻ� ������ ���
class Tv {
	// Tv�� �Ӽ�(�������)
	String color; 					// ����
	boolean power ; 				//��������(on/off)
	int channel; 					//ä��
	
	//Tv�� ���(�޼���)
	void power() 		{power = !power;} //TV�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() 	{ ++channel;} 	  //TV�� ä���� ���̴� ����� �ϴ� �޼���
	void channelDown() 	{ --channel;} 	 //TV�� �Ѱų� ���� ����� �ϴ� �޼���
	
}

public class TvTest2 {
	public static void main(String[] args) { 
		Tv t1 = new Tv();	//Tv t1; t1 = new Tv(); �� �������� ����
		Tv t2 = new Tv();	
		System.out.println("t1�� ���� channel���� " + t1.channel + " �Դϴ�. ");
		System.out.println("t21�� ���� channel���� " + t2.channel + " �Դϴ�. ");

		t1.channel = 7; // Tv�ν��Ͻ��� ������� channel�� ����  7�� �Ѵ�.
		System.out.println("t1��  channel���� 7�� �����Ͽ����ϴ�.");
		
		System.out.println("t1��   channel���� " + t1.channel + " �Դϴ�. ");
		System.out.println("t21�� channel���� " + t2.channel + " �Դϴ�. ");
	}

}
