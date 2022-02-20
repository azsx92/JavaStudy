package ch06;
// 6-5 : 1. 변수와 메서드 , 1-1 실습예제를 통해 익히기 

/*
 * 인스턴스변수는 인스턴스가 생성될 때 마다 생성되므로 인스턴스마다 각기 다른 값을 유지 할 수 있지만,
 * 클래스 변수는 인스턴스가 하나의 저장공간을 공유하므로, 항상 공통된 값을 갖는다.
 * */
public class CardTest {
	
	public static void main(String[] args) {
		System.out.println("Card.width =" + Card.width);
		System.out.println("Card.height =" + Card.height);
//		Card.height : 클래스변수(static 변수)는 객체생성없이 '클래스(이름.클래스변수'로 직접 사용 가능하다.)
		
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";  //인스턴스 값을 변경한다. 
		c2.number = 4;		//인스턴스 값을 변경한다.
		
		
		System.out.println("c1은" + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2은" + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
		System.out.println("c1의 width와 height를 각각 50 , 80으로 변경합니다." );
		
		c1.width  = 50; //클래스 값을 변경한다. 
		c1.height = 80; //클래스 값을 변경한다. 
		
		
		System.out.println("c1은" + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2은" + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
	}
}

class Card {
	String kind;
	int number;
	static int width  = 100;
	static int height = 250;
	
}