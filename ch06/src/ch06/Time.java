package ch06;
/*
 * 1. ��.��.��.�� ��� 0���� ũ�ų� ����.
 * 2. ���� ������ 0~23, �а� ���� ������ 0~59 �̴�.
 * */
public class Time {
	private int hour;
	private int minute;
	private int seconde;
	
	
	
	public int getHour() {return hour;}
	public int getMinute() {return minute;}
	public int getSeconde() {return seconde;}
	
	
	/*
	public void int setHour(int h) {
		if(h < 0 || h > 23) return;
		hour = h;
	}
	public void int setHour(int m) {
		if(m < 0 || h > 59) return;
		minute = m;
	}
	public void int setSeconde(int s) {
		if(s < 0.0f || s > 59.99f) return;
		seconde = s;
	}
	*/  
}
