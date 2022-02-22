package ch06;
class BlockTestEX6_27 {
	static {
		System.out.println("static { }"); //클래스 초기화 블록
	}
	{
		System.out.println("{ }");        //인스턴스 초기화 블록
	}


	public BlockTestEX6_27() {
		System.out.println("생성자");
	}
	public static void main(String[] args) {
		System.out.println("BlockTestEX6_27 bt = new BlockTestEX6_27();");
		
		BlockTestEX6_27 bt = new BlockTestEX6_27();
		
		System.out.println("BlockTestEX6_27 bt2 = new BlockTestEX6_27();");
		BlockTestEX6_27 bt2 = new BlockTestEX6_27();
	}
}