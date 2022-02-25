package ch07;

public class Ex7_3 {
	public static void main(String[] args) {
		Deck d = new Deck();    // ī�� �� ��(Deck)�� �����.
		Card c = d.pick(0);     // ���� ���� ���� ���� ī�带 �̴´�.
		System.out.println(c);  // System.out.println(c.toString);�� ����.
		
		d.Shuffle();            // ī�带 ���´�.
		c = d.pick(0);          // ���� �Ŀ� ���� ī�带 �̴�.
		System.out.println(c);
	}
}

class Deck {
	final int CARD_NUM = 52; 			  //ī���� ����
	Card cardArr[] = new Card[CARD_NUM];  //Card��ü �迭�� ����
	
	Deck() { //Deck�� ī�带 �ʱ�ȭ�Ѵ�.
		int i=0;
		for(int k=Card.KIND_MAX; k > 0; k--)       //Card��ü �迭�� ����
			for(int n =0; n < Card.KIND_MAX; n++)  //Card��ü �迭�� ����
			   cardArr[i++] = new Card(k, n+1); 
	}
	
	Card pick() { //������ ��ġ(index)�� �ִ� ī�� �ϳ��� ������ ��ȯ
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}
	
	Card pick(int index) { //������ ��ġ(index)�� �ִ� ī�� �ϳ��� ������ ��ȯ
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

} //DeckŬ������ ��

class Card {
	
	static final int KIND_MAX = 4;  //ī�� ������ ��
	static final int NUM_MAX  = 13; // ���̺� ī�� ��
	
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
		String numbers = "0123456789XJQK"; //���� 10�� X�� ǥ��
		
		return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
	}// toString()�� ��
}// CardŬ������ �� 
	
