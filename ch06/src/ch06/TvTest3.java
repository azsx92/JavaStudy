package ch06;
//�ν��Ͻ� ������ ���
class Tv3 {
	// Tv�� �Ӽ�(�������)
	String color; 					// ����
	boolean power ; 				//��������(on/off)
	int channel; 					//ä��
	
	//Tv�� ���(�޼���)
	void power() 		{power = !power;} //TV�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() 	{ ++channel;} 	  //TV�� ä���� ���̴� ����� �ϴ� �޼���
	void channelDown() 	{ --channel;} 	 //TV�� �Ѱų� ���� ����� �ϴ� �޼���
	
}

public class TvTest3 {
	public static void main(String[] args) { 
		Tv3 t1 = new Tv3();	//Tv t1; t1 = new Tv(); �� �������� ����
		Tv3 t2 = new Tv3();	
		System.out.println("t1�� ���� channel���� " + t1.channel + " �Դϴ�. ");
		System.out.println("t21�� ���� channel���� " + t2.channel + " �Դϴ�. ");
		
		t2 = t1; //t1�� �����ϰ� �ִ� �� (�ּ�)�� t2�� �����Ѵ�.
		t1.channel = 7; // Tv�ν��Ͻ��� ������� channel�� ����  7�� �Ѵ�.
		System.out.println("t1��  channel���� 7�� �����Ͽ����ϴ�.");
		
		System.out.println("t1��   channel���� " + t1.channel + " �Դϴ�. ");
		System.out.println("t21�� channel���� " + t2.channel + " �Դϴ�. ");
	}

}
