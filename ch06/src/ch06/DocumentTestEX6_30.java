package ch06;
//6.4 멤버변수의 초기화 시기와 순서
/*
 * 클래스변수의 초기화 시점 클래스가 처음 로딩될 때 단 한번 초기화된다.
 * 인스턴스변수의 초기화시점 인스턴스가 생성될 때마다 각 인스턴스별로 초기화가 이루어진다.
 * 
 * 클래스변수의 초기화순서 기본값-> 명시적초기화 -> 클래스초기화블럭
 * 인스턴스변수의 초기화순서 기본값-> 명시적초기화 -> 인스턴스초기화블럭 -> 생성자
 * */
class DocumentTestEX6_30 {
	static int count = 0; 	//생성된 인스턴스의 수를 저장하기 위한 변수
	String name; 			//문서명 (Document name)
	
	DocumentTestEX6_30() { //문서 생성시 문서명을 지정하지 않았을 때
		this("제목없음" + ++count);
	}
	
	DocumentTestEX6_30(String name) {
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성되었습니다.");
	};
	
	public static void main(String[] args) {
		DocumentTestEX6_30 p1 = new DocumentTestEX6_30();
		DocumentTestEX6_30 p2 = new DocumentTestEX6_30("자바.txt");
		DocumentTestEX6_30 p3 = new DocumentTestEX6_30();
		DocumentTestEX6_30 p4 = new DocumentTestEX6_30();
	}
}

