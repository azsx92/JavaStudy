package ch07;

public class Ex7_3 {
	public static void main(String[] args) {
		Deck d = new Deck();    // 카드 한 벌(Deck)을 만든다.
		Card c = d.pick(0);     // 섞기 전에 제일 위의 카드를 뽑는다.
		System.out.println(c);  // System.out.println(c.toString);과 같다.
		
		d.Shuffle();            // 카드를 섞는다.
		c = d.pick(0);          // 섞은 후에 위의 카드를 뽑다.
		System.out.println(c);
	}
}

class Deck {
	final int CARD_NUM = 52; 			  //카드의 개수
	Card cardArr[] = new Card[CARD_NUM];  //Card객체 배열을 포함
	
	Deck() { //Deck의 카드를 초기화한다.
		int i=0;
		for(int k=Card.KIND_MAX; k > 0; k--)       //Card객체 배열을 포함
			for(int n =0; n < Card.KIND_MAX; n++)  //Card객체 배열을 포함
			   cardArr[i++] = new Card(k, n+1); 
	}
	
	Card pick() { //지정된 위치(index)에 있는 카드 하나를 꺼내서 반환
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}
	
	Card pick(int index) { //지정된 위치(index)에 있는 카드 하나를 꺼내서 반환
		return cardArr[index];
	}

	public void Shuffle() {
		for(int i=0; i < cardArr.length; i++) {
			int r = (int)(Math.random() * CARD_NUM);
			
			Card temp  = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}

} //Deck클래스의 꿈

class Card {
	
	static final int KIND_MAX = 4;  //카드 무늬의 수
	static final int NUM_MAX  = 13; // 무늬별 카드 수
	
	static final int SPADE    = 4;  
	static final int DIAMOND  = 3;  
	static final int HEART    = 2;
	static final int CLOVER   = 1;
	int kind;
	int number;
	
	Card() {
		this(SPADE, 1);
	}

	public Card(int kind, int number) {
		this.kind   = kind;
		this.number = number;
	}
	
	public String toString() {
		String[] kinds = {"", "CLOVER" , "HEART" , "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK"; //숫자 10로 X로 표현
		
		return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
	}// toString()의 끝
}// Card클래스의 끝 
	
