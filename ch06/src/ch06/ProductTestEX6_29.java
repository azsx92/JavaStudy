package ch06;
//6.4 멤버변수의 초기화 시기와 순서
/*
 * 클래스변수의 초기화 시점 클래스가 처음 로딩될 때 단 한번 초기화된다.
 * 인스턴스변수의 초기화시점 인스턴스가 생성될 때마다 각 인스턴스별로 초기화가 이루어진다.
 * 
 * 클래스변수의 초기화순서 기본값-> 명시적초기화 -> 클래스초기화블럭
 * 인스턴스변수의 초기화순서 기본값-> 명시적초기화 -> 인스턴스초기화블럭 -> 생성자
 * */
class ProductTestEX6_29 {
	static int count = 0; //생성된 인스턴스의 수를 저장하기 위한 변수
	int serialNo;          //인스턴스 고유의 번호
	
	{
		++count;
		serialNo = count; // Product의 인스턴스가 생성될 때마다  count의 값을 1씩 증가시켜서 seriaNo에 저장한다.
	}
	public ProductTestEX6_29() {}; 
	
	public static void main(String[] args) {
		ProductTestEX6_29 p1 = new ProductTestEX6_29();
		ProductTestEX6_29 p2 = new ProductTestEX6_29();
		ProductTestEX6_29 p3 = new ProductTestEX6_29();
		
		System.out.println("p1의 제품번호(serial no)는 " + p1.serialNo);
		System.out.println("p2의 제품번호(serial no)는 " + p2.serialNo);
		System.out.println("p3의 제품번호(serial no)는 " + p3.serialNo);
		System.out.println("생성된 제품의 수는 모두 "+ DocumentTestEX6_30.count + "개 입니다.");
	}
}

