package ch06;
class BlockTestEX6_27 {
	static {
		System.out.println("static { }"); //Ŭ���� �ʱ�ȭ ���
	}
	{
		System.out.println("{ }");        //�ν��Ͻ� �ʱ�ȭ ���
	}


	public BlockTestEX6_27() {
		System.out.println("������");
	}
	public static void main(String[] args) {
		System.out.println("BlockTestEX6_27 bt = new BlockTestEX6_27();");
		
		BlockTestEX6_27 bt = new BlockTestEX6_27();
		
		System.out.println("BlockTestEX6_27 bt2 = new BlockTestEX6_27();");
		BlockTestEX6_27 bt2 = new BlockTestEX6_27();
	}
}