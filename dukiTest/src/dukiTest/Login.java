package dukiTest;

public class Login {
	private String name;
	private int age;
	
	Login() {
	}
	
	public Login(String name , int age) {
		this.name = name;
		this.age  = age;
		if("".equals(this.name)) {
			System.out.println("ȸ�������� �̸��� �ʼ� �Է»����Դϴ�.");
		} else {
			System.out.println("ȸ������" + "�̸� :" +this.name +"���� :" +this.age+" �Ͽ����ϴ�.");
		}
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void update(String name , int age) {
		this.name = name;
		this.age  = age;
		if("".equals(this.name)) {
			System.out.println("ȸ�������� �̸��� �ʼ� �Է»����Դϴ�.");
		} else {	
			System.out.println("ȸ������" + "�̸� :" +this.name +"���� :" +this.age+"�� ���� �Ͽ����ϴ�.");
		}
	}
	
	
}

