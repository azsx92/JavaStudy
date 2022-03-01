package ch07;

public class Ex7_28 {
	public static void main(String[] args) {
		A2 a = new A2();
		a.autoPlay(new B2());  //void autoPlay( I i ) 호출
		a.autoPlay(new C());   //void autoPlay( I i ) 호출ㅓ
	}
}
interface I {
	public abstract void play();
}

class A2 {
	void autoPlay( I i ) {
		i.play();
	}
}

class B2 implements I {
	public void play() {
		System.out.println("play in B class");
	}
}

class C implements I {
	public void play() {
		System.out.println("play in C class");
	}
}