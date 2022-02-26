package ch07;
final class Singletion {
	private static Singletion s = new Singletion();
	
	private Singletion() {
		
	}
	public  static Singletion getInstance() {
		if(s==null)
			s = new Singletion();
		return s;
	}
}

public class Ex7_14 {
	public static void main(String[] args) {
//		Singletion s = new Singletion();
		Singletion s = Singletion.getInstance();
	}
}
