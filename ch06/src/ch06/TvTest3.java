package ch06;
//인스턴스 생성과 사용
class Tv3 {
	// Tv의 속성(멤버변수)
	String color; 					// 색상
	boolean power ; 				//전원상태(on/off)
	int channel; 					//채널
	
	//Tv의 기능(메서드)
	void power() 		{power = !power;} //TV를 켜거나 끄는 기능을 하는 메서드
	void channelUp() 	{ ++channel;} 	  //TV를 채널을 높이는 기능을 하는 메서드
	void channelDown() 	{ --channel;} 	 //TV를 켜거나 끄는 기능을 하는 메서드
	
}

public class TvTest3 {
	public static void main(String[] args) { 
		Tv3 t1 = new Tv3();	//Tv t1; t1 = new Tv(); 한 문장으로 가능
		Tv3 t2 = new Tv3();	
		System.out.println("t1의 현재 channel값은 " + t1.channel + " 입니다. ");
		System.out.println("t21의 현재 channel값은 " + t2.channel + " 입니다. ");
		
		t2 = t1; //t1이 저장하고 있는 값 (주소)을 t2에 저장한다.
		t1.channel = 7; // Tv인스턴스의 멤버변수 channel의 값을  7로 한다.
		System.out.println("t1의  channel값은 7로 변경하였습니다.");
		
		System.out.println("t1의   channel값은 " + t1.channel + " 입니다. ");
		System.out.println("t21의 channel값은 " + t2.channel + " 입니다. ");
	}

}
