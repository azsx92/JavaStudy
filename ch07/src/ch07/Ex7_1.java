package ch07;
//��Ӥ�(inheritance)
/*
 * �ڼ� Ŭ������ �ν��Ͻ��� �����ϸ� ���� Ŭ������ ����� �ڼ� Ŭ������ ����� ������ �ϳ��� �ν��Ͻ��� �����ȴ�.
 * */
class Tv {
	boolean power; // ���� ����(on/off)
	int channel;   // ä��
	
	void power() { power = !power; };
	void channelUp()   { ++channel; };
	void channelDown() { --channel; };
}


class CaptionTv extends Tv {
	boolean caption; //ĸ�ǻ���(on/off);
	void displayCaption (String text) {
		if (caption) {	// ĸ�� ���°� on(true)�� ���� text�� �����ش�.
			System.out.println(text);
		}
	}
}


class Ex7_1 {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		
		ctv.channel = 10;		//���� Ŭ�����κ��� ��۹��� ���
		ctv.channelUp();		//���� Ŭ�����κ��� ��ӹ��� ���
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello , World");
		ctv.caption = true;   //ĸ��(�ڸ�) ����� �Ҵ�. 
		ctv.displayCaption("Hello , World");
		
	}
}