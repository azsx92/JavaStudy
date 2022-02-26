package ch07;
import static java.lang.System.out;
import static java.lang.Math.*;


class Card2 {
	final int NUMBER; //상수지만 선언과 함께 초기화 하지않고
	final String KIND;   //생성자에서 단 한번에 초기화 할 수 있다.
	Card2 (String kind, int num) {
//		매개변수로 넘겨받은 값으로 KIND와 NUMBER를 초기화한다.
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
		Card2 c = new Card2("HEART", 10); //생성자로 초기화 가능 
//		c.NUMBER = 5; //에러 인스턴스형식으로 초기화 불가능 
		
		out.println(c.KIND);
		out.println(c.NUMBER);
		out.println(c);
	}
}
